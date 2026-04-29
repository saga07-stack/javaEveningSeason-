package EveningSeason;

public class Tcons {
    private int salary;
    private String name;
    public void setSalary (int s){
        salary = s;
    }
    public int getSalary (){
        return salary;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
     public Tcons (){
     salary = 2000;
       name = "sagar";
     }
     public Tcons (String n , int s){
        name = n;
        salary = s;
     }
    // Tcons src = new Tcons(){
    // };
    
    public static void main (String [] args){
     
     Tcons src = new Tcons("codeWithSaga", 20000);
     System.out.println(src.getSalary());
     System.out.println(src.getName());



    }
}
