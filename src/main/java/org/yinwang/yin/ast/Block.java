package org.yinwang.yin.ast;

import java.util.ArrayList;
import java.util.List;


public class Block extends Node {
    public List<Node> statements = new ArrayList<>();


    public Block(List<Node> statements, String file, int start, int end, int line, int col) {
        super(file, start, end, line, col);
        this.statements = statements;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        String sep = statements.size() > 5 ? "\n" : " ";
        sb.append("(seq" + sep);

        for (int i = 0; i < statements.size(); i++) {
            sb.append(statements.get(i).toString());
            if (i != statements.size() - 1) {
                sb.append(sep);
            }
        }

        sb.append(sep + ")");
        return sb.toString();
    }
}
