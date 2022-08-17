package mentor;

import java.util.ArrayList;
import java.util.List;

public class Ex14 {

    public static void main(String[] args) {
        List<Integer> l1 = List.of(1, 6, 3, 6, 4, 7, 7, 8);
        List<Integer> l2 = List.of(3, 2, 6, 4);
        List<Integer> L1 = new ArrayList<>(l1);
        List<Integer> L2 = new ArrayList<>(l2);
        List<Integer> L =new ArrayList<>();

        for (int i : L1) {
            if (!(L1.contains(L2.get(i))))
                L.add(L1.get(i));

        }
        System.out.println(L);

    }
}
