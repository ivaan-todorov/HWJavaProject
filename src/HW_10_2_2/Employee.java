package HW_10_2_2;

public class Employee {

    private String name;
    private int age;
    private char gender;
    private double salaryPerDay;

    public Employee(String name, int age, char gender, double salaryPerDay) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salaryPerDay = salaryPerDay;
    }

    public double getSalary(IMonth[] monthArray) {
        double sumOfSalary = 0;
        for (int i = 0; i < monthArray.length; i++) {
            sumOfSalary += monthArray[i].getWorkingDays() * this.salaryPerDay;
        }

        return sumOfSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setSalaryPerDay(double salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getSalaryPerDay() {
        return salaryPerDay;
    }
}
