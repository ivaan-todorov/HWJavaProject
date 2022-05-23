package HW_6;

public class Employee {

    String name;
    int age;
    String gender;
    int salary;


    boolean isSameName(Employee employee){
        boolean result;
        if (this.name.equals(employee)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

}
