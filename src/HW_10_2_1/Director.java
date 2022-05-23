package HW_10_2_1;

public class Director extends Manager {


    public Director(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }

    @Override
    public double getSalary() {
        if (getNumberOfSubordinates() == 0) {

            return getBaseSalary();
        }

        return getBaseSalary() * (getNumberOfSubordinates() / 100.0 * 9);
    }
}
