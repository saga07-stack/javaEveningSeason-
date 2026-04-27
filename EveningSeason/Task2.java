package EveningSeason;


public class Task2 {

 public int  Add(int a , int b){
return a+b;
}
public int Sub (int a, int b){
    return a-b;
}
public int Multi (int a , int b){
    return a * b;
}
public static void main (String[] args){

Task2 add = new Task2();
int addResult = add.Add(10,20);
int multiResult = add.Multi(20, 10);
int subtract = add.Sub(10, 10);

System.out.println(addResult);
System.out.println(multiResult);
System.out.println(subtract);






}

}
