package TokyoItSchoolSection;

public class Product {
    private String name;
    private int price;

    public Product (String name, int price){
        this.name = name;
        this.price = price;
    }

    public void showProduct (){
        System.out.println("the name of the product is " + name);
        System.out.println("the price of the product is " + price);
    }
    public void discount (int discount){
    
     price = price -(price * discount/ 100);

    }
}
