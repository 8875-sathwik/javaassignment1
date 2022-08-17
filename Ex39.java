package mentor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex39 {
    static String getFormat(int n){
        String[] L=new String[4];
        String be = Integer.toBinaryString(n);
        String he = Integer.toHexString(n);
        String oe = Integer.toOctalString(n);

        L[0] = Integer.toString(n);
        L[1] = be;
        L[2] = he;
        L[3] = oe;

        return Arrays.toString(L);
    }

    public static void main(String[] args) {
        System.out.println(getFormat(12));
    }
}
