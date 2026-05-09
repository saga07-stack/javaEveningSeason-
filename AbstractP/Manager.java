package AbstractP;

public class Manager extends Employee {
    @Override
    void salary() {
        System.out.println("salary of manager is 4000000");
        
    }
    public static void main(String[] args) {
        Manager manage = new Manager();
     manage.salary();   
       
    }
}
