package mentor;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex11 {
    public static DayOfWeek getDay(String date , String format){

        DateTimeFormatter df = DateTimeFormatter.ofPattern(format);
        LocalDate DOB = LocalDate.parse(date,df);
        return DOB.getDayOfWeek();
    }
    public static void main(String[] args) {
        String date = "12/11/2001";
        String format = "dd/MM/yyyy";

        System.out.println(getDay(date,format));


    }
}







