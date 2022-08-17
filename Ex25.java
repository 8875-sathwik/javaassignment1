package mentor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex25 {
    public static void main(String[] args) {
        int[] L1 = {23,45,12,78,4,90,1};
        int[] L2 = {77,11,45,88,32,56,3};

        int[] R = new int[L1.length+ L2.length];

        System.arraycopy(L1,0,R,0,L1.length);
        System.arraycopy(L2,0,R,L1.length,L2.length);
        Arrays.sort(R);
        System.out.println(Arrays.toString(R));
    }
}
