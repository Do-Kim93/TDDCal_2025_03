package org.example;

class Main {
    public static void main(String[] args) {
        String exp = "-(9 + 1) * -(8 + 2) + 5";

        int startPos = 0;
        int endPos = 7;

        String head = exp.substring(0, startPos);
        String body = "(" + exp.substring(startPos + 1, endPos + 1) + " * -1)";
        String tail = exp.substring(endPos + 1);

        System.out.println("head : " + head);
        System.out.println("body : " + body);
        System.out.println("tail : " + tail);

        System.out.printf("exp : " );
        System.out.printf(head);
        System.out.printf(body);
        System.out.printf(tail);
    }
}