package mentor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex18 {
    public static void main(String[] args) {

        List<Integer> l = List.of(12, 43, 56, 86, 91, 77);
        List<Integer> L = new ArrayList<>(l);
        List<Integer> R = new ArrayList<>();



        for (int i=0;i<L.size();i++){
            int reverse = 0;

            int number = L.get(i);
            while(number != 0) {
                int remainder = number % 10;
                reverse = reverse * 10 + remainder;
                number = number / 10;
            }
            R.add(reverse);
            Collections.sort(R);


        }
        System.out.println(R);
    }
}
