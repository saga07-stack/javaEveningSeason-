package EveningSeason;

public class Constructor {
    private int id;
    private String employeeName;
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
    public void setEmployeeName (String n){
        employeeName = n;
    }
    public String getEmployeeName(){
        return employeeName;
    }
    public  Constructor(int a, String name){
      id = a;
     employeeName = name;

    }
    public static void main (String[] args ){
        Constructor src = new Constructor(2001, "Sagar");
        System.out.println(src.getEmployeeName());
        System.out.println(src.getId());
    }
    
}
