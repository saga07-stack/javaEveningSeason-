package TokyoItSchoolSection;

public class Car {
    private String brand;
   private int price;
    public  Car(String brand, int price){
     this.brand = brand;
     this.price = price;
    }

    public void showDetails (){
        System.out.println("the brand of the car is " + brand);
        System.out.println("the price of the car is " + price);

    }
}
