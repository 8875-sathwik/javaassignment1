package mentor;

import java.util.HashMap;
import java.util.Set;

public class Ex6 {
    public HashMap<String,String> getStudents(HashMap<String,Integer>student) {

        HashMap<String,String> medal1 = new HashMap<>();
        Set<String> set = student.keySet();
        for(String s:set){
            Integer marks = student.get(s);
            if (marks>=90){
                medal1.put(s,"gold");
            }
           else if (marks>=80){
                medal1.put(s,"silver");
            }
            else if (marks>=70){
                medal1.put(s,"bronze");
            }
        }


        return medal1;
    }

    public static void main(String[] args) {
        HashMap<String,Integer> student =new HashMap<>();
        Ex6 ex6 =new Ex6();

        student.put("raju",75);
        student.put("rama",59);
        student.put("rang",37);
        student.put("balu",67);
        student.put("manu",95);
        student.put("sangu",88);

        System.out.println(ex6.getStudents(student));

    }
}
