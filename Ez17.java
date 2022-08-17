package mentor;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Ez17 {
    public static List<Integer> votersList( Integer id,Calendar DOB){

        Calendar cd = new GregorianCalendar();
        int age = cd.get(Calendar.YEAR)- DOB.get(Calendar.YEAR);

        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        hashMap.put(id,age);
        List<Integer> l = new ArrayList<>();

        if(age>=18){
            l.add(id);
        }
        return l;
    }

    public static void main(String[] args) throws ParseException {


        HashMap<Integer,Integer> hmap = new HashMap<>();
        Scanner in = new Scanner(System.in);




        for (int i = 0; i < 3; i++) {
            Integer id = in.nextInt();
            String dob = in.next();
            Date DOB = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
            Calendar cal = Calendar.getInstance();
            cal.setTime(DOB);
            Calendar cd = new GregorianCalendar();
            int age = cd.get(Calendar.YEAR)- cal.get(Calendar.YEAR);

            hmap.put(id, age);
            System.out.println(votersList(id,cal));
        }



    }
}
