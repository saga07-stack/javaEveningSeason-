package Loops;

public class DoWhile {

    public DoWhile (int input){
        int froctrial = 0;
        for(int i = input; i<=1;i--){
          input*=i;
        }

    }
    public static void main(String[] args) {
        
        // while(i<=10){
        //     System.out.println(i);
        //     i++;
        // }
        // while(i<=30){
        //     System.out.println(i);
        //     i++;
        // }
        // while(i<=20){
        //     if(i%2==0) System.out.println(i);
        //     i++;
        // }
        int n = 1;
        int i = 1;
        while(i<=n){
            System.out.println(" 5  X " + i + " = " + i*5 );
            i++;
        }
    }
}
