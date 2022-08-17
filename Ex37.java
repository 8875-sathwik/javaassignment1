package mentor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex37 {
    static String rearrangeCharecters(String S){
        List<Character> l = new ArrayList<>();
        List<Character> L = new ArrayList<>();
        int a =0;
        StringBuffer s = new StringBuffer();
        for (int i = 0; i<S.length(); i++){
            l.add(S.charAt(i));
            if (l.get(i)=='a'){
                a++;
            }
        }
        for (int i = 0; i<S.length(); i++){
            if(S.charAt(i)!='a')
                s.append(S.charAt(i));
        }
        System.out.println(s);
        String convert = s.toString();
        String result = String.join("", Collections.nCopies(a, "a"))+convert;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(rearrangeCharecters("jadnajwhabjdjwasnAd"));
    }
}
