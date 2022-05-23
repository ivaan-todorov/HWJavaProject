package HW_7_1;

public class Search extends Manager {


    public Search(int baseSalary, String name, int numberOfEmployees) {
        super(baseSalary, name, numberOfEmployees);
    }

    //1
    public String searchEmployee(String[] employee) {
        String result = "нет подходящего имени";

        for (int i = 0; i < employee.length; i++) {
            if (employee[i].equals(getName())) {
                result = employee[i];
            }
        }

        return result;
    }


    //2
    public String searchEmployeeWithPeace(Search[] employee, String peaceOfName) {
        String result = null;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getName().contains(peaceOfName)) {
                result += employee[i] + " ";
            }
        }

        return result;
    }


    //3
    public double    generalSalary(Search[] employee) {
        double result = 0;
        for (int i = 0; i < employee.length; i++) {
            result += employee[i].getSalary();
        }

        return result;
    }


    //4
    public double minimumSalary(Search[] employees) {
        double result = Integer.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (result > employees[i].getSalary()) {
                result = employees[i].getSalary();
            }
        }

        return result;
    }


    //5
    public double maximumSalary(Search[] employees) {
        double result = Integer.MIN_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (result < employees[i].getSalary()) {
                result = employees[i].getSalary();
            }
        }

        return result;
    }


    //6
    public int minimumNumberOfEmployees(Search[] employees) {
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getNumberOfEmployees() < result) {
                result = employees[i].getNumberOfEmployees();
            }
        }

        return result;
    }


    //7
    public int maximumNumberOfEmployees(Search[] employees) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getNumberOfEmployees() > result) {
                result = employees[i].getNumberOfEmployees();
            }
        }

        return result;
    }


    //8
    public double maxAllowance(Search[] employees) {
        double result = Integer.MIN_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() - employees[i].getBaseSalary() > result) {
                result = employees[i].getSalary() - employees[i].getBaseSalary();
            }
        }

        return result;
    }


    //9
    public double minAllowance(Search[] employees) {
        double result = Integer.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() - employees[i].getBaseSalary() < result) {
                result = employees[i].getSalary() - employees[i].getBaseSalary();
            }
        }

        return result;
    }


}
