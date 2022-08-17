package mentor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex7 {
    public String replaceConconet(String s){
        StringBuffer Sb = new StringBuffer(s);
        for (int i =0;i<=s.length()-1;i++){
            char c = Sb.charAt(i);
            if(!(c=='A'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')){
                Sb.replace(i,i+1,String.valueOf((char)(c+1)));
            }
        }
        return Sb.toString();
    }

    public static void main(String[] args) {
        Ex7 ex7 = new Ex7();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.next();
        System.out.println(ex7.replaceConconet(s));
    }
}
