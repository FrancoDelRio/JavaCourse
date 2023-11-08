import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {

        Date date =  new Date();

        System.out.println("date complex format = " + date);

        // SimpleDateFormat (https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/text/SimpleDateFormat.html)
//      SimpleDateFormat df =  new SimpleDateFormat("dd MMMM, yyyy");
        SimpleDateFormat df =  new SimpleDateFormat("dd-MM-yyyy");
        String simpleDate = df.format(date);

//      System.out.println("date simple date format('dd MMMM, yyyy') = " + simpleDate);
        System.out.println("date simple date format('dd-MM-yy') = " + simpleDate);

        long j = 0;
        for (int i = 0; i < 10000000; i++){
            j += i;
        }

        Date dateEnd = new Date();
        long finalTime = dateEnd.getTime() - date.getTime();
        System.out.println("This code lasted = " + finalTime);
    }
}
