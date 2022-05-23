package HW_9_2_1;

public class Worker extends Employee {


    public Worker(double baseSalary, String name) {
        super(baseSalary, name);
    }

    public final double getBaseSalary() {
        return 0;
    }

    @Override
    public double getSalary() {
        return getBaseSalary();
    }

}
