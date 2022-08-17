package mentor;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex33 {
    static boolean compareDates(String p,String s) throws ParseException {
        boolean flag = true;
        Date pd = new SimpleDateFormat("dd/MM/yyyy").parse(p);
        Date sd = new SimpleDateFormat("dd/MM/yyyy").parse(s);
        if (pd.after(sd)){
            flag = false;
        }
        return flag;
    }

    public static void main(String[] args) throws ParseException {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter purchased date in format dd/MM/yyyy :");
        String p = s1.nextLine();
        Scanner s2 = new Scanner(System.in);
        System.out.println("enter selling date in format dd/MM/yyyy ");
        String s = s2.nextLine();
        System.out.println(compareDates(p,s));
    }
}
