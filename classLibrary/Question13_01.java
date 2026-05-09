package classLibrary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question13_01 {
    public static void main(String[] args) throws IOException {

        System.out.println("郵便番号を入力してください。");
        System.out.println("入力例:xxx-xxxx");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
          String str = reader.readLine();
          if(str.contains("-")){
             System.out.println(true);
          }else{
            System.out.println(false);
          }

        

    }

}
