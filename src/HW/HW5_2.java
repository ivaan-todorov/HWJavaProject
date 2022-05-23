package HW;

import javax.swing.plaf.IconUIResource;

public class HW5_2 {

    public static void main(String[] args) {

        //1
        for (int i = 0; i < 10; i++) {
            for (int j = 10, count = -1; j > i; j--) {
                count++;
                System.out.print(count + " ");
            }
            System.out.println();
        }


        //2
        for (int i = 0; i < 10; i++) {

            for (int q = 0; q < i; q++) {
                System.out.print("  ");
            }

            for (int j = 10, count = -1; j > i; j--) {
                count++;
                System.out.print(count + " ");
            }

            System.out.println();
        }


        /*
 9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
   8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
      7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
         6 5 4 3 2 1 0 1 2 3 4 5 6
            5 4 3 2 1 0 1 2 3 4 5
               4 3 2 1 0 1 2 3 4
                  3 2 1 0 1 2 3
                     2 1 0 1 2
                        1 0 1
                           0
        */


        //3
        for (int i = 9; i >= 0; i--) {
            for (int j = i; j < 9; j++) {
                System.out.print("  ");
            }

            for (int j = i; j >= 0; j--) {
                System.out.print(j);
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }





    }
}
