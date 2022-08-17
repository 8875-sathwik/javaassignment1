package mentor;

public class Ex36 {

    static boolean getPrimeSum(int n){
        if (n==0 || n==1) return false;
        for (int i =2;i<n;i++){
            if (n%i==0) return false;
        }
        return true;
    }


    public static void main(String[] args) {
       int n = 100;
       int sum =0;
       for (int i=1;i<=n;i++){
           if (getPrimeSum(i)){
               sum = sum+i;
           }
       }
        System.out.println(sum);
    }

}
