package HW_9_2_2;

public class Month {

    private final String nameMonth;
    private final int workingDays;
    private final int daysInMonth;
    private double salaryPerDay;

    public Month(String nameMonth, int workingDays, int daysInMonth, double salaryPerDay) {
        this.nameMonth = nameMonth;
        this.workingDays = workingDays;
        this.daysInMonth = daysInMonth;
        this.salaryPerDay = salaryPerDay;
    }

    public Month(String nameMonth, int workingDays, int daysInMonth) {
        this.nameMonth = nameMonth;
        this.workingDays = workingDays;
        this.daysInMonth = daysInMonth;
    }

    public String getNameMonth() {
        return nameMonth;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public int getDaysInMonth() {
        return daysInMonth;
    }

    public double getSalaryPerDay() {
        return salaryPerDay;
    }
}
