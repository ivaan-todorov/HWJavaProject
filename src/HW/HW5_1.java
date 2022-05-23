package HW;

public class HW5_1 {


    //Задача №1
    //
    //Необходимо написать 4 метода:
    //сложение 2х чисел
    //вычитание 2х чисел
    //умножение 2х чисел
    //деление 2х чисел
    public static void addition(double a, double b) {

        double result = a + b;
        System.out.println(result);
    }

    public static void subtraction(double a, double b) {

        double result = a - b;
        System.out.println(result);
    }

    public static void multiplication(double a, double b) {

        double result = a * b;
        System.out.println(result);
    }

    public static void division(double a, double b) {

        double result = a / b;
        System.out.println(result);
    }

    public static void main(String[] args) {

        double a = 13;
        double b = 76;

        addition(a, b);
        subtraction(a, b);
        multiplication(a, b);
        division(a, b);




    }


}
