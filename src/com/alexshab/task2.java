package com.alexshab;

public class task2 {
    public static void main(String[] args) {
    }

    public static String string() {
        StringBuilder value = new StringBuilder();
        for (int i = 1; i <= 99; i++)
            if ((i % 5 == 0) && (i % 3 == 0)) {
                value.append(" HelloWorld ");
            } else if (i % 3 == 0) {
                value.append(" Hello ");
            } else if (i % 5 == 0) {
                value.append(" World ");
            } else {
                value.append(" ").append(i).append(" ");
            }
        return value.toString();
    }
}








