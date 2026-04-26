package TokyoItSchoolSection;
import java.io.*;
public class Input {
    public static void main(String[] args) throws IOException{
    BufferedReader src = new BufferedReader (new InputStreamReader (System.in));
    System.out.println("enter the size of the shoes");
    String size = src.readLine();
    double size1 = Double.parseDouble(size);
     System.out.println("サイが"+size1+"の靴を購入します");

    }
    
}
