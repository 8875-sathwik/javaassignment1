package mentor;

import java.util.Scanner;

public class Ex2 {
    static int calculateDiffermce(int n){
        int Sum1 =0;
        int Sum2 =0;

        for (int i =1;i<=n;i++){
            Sum1 = Sum1 + (i*i);
            Sum2 = Sum2 + i;
        }
        return Sum1-(Sum2*Sum2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int n = sc.nextInt();
        System.out.println(calculateDiffermce(n));
    }
}
