package mentor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex8 {
    public int getSecondSmallest(int[] arr){
        List<Integer> a = new ArrayList<Integer>();
        for (int i:arr){
            a.add(i);
        }
        Collections.sort(a);
        return a.get(1);
    }

    public static void main(String[] args) {
        Ex8 ex8 = new Ex8();
        int arr[] = {9,363,397,36383,393083,56,89,6,555};
        System.out.println(ex8.getSecondSmallest(arr));
    }
}
