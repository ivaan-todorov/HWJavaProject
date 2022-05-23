package HW_7_2;

public class Manager extends Month {

    private String name;
    private int age;
    private char gender;
    private int salaryPerDay;
    private int numberOfEmployees;

    public Manager(String monthName, int numberOfDays, int numberOfWorkingDays) {
        super(monthName, numberOfDays, numberOfWorkingDays);
    }

    public double getSalary(Month[] monthArray) {
        double result = 0;
        for (int i = 0; i < monthArray.length; i++ ) {
            result += monthArray[i].getNumberOfWorkingDays() * salaryPerDay * 1.0;
        }
        result += result / 1/100 * numberOfEmployees;

        return result;
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

    public void setSalaryPerDay(int salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
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

    public int getSalaryPerDay() {
        return salaryPerDay;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }
}
