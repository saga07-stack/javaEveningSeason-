package Loops;

public class Multiplication {
 public Multiplication ( int b){
  for(int i = 1; i<=10; i++){
    
        System.out.println ( b + " * " + i + " = " + i * b);
    
  }
 }
 public static void main(String[] args) {
   Multiplication table = new Multiplication(3);
   int num = 2356;
   int reversed = 0;
   while (num > 0) {
  int last_digit = num % 10;
  reversed = reversed * 10 + last_digit;
  num = num / 10;
}

 }

}
