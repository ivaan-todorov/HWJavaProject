package HW;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HW_13 {

    public static void main(String[] args) {

        //1
        List<String> listStr = new ArrayList<>();
        listStr.add("White");
        listStr.add("Tan");
        listStr.add("Yellow");
        listStr.add("Orange");
        listStr.add("Red");
        listStr.add("Pink");
        listStr.add("Purple");
        listStr.add("Blue");
        System.out.println(listStr);

        for (int i = listStr.size(); i-- > 0;) {
            if (listStr.get(i).contains("l")) {
                listStr.remove(i);
            }
        }

        //or

//        Iterator<String> iterator = listStr.iterator();
//        while(iterator.hasNext()) {
//            if (iterator.next().contains("l")) {
//                iterator.remove();
//            }
//        }

        //or

//        listStr.removeIf(color -> color.contains("l"));

        System.out.println(listStr);


        //2
        List<Integer> listInt = new ArrayList<>();
        for (int i = 100; i < 1001; i++) {
            listInt.add(i);
        }

        System.out.println(listInt);

        //3
        for (int i = listInt.size(); i-- > 0;) {
            if (listInt.get(i) % 2 == 0) {
                listInt.remove(i);
            }
        }
        System.out.println(listInt);

        //4
        for (Integer i = listInt.size(); i-- > 0;) {
            if (listInt.get(i) % 2 == 0) {
                listInt.remove(listInt.get(i));
            }
        }

    }
}
