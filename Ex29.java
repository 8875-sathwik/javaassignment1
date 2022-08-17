package mentor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Ex29 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        hashMap.put(3,8);
        hashMap.put(9,4);
        hashMap.put(33,43);
        hashMap.put(48,98);
        hashMap.put(1,90);
        hashMap.put(45,66);
        List<Integer> l = new ArrayList<>();


        for (Integer i : hashMap.keySet()){

            l.add(hashMap.get(i));


        }
        Collections.sort(l);
        System.out.println(l);



    }
}
