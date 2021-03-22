import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Birthday {
    public static void main(String[] args) {
        int day = 11;
        int month = 11;
        int year = 1993;
        int count = 0;
        DateFormat dateFormat = new SimpleDateFormat(" - dd.MM.yyyy - EEEE");
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        while (calendar.getTime().before(date)) {
            System.out.println(count + dateFormat.format(calendar.getTime()));
            calendar.add(Calendar.YEAR, 1);
            count++;
        }

    }
}
