package CollectionFrameWork;
import java.util.*;

public class Student {
    public static void main(String[] args) {

      HashMap <String, Integer> students = new HashMap<>();
      students.put("sagar", 69);
      students.put("saroj", 99);
      students.put("sandip", 98);
      students.put("kripa", 97);
      students.put("bagmati", 100);
      students.put("baba", 23);
      
       double avg []= {0,0};
         students.forEach((key, value)->{
             if(value>=60){
                System.out.println(key + " : " + value + " (pass)");
             }else{
                System.out.println(key + " : " + value + " (fail)");
             }
              avg[0] += value;
              avg[1] ++; 
         });
         System.out.println("Average = " + avg[0]/avg[1]);

    }
}
