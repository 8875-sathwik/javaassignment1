package mentor;

import java.util.Arrays;

public class Ex26 {
    public static void main(String[] args) {
        String[] a = {"efffft","rfgfrgf","rtghk","hbg"};
        System.out.println(Arrays.toString(a));
        String s ="rfgfrgf";
        for (int i=0;i< a.length;i++){
            if (a[i] == s){

                a[i]=s.substring(0,(s.length()/2)+1);
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
