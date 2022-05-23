package HW_9_2_2;

public final class Manager {

    private String name;
    private int age;
    private char gender;
    private double salaryPerDay;
    private int numberOfSubordinates;

    public Manager(String name, int age, char gender, double salaryPerDay, int numberOfSubordinates) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salaryPerDay = salaryPerDay;
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public double getSalary(Month[] months) {
        double result = 0;
        for (int i = 0; i < months.length; i++) {
            result += months[i].getWorkingDays() * getSalaryPerDay();
            result += result / (numberOfSubordinates * (1/100.0));
        }

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

    public void setSalaryPerDay(double salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
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

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }
}
