package TokyoItSchoolSection;
import java.io.*;
public class Round {
    public static void main (String[] args)throws IOException{
    BufferedReader src = new BufferedReader ( new InputStreamReader(System.in));
     System.out.println("enter the number");
    String numS = src.readLine();
    int num = Integer.parseInt(numS);

    System.out.println("3割引で"+(Math.round(num*0.7)));



    }
}
