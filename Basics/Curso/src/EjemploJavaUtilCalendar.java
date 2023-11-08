import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        //calendar.set(1985,Calendar.SEPTEMBER,25,24,20);

        calendar.set(Calendar.YEAR, 1978);
        calendar.set(Calendar.MONTH, Calendar.OCTOBER);
        calendar.set(Calendar.DAY_OF_MONTH,24);
        calendar.set(Calendar.HOUR_OF_DAY,20);
        calendar.set(Calendar.MINUTE,15);
        calendar.set(Calendar.SECOND,45);

        Date date = calendar.getTime();
        System.out.println("Calendar = " + date);

//        SimpleDateFormat format = new SimpleDateFormat("dddd, ")
    }
}
