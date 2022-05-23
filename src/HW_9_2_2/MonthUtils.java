package HW_9_2_2;

public class MonthUtils extends BaseEmployee {

    public static final Month JAN = new Month("Jan", 31, 24);
    public static final Month FEB = new Month("Feb", 28, 19);
    public static final Month MAR = new Month("Mar", 31, 23);
    public static final Month APR = new Month("Apr", 30, 22);
    public static final Month MAY = new Month("May", 31,21);
    public static final Month JUN = new Month("Jun", 30,22);
    public static final Month JUL = new Month("Jul", 31, 22);
    public static final Month AUG = new Month("Aug", 31, 22);
    public static final Month SEP = new Month("Sep", 30, 22);
    public static final Month OCT = new Month("Oct", 31,21);
    public static final Month NOV = new Month("Nov", 30,22);
    public static final Month DEC = new Month("Dec", 31,23);

    private static final Month[] YEAR = {
            JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
    };

    public static Month[] Q1 = {
            JAN, FEB, MAR
    };

    public MonthUtils(double salaryPerDay) {
        super((int) salaryPerDay);
    }

    public static Month getMonth(int index) {
        return YEAR[index];
    }

    public static int getMonthCountArray() {
        return YEAR.length;
    }

    public static Month[] getYear() {
        return YEAR;
    }

    public static Month[] getQ1() {
        return Q1;
    }
}
