package Interface;

public class Phone implements Camera,Gps,Payable {
   public void play(){
 System.out.println("i am playing ");
   } 
   public void location(){
    System.out.println("nawalpur");
   }
   public void photo(){
    System.out.println("taking a photo");
   }
   public static void main (String[] args){
   Phone src = new Phone();
   src.location();
   src.photo();
   src.play();

   }

}
