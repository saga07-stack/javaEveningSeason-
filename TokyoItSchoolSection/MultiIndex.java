package TokyoItSchoolSection;

public class MultiIndex {
    public static void main (String [] args){
        int [] []num4 = {{10,20,30},{40,50,60}};
        System.out.println(num4.length);
         for(int i=0; i<num4[0].length; i++){
            System.out.println("１段目の"+(i+1)+"つ目の値は"+num4[0][i]);
            if(i == 2){
                for(int j =0; i<num4[1].length; j++){
                System.out.println("2 段目の"+(j+1)+"つ目の値は"+num4[1][j]);


                }
            }
         }
    }
}
