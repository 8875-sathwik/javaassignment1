package mentor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex42 {
    static boolean getDate(int choice){
        LocalDate today = LocalDate.now();
        if (choice ==1){
            String formattedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
            System.out.println(formattedDate );
        }
        if (choice ==2){
            String formattedDate = today.format(DateTimeFormatter.ofPattern("dd/MMM/yyyy"));
            System.out.println(formattedDate );
        }
        if (choice ==3){
            String formattedDate = today.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            System.out.println(formattedDate );
        }
        if (choice ==4){
            String formattedDate = today.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            System.out.println(formattedDate );
        }
        if (choice ==5){
            System.out.println(today.getYear());
        }
        if (choice ==6){
            System.out.println(today.getMonth());
        }
        if (choice ==7){
            System.out.println(today.plusDays(10));
        }
        if (choice ==8){
            System.out.println(today.plusDays(-10));
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Choice 1 : Month-date-year(Ex: 05-26-2012)\n" +
                " Choice 2: Date-month-year(Ex: 26-MAY-12)\n" +
                " Choice 3: Date/month/year(Ex: 26/05/2012)\n" +
                " Choice 4: Month/date/year(Ex: 05/26/2012)\n" +
                "Choice 5: Return the current year\n" +
                "Choice 6: Return the current month as (Ex: APR)\n" +
                "Choice7: Return the date 10 days after the sysdate\n" +
                "Choice 8: Return 10 days prior to sysdate");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter choice:");
        int choice = sc.nextInt();
        System.out.println(getDate(choice));

    }
}
