package HW_7_1;

public class Manager extends Worker {

    private int numberOfEmployees;

    public Manager(int baseSalary, String name, int numberOfEmployees) {
        super(baseSalary, name);
        this.numberOfEmployees = numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public double getSalary() {
        if (getNumberOfEmployees() == 0) {

            return getBaseSalary();
        } else {

            return getBaseSalary() * (getNumberOfEmployees() / 100.0 * 3);
        }
    }
}
