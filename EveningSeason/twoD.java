package EveningSeason;
import java.util.*;
public class twoD {
  static void  add(){
System.out.println("hello");
}
static void calci(int a , int b){
    System.out.println(a+b);
}
public static void main (String[] args){

add();
calci(12, 12);

class1 obj = new class1();
int result = obj.add(12,4);
System.out.println(result);

int [] [] arr = {
  {1,2,3},
  {4,5,6},
  {7,8,9}
};
// System.out.println(arr.length);
// System.out.println(arr[0][2]);
for (int i = 0; i<arr.length; i++){

  for(int j = 0; j<arr[i].length; j++){
   System.out.print(arr[i][j]);
  }
System.out.println(" ");
}
    // sum of the matrix
    int sum =0 ;
    for (int i = 0; i<arr.length; i++){

      for (int j = 0; j<arr[i].length; j++){
         sum += arr[i][j]; 
      }
    }
    System.out.println(sum);

// smallest number in the matrix

       int smallest =arr[0][0] ;
    for (int i = 0; i<arr.length; i++){

      for (int j = 0; j<arr[i].length; j++){
        if(smallest > arr[i][j]  ){
          smallest = arr[i][j];
        }
      }
    }
    System.out.println(smallest);

// printing the sum of  each row in matrix
  int eachSum = 0;
   for (int i = 0; i<arr.length; i++){

      for (int j = 0; j<arr[i].length; j++){
        System.out.print(arr[i][j]);
        eachSum += arr[i][j];
      }
      System.out.println(": " +eachSum);
      eachSum = 0;
    }
// printing the sum of  each column in matrix

    int eachColumn = 0;
    for (int i = 0; i<arr.length; i++){
         eachColumn += arr[i][0];
      for (int j = 0; j<arr[i].length; j++){
       // System.out.print(arr[i][j]);
        
     
       
      }
      eachColumn = 0;
    }


}
}




    

