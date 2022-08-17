package mentor;

public class Ex5 {
    static boolean powerTwo(double n){

        return Math.ceil(Math.log(n)/Math.log(2))==Math.floor(Math.log(n)/Math.log(2));
    }

    public static void main(String[] args) {
        if (powerTwo(8))
            System.out.println("Yes");
        else
            System.out.println("No");




    }
}
