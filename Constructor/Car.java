package Constructor;

public class Car {
    private String brand;
    private int speed ;
    public Car (String rand, int speed){
        this.brand = rand;
        this.speed = speed;
    }
    public void setBrand (String brand){
        this.brand = brand;
    }
    public String  getBrand(){
        return brand;
    } 
    public void setSpeed (int speed){
        this.speed = speed;
    }
    public int getSpeed (){
        return speed;
    }
    public void show(){
        System.out.println("Brand is " + brand);
        System.out.println(" Speed is " + speed);
    }
    public static void main (String[] args){
    Car src = new Car("toyota", 200);
    src.show();
    }
}
