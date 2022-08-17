package mentor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Ex22 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        HashMap<Integer,String> hashMap = new HashMap<>();
        Integer id = null;
        hashMap.put(1,"abcd-bc");
        hashMap.put(2,"ghuf-bhbee");
        hashMap.put(3,"abhbe-bene");
        hashMap.put(4,"abhbe-vegve");

        for (int k=1;k<=hashMap.size();k++){
            String s= hashMap.get(k);
            String SS = "-";
            StringBuffer S = new StringBuffer(s);
            S.substring(0,5);
            StringBuffer S3 = new StringBuffer();


            String husband =S.substring(S.indexOf(SS)+1,S.length());
            String wife =S.substring(0,S.indexOf(SS));
            StringBuffer S2 = new StringBuffer(wife);
            StringBuffer S1 = new StringBuffer(husband);
            for (int i=0;i<S1.length();i++){
                for (int j=0;j<S2.length();j++){
                    if (S1.charAt(i)==S2.charAt(j)){
                        S3.append(S2.charAt(j));

                    }

                }

            }

            l.add(S3.length());

            System.out.println(S3.length()+":"+k);
        }
        System.out.println(Collections.max(l));
        int a = l.indexOf(Collections.max(l));
        System.out.println(hashMap.get(a+1));
    }
}