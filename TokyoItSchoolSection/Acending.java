package TokyoItSchoolSection;

import java.util.Arrays;

public class Acending {
    public static void main (String[] args){
     int [] num = {30,53,21,70,60};
       System.out.println("ソートが完了しました");

    Arrays.sort(num,0,5);
       for(int i : num){
        System.out.print(i);
       }
    }
}
