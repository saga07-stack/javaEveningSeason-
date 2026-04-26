package EveningSeason;

import java.util.Scanner;

public class Ifelse {
public static void main (String[] args){
    Scanner sc =  new Scanner(System.in);
    System.out.println("give me a number i will check the number is odd or even ");
    int number = sc.nextInt();
    if(number % 2 == 0){
        System.out.println(number+ " is even ");
    }else{
        System.out.println(number + " is odd ");
    }
    
    
    }
    

}
