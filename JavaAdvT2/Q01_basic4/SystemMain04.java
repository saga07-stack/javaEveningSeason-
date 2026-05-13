package JavaAdvT2.Q01_basic4;

public class SystemMain04 {
 public static void main(String[] args) {
    
    Member src = new Member();
    // line no 7.1 ma aayera aadkeako chau aayera teslai complete garne ;
//   int num  = 2343;
//   int reversed = 0;
//   while (num>0){
//    int lastDigit = num% 10;
//    reversed = reversed * 10 + lastDigit;
//    num = num / 10;
//   }
//   System.out.println(reversed);
//   int num1 = 324234;
//   int sum = 0;
//   while(num1>0){
//   int lastDigit = num1% 10;
//    sum += lastDigit;
//    num1 = num1 /10;
//   }
//   System.out.println(sum);
 int num = 10;
 boolean isPrime = true;
 if(num<=1){
   isPrime = false;

 }else{
   for(int i =2; i<= num/2; i++){
      if(num % i == 0){
         isPrime = false;
     
   }
 }
 }   
 System.out.println(isPrime);

 }
}
