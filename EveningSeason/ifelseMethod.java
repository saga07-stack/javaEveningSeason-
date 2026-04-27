package EveningSeason;

public class ifelseMethod {
   public static int  checker(int num){
     if(num%2 == 1){
      
     System.out.println( num + " is even") ;

     }else{
        System.out.println( num +" is odd");
     }
        return num;
     
    }
    public static void main(String[] args) {
        ifelseMethod src = new ifelseMethod();
         System.out.println(src.checker(10));
    }
}
