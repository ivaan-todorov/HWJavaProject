package HW_10_2_2;

import HW_7_2.Month;

public class MonthUtils {

    private static Month[] MONTH_ARRAY = {
            new Month("Jan", 31, 24),
            new Month("Feb", 28, 19),
            new Month("Mar", 31, 23),
            new Month("Apr", 30, 22),
            new Month("May", 31,21),
            new Month("Jun", 30,22),
            new Month("Jul", 31, 22),
            new Month("Aug", 31, 22),
            new Month("Sep", 30, 22),
            new Month("Oct", 31,21),
            new Month("Nov", 30,22),
            new Month("Dec", 31,23)
    };


    private class MonthImpl implements IMonth {

        private String monthName;
        private int workingDays;
        private int daysPerMonth;

        @Override
        public String getMonthName() {
            return this.monthName;
        }

        @Override
        public void setMonthName(String monthName) {
            this.monthName = monthName;
        }

        @Override
        public int getWorkingDays() {
            return this.workingDays;
        }

        @Override
        public void setWorkingDays(int workingDays) {
            this.workingDays = workingDays;
        }

        @Override
        public int getDaysPerMonth() {
            return this.daysPerMonth;
        }

        @Override
        public void setDaysPerMonth(int daysPerMonth) {
            this.daysPerMonth = daysPerMonth;
        }

    }

}
