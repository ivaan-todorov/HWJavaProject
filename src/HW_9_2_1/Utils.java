package HW_9_2_1;

public class Utils extends Worker{

    public Utils(double baseSalary, String name) {
        super(baseSalary, name);
    }

    //1
    public Worker searchName(Worker[] names) {
        for (int i = 0; i < names.length; i++) {
            if (getName().equals(names[i])) {
                return names[i];
            }
        }
        return null;
    }

    //2
    public Worker searchNameByPeace(Worker[] names, String peaceOfName) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].getName().contains(peaceOfName)) {
                return names[i];
            }
        }

        return null;
    }

    //3
    public double salarySum(Worker[] workers) {
        double result = 0;
        for (int i = 0; i < workers.length; i++) {
            result += workers[i].getSalary();
        }

        return result;
    }

    //4
    public double minSalary (Worker[] workers) {
        double result = Integer.MAX_VALUE;
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getSalary() < result) {
                result = workers[i].getSalary();
            }
        }

        return result;
    }

    //5
    public double maxSalary(Worker[] workers) {
        double result = Integer.MIN_VALUE;
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getSalary() > result) {
                result = workers[i].getSalary();
            }
        }

        return result;
    }

    //6
    public int minNumberOfSubordinates(Manager[] managers) {
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < managers.length; i++) {
            if (managers[i].getNumberOfSubordinates() < result) {
                result = managers[i].getNumberOfSubordinates();
            }
        }

        return result;
    }

    //7
    public int maxNumberOfSubordinates(Manager[] managers) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < managers.length; i++) {
            if (managers[i].getNumberOfSubordinates() > result) {
                result = managers[i].getNumberOfSubordinates();
            }
        }

        return result;
    }

    //8
    public double maxAllowance(Manager[] managers) {
        double result = Integer.MIN_VALUE;
        for (int i = 0; i < managers.length; i++) {
            if (managers[i].getSalary() - managers[i].getBaseSalary() > result) {
                result = managers[i].getSalary() - managers[i].getBaseSalary();
            }
        }

        return result;
    }

    //9
    public double minAllowance(Manager[] managers) {
        double result = Integer.MAX_VALUE;
        for (int i = 0; i < managers.length; i++) {
            if (managers[i].getSalary() - managers[i].getBaseSalary() < result) {
                result = managers[i].getSalary() - managers[i].getBaseSalary();
            }
        }

        return result;
    }


}
