package com.kodilla.kalkulator;

public class Calculator {

    static void add(int a, int b){
        System.out.println(a+"+"+b+"="+(a+b));
    }
    static void subtract(int a, int b){
        System.out.println(a+"-"+b+"="+(a-b));
    }

    public static void main(String[] args) {
        add(5,2);
        subtract(5,2);
        System.out.println("test");
    }
}
