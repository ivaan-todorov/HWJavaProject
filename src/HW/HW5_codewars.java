package HW;

public class HW5_codewars {

    public static boolean isLove(final int flower1, final int flower2) {
        boolean love;

        if (flower1 % 2 == 0 && flower2 % 2 != 0) {
             love = true;
        } else {
            love = false;
        }

        return love;
    }

    public static String numberToString(int num) {
        // Return a string of the number here!
        return Integer.toString(num);
    }

    public static int findSmallestInt(int[] args) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < args.length; i++) {
            if (args[i] < min) {
                min = args[i];
            }
        }
        return min;
    }

    public static String countingSheep(int num) {
        String sheep = "";
        for (int i = 1; i <= num; i++) {
            sheep += i + " sheep...";
        }
        return sheep;
    }

}
