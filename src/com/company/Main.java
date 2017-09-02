package com.company;

public class Main {

    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        System.out.println(x);
        System.out.println(y);
        for (int i = 2; i < 10; i++) {
            int temp = x + y;
            System.out.println(temp);
            x = y;
            y = temp;
        }
    }
}
