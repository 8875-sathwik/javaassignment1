package mentor;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("enter the size of array:");
        n = s.nextInt();

        String arr[] = new String[n];
        System.out.println("enter the string:");
        Scanner sc = new Scanner(System.in);
        for (int i =0;i<n;i++){
            arr[i] = sc.nextLine();
        }
        Arrays.sort(arr);
        for(int i=0;i<= (arr.length/2)-1;i++){
            arr[i]=arr[i].toUpperCase(Locale.ROOT);
        }
        for(int i=(arr.length/2);i<= arr.length-1;i++){
            arr[i]=arr[i].toLowerCase(Locale.ROOT);
        }
        System.out.println(Arrays.toString(arr));
    }
}
