package app;

public class Main {

    static int a;
    static int b;
    static int c;
    static int d;
    static int e;
    static double f;

    // количество переменных можно уменьшить
    // оставил отдельные переменные для каждой операции
    // и структуру метода main, как в импортированном образце с GitHub

    public static void main(String[] args) {
        System.out.println("Calculator for base calculations");
        System.out.println("Version 1.0");
        a = 8;
        b = 2;
        c = add(a, b);
        System.out.println(c);
        d = multiply(a, b);
        System.out.println(d);
        e = sub(a, b);
        System.out.println(e);
        f = div(a, b);             //double вместо int что бы не терять дробную часть
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
