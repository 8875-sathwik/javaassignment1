package mentor;

import java.util.HashMap;

public class Ex21 {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        String state = null;
        String capital = null;
        String s ="tamilnadu||chennai-karanataka||bengaluru-kerala||kocchi-";
        String s1 = "||";
        String s2 ="-";
        StringBuffer S = new StringBuffer(s);


        while (S.length()!=0){

            for (int i=0;i<S.length();i++){
                state = S.substring(0,S.indexOf(s1));
                capital = S.substring(S.indexOf(s1)+2,S.indexOf(s2));
                hashMap.put(state,capital);
                S = S.delete(0,S.indexOf(s2)+1);

            }
        }
        System.out.println(hashMap);
    }
}

