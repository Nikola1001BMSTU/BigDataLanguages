package lr41;

public class lr415 {
    public static void main(String[] args) {
        Calendar cal = new Calendar();
        Calendar.Days d = cal.new Days();
        d.add_day_off(5);
        d.add_day_off(7);
        d.add_holiday(6);
        System.out.println(cal);
        System.out.println(d);
    }
}
