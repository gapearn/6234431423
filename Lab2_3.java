import java.util.GregorianCalendar;
import java.util.Calendar;

public class Lab2_3 {

    public static void main(String[] args) {
        GregorianCalendar day1 = new GregorianCalendar();
        day1.add(Calendar.DAY_OF_MONTH, 100);
        int weekday1 = day1.get(Calendar.DAY_OF_WEEK);
        int dayOfMonth1 = day1.get(Calendar.DAY_OF_MONTH);
        int month1 = day1.get(Calendar.MONTH);
        int year1 = day1.get(Calendar.YEAR);
        System.out.println(weekday1 + " " + dayOfMonth1 + " " + month1 + " " + year1);

        GregorianCalendar day2 = new GregorianCalendar(2000, Calendar.NOVEMBER, 20);
        day2.add(Calendar.DAY_OF_MONTH, 10000);
        int weekday2 = day2.get(Calendar.DAY_OF_WEEK);
        int dayOfMonth2 = day2.get(Calendar.DAY_OF_MONTH);
        int month2 = day2.get(Calendar.MONTH);
        int year2 = day2.get(Calendar.YEAR);
        System.out.println(weekday2 + " " + dayOfMonth2 + " " + month2 + " " + year2);

    }

}
