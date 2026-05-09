package classLibrary;
import java.util.*;

public class StringBuildeer {
    public static void main (String[] args){
   Scanner src = new Scanner(System.in);
   System.out.println("enter a word");
   String input = src.nextLine();
   src.close();
   System.out.println("文字列の追加を行います");
     input = input + "ございました";
   System.out.println(input  );
    }
}
