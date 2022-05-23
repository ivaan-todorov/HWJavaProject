package HW_6;

public class Person {

    String name;
    int age;
    String gender;

    String getName() {

        String result;
        if (this.gender.charAt(0) == 'м' || this.gender.charAt(0) == 'М') {
            result = "Мистер. " + this.name;
        } else if (this.gender.charAt(0) == 'ж' || this.gender.charAt(0) == 'Ж') {
            result = "Миссис. " + this.name;
        } else {
            result = "введите мужской или женский пол";
        }

        return result;
    }
}
