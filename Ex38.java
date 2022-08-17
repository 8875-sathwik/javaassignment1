package mentor;

import java.util.ArrayList;
import java.util.List;

public class Ex38 {
    static List<Integer> getFactors(int n){
        List<Integer> L = new ArrayList<>();
        for (int i=1;i<=n;i++){
            if (n%i == 0){
                L.add(i);
            }
        }
        return L;
    }

    public static void main(String[] args) {
        System.out.println(getFactors(9));
    }
}
