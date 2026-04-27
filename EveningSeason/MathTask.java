package EveningSeason;

public class MathTask {
     static int add(int a, int b){
       return a+b;
    }
    static int multiply (int a, int b){
        return a*b;
    } 
    public static void main (String[] args){
        MathTask src = new MathTask();
        int addResult = src.add(20, 20);
        int multiplyResult = src.multiply(10, 10);
        System.out.println(addResult +"\n" + multiplyResult);
    }
}
