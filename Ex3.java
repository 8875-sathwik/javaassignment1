package mentor;

import java.util.Scanner;

public class Ex3 {

    static StringBuffer getImage(String string1){

        StringBuffer s = new StringBuffer(string1);
        s.reverse().append(1).insert(2,"@");

        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string:");
        String string1 = sc.nextLine();
        System.out.println(string1+"|"+getImage(string1));
    }
}

