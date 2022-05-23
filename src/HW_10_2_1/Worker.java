package HW_10_2_1;

public class Worker implements IManager {

    private double baseSalary;
    private String name;

    public Worker(double baseSalary, String name) {
        this.baseSalary = baseSalary;
        this.name = name;
    }

    @Override
    public double getBaseSalary() {
        return this.baseSalary;
    }

    @Override
    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getSalary() {
        return this.baseSalary;
    }

    @Override
    public int getNumberOfSubordinates() {
        return 0;
    }

    @Override
    public void setNumberOfSubordinates(int numberOfSubordinates) {

    }
}
