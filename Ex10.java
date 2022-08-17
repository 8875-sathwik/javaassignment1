package mentor;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Ex10 {
    public static StringBuffer modifyNumber(int n) {
        String s = String.valueOf(n);
        StringBuffer S = new StringBuffer(s);
        for (int i = 0; i <= s.length()-1 ; i++) {
            S.replace(i, i + 1, String.valueOf(abs(s.charAt(i) - s.charAt(i + 1))));
        }
        return S;

    }

    public static void main(String[] args) {
        Ex10 ex9 = new Ex10();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int n = sc.nextInt();
        System.out.println(Ex10.modifyNumber(n));
    }
}
//public static void main(String[] args) {
//       int n = 74563;
//       String s = String.valueOf(n);
//       StringBuffer S = new StringBuffer(s);
//       for (int i=0;i<=s.length()-1;i++){
//           S.replace(i,i+1, String.valueOf(abs(s.charAt(i)-s.charAt(i+1))));
//           System.out.println(S);
//
//       }
//
//
//
//
//        }
