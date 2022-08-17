package mentor;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Ex16 {
    public static HashMap getSquares(Integer[] arr){
        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        for (int i:arr){
            hashMap.put(i,i*i);
        }
        return hashMap;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("enter the size of array:");
        n = s.nextInt();

       Integer arr[] = new Integer[n];
        System.out.println("enter the numbers:");
        Scanner sc = new Scanner(System.in);
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> hashMap = getSquares(arr);
        System.out.println(getSquares(arr));

        Iterator<Integer> I = hashMap.keySet().iterator();
        while (I.hasNext()){
            Integer key = I.next();
            System.out.println(key+":"+hashMap.get(key));
        }

    }
}
