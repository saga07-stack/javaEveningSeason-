package classLibrary;
import java.util.*;
public class Count {
    public void countingWord(){
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the word i will count it ");
        String count = src.nextLine();
        System.out.println(" the length is  "+count.length());
        

    }
    public static void main (String[] args){
        Count count = new Count();
        count.countingWord();
            }
}
