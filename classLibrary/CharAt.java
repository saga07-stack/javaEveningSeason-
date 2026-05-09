package classLibrary;
import java.util.*;
public class CharAt {
    public void chart(){
     Scanner src = new Scanner(System.in) ;
     System.out.println(" input any word ");
     String  input = src.nextLine();
     System.out.println( " in the 4th word " + input.charAt(  3));    
    }
    public static void main(String[] args) {
        CharAt src = new CharAt();
        src.chart();
    }
}
