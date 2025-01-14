package org.example.AST;

public class LoadExprNode extends OtherExpressionsNode {
    private String filename;

    public LoadExprNode(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }
}
