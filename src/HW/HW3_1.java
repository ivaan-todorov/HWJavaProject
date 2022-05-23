package HW;

public class HW3_1 {

    public static void main(String[] args) {

//        //Задача 1
//        int a = 10;
//        int b = 17;
//
//        if (a == b) {
//            System.out.println("a == b");
//        } else if (a > b){
//            System.out.println("a > b");
//        } else {
//            System.out.println("a < b");
//        }


//        //Задача 2
//        int a = 13;
//        int b = 7;
//
//        if (((a + b) % 2) == 0) {
//            System.out.println("maybe a and b are even");
//        } else {
//            System.out.println("some variable is odd");
//        }


        //Задача 3
        int x = 10;

        /*
         больше 10 - если переменная больше 10
        меньше 100 - если переменная меньше 100
        результат деления на 2 больше 20 - если это соответствует истине
        значение переменной между 5 и 40 включительно - если это правда
        значение переменной меньше 5 или больше 40 - если предыдущие условие ложное
        */

        if (x > 10) {
            System.out.println("больше 10");
        }

        if (x < 100) {
            System.out.println("меньше 100");
        }

        if (x / 2.0 > 20) {
            System.out.println("результат деления на 2 больше 20");
        }

        if (x > 5 || x < 40) {
            System.out.println("значение переменной больше 5 или меньше 40");
        } else {
            System.out.println("значение переменной меньше 5 или больше 40");
        }


    }
}
