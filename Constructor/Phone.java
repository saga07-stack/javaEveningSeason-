package Constructor;

public class Phone {
    private String model;
    private int price;

    
    public Phone(String model, int price){
        this.model = model;
        this.price = price;
     }
     public void setModel (String model){
        this.model = model;
     }
     public String getModel (){
        return model;
     }
     public int getPrice (){
        return price;
     }
     public void show (){
        System.out.println("phone model is " + model);
        System.out.println(" price is : " + price);
     }
     public void setPrice (int price){
        this.price = price;
     }
     public static void main (String[] args){
        Phone src = new Phone("iphoneX", 2000);
        src.show();
     }

}
