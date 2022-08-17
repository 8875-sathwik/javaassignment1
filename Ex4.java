package mentor;

import java.util.Scanner;

public class Ex4 {
    static boolean checkNumber(int n) {
        String s = Integer.toString(n);
        for (int i = 0; i <= s.length()-1; i++)
            return s.charAt(i) <= s.charAt(i + 1);

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int n = sc.nextInt();
        if (checkNumber(n))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
