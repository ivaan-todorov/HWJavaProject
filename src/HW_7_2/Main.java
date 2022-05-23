package HW_7_2;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("Ivan", 30, 'М',  1000);

        Month[] months = {
                new Month("Jan", 31, 21),
                new Month("Feb", 28, 20)
        };

        System.out.println(employee.getSalary(months));

    }
}
