package mentor;

public class Ex28 {
    static Integer cubeSum(int n){
        int sum =0;
        for (int i=0;i<=n;i++){
            sum = sum+ (i*i*i);

        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(cubeSum(2));
    }
}
