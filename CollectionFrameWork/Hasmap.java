package CollectionFrameWork;
import java.util.*;
public class Hasmap {
    public static void main (String[] args){
        HashMap <String  , Integer> list = new HashMap<>();
        list.put("orange", 300);
        list.put("apple", 322);
        list.put("cherry", 100);

        for(String i : list.keySet()){
            int price = list.get(i);
            System.out.println(i + " : " + price );
        }
      list.forEach((key, value)->{
           System.out.println(key + " : " + value);
      });
    }
}
