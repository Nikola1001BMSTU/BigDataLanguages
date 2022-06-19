package lr41;

import java.util.ArrayList;

public class Calendar {
    private ArrayList<Integer> all_days;

    public Calendar() {
        this.all_days = new ArrayList<>();
        for (int i = 1; i < 366; i++) {
            this.all_days.add(i);
        }
    }

    class Days{
        ArrayList<Integer> holidays;
        ArrayList<Integer> days_off;

        public Days(ArrayList<Integer> holidays, ArrayList<Integer> days_off) {
            this.holidays = holidays;
            this.days_off = days_off;
        }

        public Days() {
            this.days_off = new ArrayList<>();
            this.holidays = new ArrayList<>();
        }

        public void add_holiday(Integer date){
            this.holidays.add(date);
        }

        public void add_day_off(Integer date){
            this.days_off.add(date);
        }

        public void clear(){
            this.days_off = new ArrayList<>();
            this.holidays = new ArrayList<>();
        }

        @Override
        public String toString() {
            return "days{" +
                    "holidays=" + holidays +
                    ", days_off=" + days_off +
                    '}';
        }
    }

    public ArrayList<Integer> getAll_days() {
        return all_days;
    }

    public void setAll_days(ArrayList<Integer> all_days) {
        this.all_days = all_days;
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "all_days=" + all_days +
                '}';
    }
}
