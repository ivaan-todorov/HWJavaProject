package HW_10_2_1;

public class Manager extends Worker {

    private int numberOfSubordinates;

    public Manager(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public int getNumberOfSubordinates() {
        return this.numberOfSubordinates;
    }

    @Override
    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary() {
        if (getNumberOfSubordinates() == 0) {

            return getBaseSalary();
        }

        return getBaseSalary() * (numberOfSubordinates / 100.0 * 3);
    }
}
