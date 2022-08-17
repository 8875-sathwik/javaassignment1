package mentor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Ex41 {
    public static boolean validateAge(String dob) throws ParseException {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate DOB = LocalDate.parse(dob,df);
        LocalDate date = LocalDate.now();

        int age = Period.between(DOB,date).getYears();
        if (age>= 21)
            return true;
        return false;
    }

    public static void main(String[] args) throws ParseException {
        System.out.println(validateAge("12/01/2010"));
    }
}
