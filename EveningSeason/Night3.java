package EveningSeason;
import java.util.*;
public class Night3 {
    public static void main(String[] args) {
  /* 
     Float num = 20f;
  Boolean is_true = true;
  System.out.println(is_true);
  System.out.println(num);
  System.out.println(height);

*/
//      Double height = 165.5;
//      String name = "sagar";
//      Integer age = 24;
//      char section = 'A';

//   System.out.printf("my Name is %s and my age is %d and my height is %.2f and section is %c",name,age,height,section);
   
 Scanner src = new Scanner(System.in);
 System.out.print("what is your age: ");
 int age = src.nextInt();
 src.nextLine();
 System.out.print("what's your name ? ");
 String name1 = src.nextLine();
        System.out.println("what is your height ? ");
        double height = src.nextDouble();

 System.out.print("Your name is "+ name1 + " And your age is "+ age+" And your height is  "+ height);
        src.close();

        String hello = "hello sagar ";
        System.out.println(hello.substring(2,5));

        System.out.println(hello.toUpperCase());
        System.out.println(hello.toLowerCase());
    }
    
}
