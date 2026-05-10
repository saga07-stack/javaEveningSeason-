package CollectionFrameWork;
import java.util.*;
public class WordCounter {
    public static void main(String[] args) {
        String fruits [] = {"apple", "banana", "apple", "cherry", "banana", "apple"};
         HashMap<String, Integer> total = new HashMap<>();
         //String s = fruits[0];
         for(int i =0; i<fruits.length; i++){
           // String currentFruits = fruits[i];
            if(total.containsKey(fruits[i])){
               int count = total.get(fruits[i]);
               total.put(fruits[i], count+ 1);
            }else {
                total.put(fruits[i], 1);
            }
         }
         total.forEach((key, value)->{
              System.out.println(key + " " + value);
         });
            
         }
        }
       
    

