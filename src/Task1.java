import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        //1. Написать программу для вывода на консоль названия дня недели по введенной дате.
        Calendar calendar = new GregorianCalendar(2022, Calendar.JUNE, 29);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE", new Locale("en"));
        String format = simpleDateFormat.format(calendar.getTime());
        System.out.println(format);
    }
}
