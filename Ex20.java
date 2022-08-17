package mentor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex20 {


    public static void main(String[] args) {
        List<Character> l = List.of('a', 'a', 'a', 'b', 'b', 'c');
        List<Character> arr = new ArrayList<>(l);
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char c : arr) {
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);
            } else {
                hashMap.put(c, 1);
            }
        }
        System.out.println(hashMap);

    }
}

