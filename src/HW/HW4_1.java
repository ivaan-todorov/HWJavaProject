package HW;

import java.util.Arrays;

public class HW4_1 {

    public static void main(String[] args) {

        String line = "_______________";

        //1
        System.out.println(line);

        int[] arr1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        System.out.println(Arrays.stream(arr1).sum());

        System.out.println("or");
        int sum1 = 0;

        for (int i = 0; i < arr1.length; i++) {
            sum1 = sum1 + arr1[i];
        }
        System.out.println(sum1);

        System.out.println(line);


        //2
        int[] arr2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        System.out.println(Arrays.stream(arr2).max());

        System.out.println("or");

        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < arr2.length; i++) {
            if (max2 < arr2[i]) {
                max2 = arr2[i];
            }
        }
        System.out.println(max2);

        System.out.println(line);

        //3
        int[] arr3 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        System.out.println(Arrays.stream(arr3).min());

        System.out.println("or");

        int min3 = Integer.MAX_VALUE;

        for (int i = 0; i < arr3.length; i++) {
            if (min3 > arr3[i]) {
                min3 = arr3[i];
            }
        }
        System.out.println(min3);

        System.out.println(line);

        //4
        int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum4 = Arrays.stream(arr4).sum();

        int result4 = sum4 / arr4.length;
        System.out.println(result4);

        System.out.println("or");
        sum4 = 0;

        for (int i = 0; i < arr4.length; i++){
            sum4 = sum4 + arr4[i];
        }
        System.out.println(sum4 / arr4.length);

        System.out.println(line);

        //5
        int[][] arr5 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum5 = 0;

        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arr5[i].length; j++) {
                sum5 += arr5[i][j];
            }
        }
        System.out.println(sum5);

        System.out.println(line);

        //6
        int[][] arr6 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int max6 = Integer.MIN_VALUE;


        for (int i = 0; i < arr6.length; i++) {
            for (int j = 0; j < arr6[i].length; j++) {
                if (arr6[i][j] > max6) {
                    max6 = arr6[i][j];
                }
            }
        }
        System.out.println(max6);

        System.out.println(line);


        //7
        int[][] arr7 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int result7 = 0;

        for (int i = 0; i < arr7.length; i++) {
            result7 += arr7[i].length;
        }
        System.out.println(result7);

        System.out.println(line);




    }
}
