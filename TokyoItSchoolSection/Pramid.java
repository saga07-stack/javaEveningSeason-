package TokyoItSchoolSection;

public class Pramid {
    public static void main (String[] args){
        for(int i = 0; i<10; i++){
      
        for(int j = 8; j>i; j--){
            System.out.print(" ");
          
        }
            for(int x = 0; x<=(i*2); x++){
        
           System.out.print("*");
            }
        System.out.println();
           
        }
    }
}
