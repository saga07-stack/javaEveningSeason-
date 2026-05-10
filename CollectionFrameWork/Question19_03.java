package CollectionFrameWork;
import java.util.*;
public class Question19_03 {
    public static void main(String[] args) {
        HashMap < String ,Integer> list = new HashMap<>();
        list.put("orange",100 );
        list.put("grape" ,200 );
        list.put("strawberry",300 );

        for(String ks : list.keySet()){
            int price = list.get(ks);
            System.out.println( ks + price );

        }

    }
}
