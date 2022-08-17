package mentor;

import java.util.Scanner;

public class EX32 {
    static String encryptString(String s) {
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) + 9 < (int) 'z') {
                s =s.replace(s.charAt(i),(char)(s.charAt(i)+9));
            } else {
                s =s.replace(s.charAt(i),(char) ((int) 'a' + (8 - ((int) 'z' - s.charAt(i)))));
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string:");
        String s = sc.nextLine();
        System.out.println(encryptString(s));
    }
}

