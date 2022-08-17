package mentor;

import java.util.ArrayList;
import java.util.List;

public class Ec31 {

    static List<Integer> fib(int n){
        int f[] = new int[n+2];
        List<Integer> L =new ArrayList<>();

        f[0]=0;
        f[1]=1;
        L.add(f[0]);
        L.add(f[1]);

        for (int i=2;i<n;i++){
            f[i]=f[i-1]+f[i-2];
            L.add(f[i]);
        }
        return L;
    }
    static int factorial(int n) {
        List<Integer> A = fib(n);
        List<Integer> R = new ArrayList<>();
        R.add(0);
        R.add(1);
        R.add(1);

        for (int i = 3; i < A.size(); i++) {
            int k = 1;
            for (int j = 1; j <= A.get(i); j++) {
                k = k * j;
            }
            R.add(k);
        }
        int sum =0;
        for (int z=0;z<= R.size()-1;z++){
            sum = sum + R.get(z);
        }

        return sum;
    }

    public static void main(String[] args) {
        int n= 5;
        System.out.println(factorial(n));
    }
}
