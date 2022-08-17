package mentor;

import java.util.Scanner;

public class Ex12 {
    static boolean validateUserName(String username){
        boolean flag = false;

        if (username.length()>=12 && username.endsWith("_job")) {
            flag = true;
        }
        else {
            flag = false;
        }

        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string:");
        String username = sc.nextLine();
        System.out.println(validateUserName(username));

    }

}


