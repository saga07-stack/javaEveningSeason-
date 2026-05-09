package Constructor;

public class Employee {
    private String employeeName ;
    private int salary;
    public Employee (String employeeName, int salary){
        this.employeeName = employeeName;
        this.salary = salary;
    }
    public void setEmployeenName (String employeeName){
        this.employeeName = employeeName;
    }
    public void setSalary (int salary){
        this.salary = salary;
    }
    public int getSalary (){
        return salary;
    }
    public String getEmployeeName (){
        return employeeName;
    }
    public void show (){
        System.out.println(" employee name :" + employeeName);
        System.out.println(" salary : " + salary);
    }
    public static void main (String[] args ){
        Employee src = new Employee("sagar", 2000);
        src.show();
    }
}
