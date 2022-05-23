package HW_10_2_1;

public class Utils extends Director {


    public Utils(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }

    //1
    public IEmployee searchEmployeeName(IEmployee[] employees, String name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().equals(name)) {

                return employees[i];
            }
        }

        return null;
    }

    //2
    public IEmployee searchEmployeeBySubString(IEmployee[] employees, String subStr) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().contains(subStr)) {

                return employees[i];
            }
        }

        return null;
    }

    //3
    public double fullSalaryOfEmployees(IEmployee[] employees) {
        double result = 0;
        for (int i = 0; i < employees.length; i++) {
            result += employees[i].getSalary();
        }

        return result;
    }

    //4
    public double minSalary(IEmployee[] employees) {
        double minSalary = Integer.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
            }
        }

        return minSalary;
    }

    //5
    public double maxSalary(IEmployee[] employees) {
        double maxSalary = Integer.MIN_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
            }
        }

        return maxSalary;
    }

    //6
    public int minNumberOfSubordinates(IManager[] managers) {
        int minNumberOfSubordinates = Integer.MAX_VALUE;
        for (int i = 0; i < managers.length; i++) {
            if (minNumberOfSubordinates > managers[i].getNumberOfSubordinates()) {
                minNumberOfSubordinates = managers[i].getNumberOfSubordinates();
            }
        }

        return minNumberOfSubordinates;
    }

    //7
    public int maxNumberOfSubordinates(IManager[] managers) {
        int maxNumberOfSubordinates = Integer.MIN_VALUE;
        for (int i = 0; i < managers.length; i++) {
            if (maxNumberOfSubordinates < managers[i].getNumberOfSubordinates()) {
                maxNumberOfSubordinates = managers[i].getNumberOfSubordinates();
            }
        }

        return maxNumberOfSubordinates;
    }

    //8
    public double maxAllowance(IManager[] managers) {
        double maxAllowance = Integer.MIN_VALUE;
        for (int i = 0; i < managers.length; i++) {
            if (managers[i].getSalary() - managers[i].getBaseSalary() > maxAllowance) {
                maxAllowance = managers[i].getSalary() - managers[i].getBaseSalary();
            }
        }

        return maxAllowance;
    }

    //9
    public double minAllowance(IManager[] managers) {
        double minAllowance = Integer.MAX_VALUE;
        for (int i = 0; i < managers.length; i++) {
            if (minAllowance > managers[i].getSalary() - managers[i].getBaseSalary()) {
                minAllowance = managers[i].getSalary() - managers[i].getBaseSalary();
            }
        }

        return minAllowance;
    }

}
