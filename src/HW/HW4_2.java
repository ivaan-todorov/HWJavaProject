package HW;

public class HW4_2 {

    public static void main(String[] args) {

        String line = "________________";

        //1

        System.out.println(line);

        String s1 = "Перестановочный алгоритм быстрого действия";

        for (int i = 0; i < s1.length() - 1; i++) {
            if (s1.charAt(i) == 'о') {
                System.out.print(s1.charAt(i));
            }
        }
        System.out.println("\n");

        System.out.println(line);

        //2
        String s2 = "Перевыборы выбранного президента";
        int count2 = 0;

        for (int i = 0; i < s2.length() - 1; i++) {
            if (s2.charAt(i) == 'е' || s2.charAt(i) == 'Е') {
                count2++;
            }
        }
        System.out.println(count2);

        System.out.println(line);


        //3
        String s3 = "Посмотрите как Рите нравится ритм";

        for (int i = 0; i < s3.length(); i++) {
            if (s3.charAt(i) == 'Р' || s3.charAt(i) == 'р' && s3.charAt(i + 1) == 'и' && s3.charAt(i + 2) == 'т') {
                System.out.println(i);
            }
        }

        System.out.println("or");


        for (int i = 0; i < s3.length(); i++) {
            if (s3.indexOf("рит", s3.indexOf("рит") + 1) == i || s3.indexOf("рит") == i || s3.indexOf("Рит") == i) {
                System.out.println(i);
            }
        }

        System.out.println("or");

        s3 = s3.toLowerCase();

        int index = s3.indexOf("рит");
        while (index != -1) {
            System.out.println(index);

            index = s3.indexOf("рит", index + 1);
        }

        System.out.println(line);




        //exHW
        //необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].indexOf('е') < 0){
                    count++;
                }
            }
        }
        System.out.println(count);

        count = 0;

        System.out.println("or");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (!array[i][j].contains("е")){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
