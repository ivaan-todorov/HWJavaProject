package HW_9_2_1;

public final class Director extends BaseManager {

    private static final double INDEX = 9.0;

    public Director(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }

    @Override
    public double getINDEX() {
        return INDEX;
    }
}
