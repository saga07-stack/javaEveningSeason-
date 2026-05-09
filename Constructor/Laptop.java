package Constructor;

public class Laptop {
    private String company ;
    private int ram ;
    public Laptop ( String company, int ram){
        this.company = company;
        this.ram = ram;
    }
    public void setCompany ( String company){
        this.company = company;
    }
    public void setRam ( int ram ){
        this.ram = ram;
    }
    public void show (){
        System.out.println(" laptop company name is " + company);
        System.out.println(" ram inside this laptop is " + ram);
    }
    public static void main (String [] args){
        Laptop src1 = new Laptop("tossiba", 20);
        Laptop src2 = new Laptop("macbook", 22);
        src1.show();
        src2.show();
    }
}
