package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Life");
        stringBuilder.append(" is good");
        stringBuilder.append(" when you are happy");

        stringBuilder.delete(1,2);

        System.out.println(stringBuilder.capacity());
    }

}
