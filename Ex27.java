package mentor;

public class Ex27 {
    static Integer evenSum(int n){
        int sum =0;
        for (int i=1;i<=n;i++){
            if(i%2==0 && (i%3==0 || i%8==0)){
                sum = sum +i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(evenSum(8));
    }
}
