package HW_9_2_2;

public final class Employee extends BaseEmployee {

    private String name;
    private int age;
    private char gender;
    private double salaryPerDay;

    public Employee(int workingDays, String name, int age, char gender, double salaryPerDay) {
        super(workingDays);
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public double getSalary(Month[] months) {
        double result = 0;
        for (int i = 0; i < months.length; i++) {
            result += months[i].getWorkingDays() * months[i].getSalaryPerDay();
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
}
