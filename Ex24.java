package mentor;

import java.util.ArrayList;
import java.util.List;

public class Ex24 {
    public static void main(String[] args) {
        String s ="adz";

        char[] a = s.toCharArray();
        List<Integer> l = new ArrayList<>();
        for (int i=0;i<s.length()-1;i++) {
            if (a[i]-a[i+1]>0)
                System.out.println("no");
            break;
        }
    }

}




