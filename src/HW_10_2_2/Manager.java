package HW_10_2_2;

public class Manager {

    private String name;
    private int age;
    private char gender;
    private double salaryPerDay;
    private int numberOfEmployees;

    public Manager(String name, int age, char gender, double salaryPerDay, int numberOfEmployees) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salaryPerDay = salaryPerDay;
        this.numberOfEmployees = numberOfEmployees;
    }

    public double getSalary(IMonth[] monthArray) {
        double sum = 0;
        for (int i = 0; i < monthArray.length; i++) {
            sum += monthArray[i].getWorkingDays() * this.salaryPerDay
                    * (numberOfEmployees * (monthArray[i].getWorkingDays() * this.salaryPerDay / 100));
        }

        return sum;
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

    public int getNumberOfEmployees() {
        return numberOfEmployees;
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

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
}
