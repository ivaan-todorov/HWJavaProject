package HW_8_1;

public class CodeWars_2 {

    public static String boolToWord(boolean b)
    {
        if (b) {

            return "Yes";
        }

        return "No";
    }

    public static Integer basicMath(String op, int v1, int v2) {

        int result = 0;
        if (op.equals("+")) {
            result = v1 + v2;
        } else if (op.equals("-")) {
            result = v1 - v2;
        } else if (op.equals("*")) {
            result = v1  * v2;
        } else {
            result = v1 / v2;
        }

        return result;
    }


    public static int[] reverse(int n){

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = n - i;
        }

        return result;
    }

    public static String[] stringToArray(String s) {

        String[] result = s.split(" ");

        return result;
    }

    public static String correct(String string) {

        StringBuilder temp = new StringBuilder(string);

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '5') {
                temp.setCharAt(i, 'S');
            } else if (string.charAt(i) == '0') {
                temp.setCharAt(i,'O');
            } else if (string.charAt(i) == '1') {
                temp.setCharAt(i,'I');
            }
        }
        string = temp.toString();

        return string;
    }

}
