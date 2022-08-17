package mentor;

public class Ex40 {
    static String getSum(double n){
        String s = String.valueOf(n);
        String SR ="";
        String SL ="";
        int sum1=0;
        int sum2=0;

        StringBuffer S = new StringBuffer(s);
        for (int i =0;i<s.length();i++){
            if (s.charAt(i)=='.'){
                int a = i;
                SR = s.substring(0,a);
                SL = s.substring(a+1,s.length());
            }
        }
        for (int i=0;i<SR.length();i++){
            sum1 = sum1 + Integer.parseInt(Character.toString(SR.charAt(i)));
        }
        for (int i=0;i<SL.length();i++){
            sum2 = sum2 + Integer.parseInt(Character.toString(SL.charAt(i)));
        }
        String result = sum1 +":"+ sum2;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getSum(1234.34555));
    }
}
