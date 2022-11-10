package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("Calculator for base calculations");
        System.out.println("Version 1.0");
        int a = 8;
        int b = 2;
        int c = add(a, b);
        System.out.println(c);
        int d = multiply(a, b);
        System.out.println(d);
        int e = sub(a, b);
        System.out.println(e);
        double f = div(a, b);             //double вместо int что бы не терять дробную часть
        System.out.println(f);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int sub(int a, int b){
        return a - b;
    }

    private static double div(double a, double b){
        return a / b;
    }
}
