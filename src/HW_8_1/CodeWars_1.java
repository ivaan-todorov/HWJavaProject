package HW_8_1;

import java.util.Locale;

public class CodeWars_1 {

        public static String abbrevName(String name) {
            char firstChar = 0;
            char secondChar = 0;

            for (int i = 0; i < name.length(); i++) {
                if (i == 0) {
                    firstChar = name.charAt(i);
                }
                if (name.indexOf(" ") == i - 1) {
                    secondChar = name.charAt(i);
                }
            }
            String result = firstChar + "." + secondChar;

            return result.toUpperCase();
        }


        public static boolean feast(String beast, String dish) {

            if (beast.charAt(0) == dish.charAt(0) && beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1)) {

                return true;
            }

            return false;
        }

        public static String tripleTrouble(String one, String two, String three) {

            String result = "";
            for (int i = 0; i < one.length(); i++) {
                result += one.charAt(i) + "" + two.charAt(i) + "" + three.charAt(i);
            }

            return result;
        }

        public static String position(char alphabet) {
            String result = "Position of alphabet: ";
            int count = alphabet - 96;

            return result + count;
        }

        public static int arrayPlusArray(int[] arr1, int[] arr2) {
            int result = 0;
            for (int i = 0; i < arr1.length; i++) {
                result += arr1[i];
            }
            for (int i = 0; i < arr2.length; i++) {
                result += arr2[i];
            }

            return result;
        }





}
