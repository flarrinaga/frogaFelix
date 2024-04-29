package com.myapp;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, Maven Java Project!");
        System.out.println("Factorial of 5 is: " + factorial(5));
    }
    //function factorial
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}