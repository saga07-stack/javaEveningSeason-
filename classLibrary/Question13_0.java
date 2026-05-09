package classLibrary;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question13_0{
public static void main(String[] args) throws IOException {
System.out.println("半角英字を入力してください。");
BufferedReader reader = new BufferedReader(new
InputStreamReader(System.in));
String str = reader.readLine();

if (str.matches("[a-zA-Z]+")){
    System.out.println(str + " は半角英字です。");
}else{
    System.out.println(str + " は半角英字ではありません。");
}
}
}
    

