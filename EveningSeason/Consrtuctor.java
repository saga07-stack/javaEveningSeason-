package EveningSeason;

public  class Consrtuctor {
    private int salary1;
    private String name;
    public Consrtuctor(){
        salary1 = 20;
        name = "sagar";
 
    }
public Consrtuctor(String employeName,int salary){
 name = employeName;
 salary1 = salary;
}

public void setName (String n){
 name = n;
}
public String getName(){
    return name;
}
public void setSalary(int s){
    salary1 = s;
}
public int getSalary(){return salary1;}


public static void main (String[] args){
    Consrtuctor src = new Consrtuctor("codeWithSaga",56);
 System.out.println(src.getName());
 System.out.println(src.getSalary());

}
    
}