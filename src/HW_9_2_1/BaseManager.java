package HW_9_2_1;

public abstract class BaseManager extends Worker {

    private int numberOfSubordinates;
    private static double INDEX;

    public BaseManager(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public double getSalary() {
        if (getNumberOfSubordinates() > 0) {
            return getBaseSalary() * (getNumberOfSubordinates() / 100.0 * getINDEX());
        } else {
            return getBaseSalary();
        }
    }

    protected abstract double getINDEX();
}
