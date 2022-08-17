package mentor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex19 {
    public static void main(String[] args) {
        List<Integer> l = List.of(12,43,56,86,91,91,12,12,77);
        List<Integer> L = new ArrayList<>(l);
        List<Integer> R = new ArrayList<>();
        Collections.sort(L);
        System.out.println(L);

        for (int i=0;i<L.size();i++){
            while (L.get(i)==L.get(i+1)){
                L.remove(i+1);
                System.out.println(L);
            }




        }







    }
}
