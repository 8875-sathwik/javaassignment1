package mentor;

import java.util.*;

public class Ex34 {
    private static void getEmplyes(String[] b1,String[] b2){
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        for (String i : b1) {
            set1.add(i);
        }
        for (String j : b2) {
            set2.add(j);
        }


        set1.retainAll(set2);
        TreeSet<String>  s= new TreeSet<>(set1);
        System.out.println("Common elements- " + s);
    }

    public static void main(String[] args) {
        String[] b1 = {"ram","mohan","chithanya","sathwik","preethi"};
        String[] b2 = {"sam","sahitya","chithanya","sathwik","pratheek","bhumi"};

        System.out.println("emplyess in branch1"+ Arrays.toString(b1));
        System.out.println("emplyess in branch2"+ Arrays.toString(b2));
        getEmplyes(b1,b2);

    }
}
