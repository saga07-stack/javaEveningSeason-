package TokyoItSchoolSection;

public class adv {
    public static void main (String[] args){
        for(int i = 0; i<=8; i++){
          
            for (int j=8; j>=i; j-- ){
               System.out.print(" ");
            }

            for(int x =0; x<=(2*i); x++ ){
                System.out.print("*");
            }
            System.out.println(" ");


        }
    }
}
