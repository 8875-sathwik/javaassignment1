package mentor;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Scanner;

public class Ex23 {
    static StringBuffer changeString(String c){
        String S = new String();

        StringBuffer s = new StringBuffer(S);
        StringBuffer ss = new StringBuffer();


        if (c == "A"){
            String SA = S+S;
            StringBuffer sa = new StringBuffer(SA);
            System.out.print(sa);
        }
        else if (c == "B"){
            StringBuffer sb = new StringBuffer();
            for (int i=1;i< s.length();i++){
                if (i%2 == 0){
                    sb = s.replace(i,i+1,"*");
                }
            }
            System.out.print(sb);
        }
        else if (c == "C"){
            char str[] = S.toCharArray();
            int n = S.length();
            HashSet<Character> hs = new LinkedHashSet<>(n - 1);
            for (char x : str)
                hs.add(x);

            for (char x : hs)
                System.out.print(x);

        }
        else if (c == "D"){

            StringBuffer sd = new StringBuffer();
            for (int i=0;i< s.length();i++){
                if (i%2 == 0){
                    sd = s.replace(i,i+1, String.valueOf(S.toUpperCase(Locale.ROOT).charAt(i)));
                }
            }
            System.out.print(sd);
        }
        return ss;
    }

    public static void main(String[] args) {
        String S = "abcd";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter charecter a,b,c,or d:");
        String c = sc.next();
        System.out.println(changeString(c));


    }
}
