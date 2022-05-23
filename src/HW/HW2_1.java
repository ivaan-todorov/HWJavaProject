package HW;

public class HW2_1 {

    public static void main(String[] args) {

        int a = 693;
        int b = 389;

        //сложение, умножение, вычитание, деление и остаток от деления.
        // Так же сделать проверку на четность этих переменных и вывести результат.

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println((a + 0.0) / b);
        System.out.println(a * b);
        System.out.println(a % b);

        System.out.println("a - Чет неЧет: " + a % 2 + "\n" + "b - Чет неЧет: " + b % 2);


    }
}
