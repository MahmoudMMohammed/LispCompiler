package org.example.AST;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Evaluator {
    private Map<String, Object> environment = new HashMap<>();

    public Object evaluate(ASTNode node) {
        if (node instanceof AtomNode) {
            return evaluateAtom((AtomNode) node);
        } else if (node instanceof ListNode) {
            return evaluateList((ListNode) node);
        } else if (node instanceof FunctionCallNode) {
            return evaluateFunctionCall((FunctionCallNode) node);
        } else if (node instanceof SpecialFormNode) {
            return evaluateSpecialForm((SpecialFormNode) node);
        }
        throw new UnsupportedOperationException("Cannot evaluate node type: " + node.getClass().getName());
    }

    private Object evaluateAtom(AtomNode node) {
        String value = node.getValue();
        if (value.matches("-?\\d+(\\.\\d+)?")) {
            return Double.parseDouble(value);
        }
        if (environment.containsKey(value)) {
            return environment.get(value);
        }
        throw new RuntimeException("Undefined variable: " + value);
    }

    private Object evaluateList(ListNode node) {
        List<Object> evaluatedElements = new ArrayList<>();
        for (ASTNode element : node.getElements()) {
            evaluatedElements.add(evaluate(element));
        }
        return evaluatedElements;
    }

    private Object evaluateFunctionCall(FunctionCallNode node) {
        String functionName = node.getFunctionName();
        List<Object> arguments = new ArrayList<>();
        for (ASTNode arg : node.getArguments()) {
            arguments.add(evaluate(arg));
        }
        switch (functionName) {
            case "+":
                return arguments.stream().mapToDouble(arg -> (Double) arg).sum();
            case "-":
                return arguments.stream().mapToDouble(arg -> (Double) arg).reduce((a, b) -> a - b).orElse(0.0);
            case "*":
                return arguments.stream().mapToDouble(arg -> (Double) arg).reduce((a, b) -> a * b).orElse(1.0);
            case "/":
                return arguments.stream().mapToDouble(arg -> (Double) arg).reduce((a, b) -> a / b).orElse(1.0);
            default:
                throw new RuntimeException("Unknown function: " + functionName);
        }
    }

    private Object evaluateSpecialForm(SpecialFormNode node) {
        if (node instanceof IfFormNode) {
            return evaluateIfForm((IfFormNode) node);
        } else if (node instanceof DefunFormNode) {
            return evaluateDefunForm((DefunFormNode) node);
        } else if (node instanceof DefparameterFormNode) {
            return evaluateDefparameterForm((DefparameterFormNode) node);
        } else if (node instanceof LetFormNode) {
            return evaluateLetForm((LetFormNode) node);
        } else if (node instanceof LambdaFormNode) {
            return evaluateLambdaForm((LambdaFormNode) node);
        } else if (node instanceof QuoteFormNode) {
            return ((QuoteFormNode) node).getQuotedExpression();
        } else if (node instanceof SetqFormNode) {
            return evaluateSetqForm((SetqFormNode) node);
        } else if (node instanceof FuncallFormNode) {
            return evaluateFuncallForm((FuncallFormNode) node);
        }
        throw new RuntimeException("Unhandled special form: " + node.getClass().getName());
    }

    private Object evaluateIfForm(IfFormNode node) {
        boolean condition = (Boolean) evaluate(node.getCondition());
        return condition ? evaluate(node.getTrueBranch()) : evaluate(node.getFalseBranch());
    }

    private Object evaluateDefunForm(DefunFormNode node) {
        environment.put(node.getFunctionName(), node);
        return null;
    }

    private Object evaluateDefparameterForm(DefparameterFormNode node) {
        Object value = evaluate(node.getValue());
        environment.put(node.getParameterName(), value);
        return value;
    }
    private Object evaluateLetForm(LetFormNode node) {
        Map<String, Object> localEnvironment = new HashMap<>(environment);
        for (Map.Entry<String, ASTNode> binding : node.getBindings()) {
            String varName = binding.getKey();
            Object value = evaluate(binding.getValue());
            localEnvironment.put(varName, value);
        }
        // Temporarily switch to local environment for evaluating the body
        Map<String, Object> previousEnvironment = environment;
        environment = localEnvironment;
        Object result;
        try {
            result = evaluate(node.getBody());
        } finally {
            // Restore the original environment
            environment = previousEnvironment;
        }
        return result;
    }

    private Object evaluateLambdaForm(LambdaFormNode node) {
        return new LambdaFunction(node.getParameters(), node.getBody(), new HashMap<>(environment));
    }

    private Object evaluateSetqForm(SetqFormNode node) {
        Object value = evaluate(node.getValue());
        environment.put(node.getVariableName(), value);
        return value;
    }

    private Object evaluateFuncallForm(FuncallFormNode node) {
        Object function = evaluate(node.getFunction());
        if (function instanceof LambdaFunction) {
            LambdaFunction lambda = (LambdaFunction) function;
            List<String> parameters = lambda.getParameters();
            List<Object> arguments = new ArrayList<>();
            for (ASTNode argument : node.getArguments()) {
                arguments.add(evaluate(argument));
            }
            if (parameters.size() != arguments.size()) {
                throw new RuntimeException("Argument count mismatch: expected " +
                        parameters.size() + " but got " + arguments.size());
            }
            Map<String, Object> lambdaEnvironment = new HashMap<>(lambda.getEnvironment());
            for (int i = 0; i < parameters.size(); i++) {
                lambdaEnvironment.put(parameters.get(i), arguments.get(i));
            }
            // Temporarily switch to the lambda's environment for evaluation
            Map<String, Object> previousEnvironment = environment;
            environment = lambdaEnvironment;
            Object result;
            try {
                result = evaluate(lambda.getBody());
            } finally {
                // Restore the original environment
                environment = previousEnvironment;
            }
            return result;
        } else {
            throw new RuntimeException("Attempt to call a non-function: " + function);
        }
    }
    // Define the LambdaFunction class to encapsulate lambda forms
    private static class LambdaFunction {
        private final List<String> parameters;
        private final ASTNode body;
        private final Map<String, Object> environment;

        public LambdaFunction(List<String> parameters, ASTNode body, Map<String, Object> environment) {
            this.parameters = parameters;
            this.body = body;
            this.environment = environment;
        }

        public List<String> getParameters() {
            return parameters;
        }

        public ASTNode getBody() {
            return body;
        }

        public Map<String, Object> getEnvironment() {
            return environment;
        }
    }
}

