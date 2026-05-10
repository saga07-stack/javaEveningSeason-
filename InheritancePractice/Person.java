package InheritancePractice;

import java.util.Scanner;

public class Person {
    String name;
    public Person (String name){
        System.out.println("person name is " + name );
    int number = 1;
    switch (number) {
        case 1:
            System.out.println("i am one");
            break;
         case 2:
         System.out.println("i am two");
         break;
         case 3:
            System.out.println("i am three");
            break;
        default:
            System.out.println("position not found");
            
    }
    char vowel = 'A';
    // switch (vowel) {
    //     case 'A':
    //         System.out.println("valid vowel");
    //         break;
    //         case 'E':
    //         System.out.println("valid vowel");
    //         break;
    //         case 'I':
    //         System.out.println("valid vowel");
    //         break;
    //         case 'O':
    //         System.out.println("valid vowel");
    //         break;
    //         case 'U':
    //         System.out.println("valid vowel");
    //         break;
    
    //     default:
    //         System.out.println("invalid vowel");
           
    
    
    // }
    switch (vowel) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            System.out.println("vowel");
            break;
    
        default:
            System.out.println("consonant");
            break;
    }
    int day = 1;
    switch (day) {
        case 1:
            System.out.println("sunday");
            break;
            case 2:
            System.out.println("monday");
            break;case 3:
            System.out.println("tuesday");
            break;case 4:
            System.out.println("wednesday");
            break;case 5:
            System.out.println("thursday");
            break;
    
        default:
            System.out.println("weekend");
            break;
    }
    String color = "green";
    switch(color){
        case "red"-> System.out.println("stop");
        case "green"-> System.out.println("go");
        case "yellow" -> System.out.println("stop");
        default -> System.out.println("invalid color");
    }
    Scanner src = new Scanner(System.in);
    System.out.println("enter a number");
    int input = src.nextInt();
    System.out.println("enter a second number");
    int input2 = src.nextInt();

    System.out.println("which operation do you want ");
    String operation = src.nextLine();
    switch (operation) {
        case "+" : 
        System.out.println(input + input2);
            
            break;
            case "-":
                System.out.println( input - input2);
              break;
              case "*":
                System.out.println(input*input2);
            break;
    
        default:
            System.out.println("invalid number");
            break;
    }
    }
}
