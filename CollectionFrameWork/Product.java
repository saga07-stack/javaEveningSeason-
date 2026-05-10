package CollectionFrameWork;
import java.util.*;
public class Product {
    private String name;
    private int price;
    public void setName (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setPrice (int price){
        this.price= price;
    }
    public int getPrice (){
        return price;
    }
    public Product(String name, int price){
       this.name= name;
       this.price = price;
    }
    public static void main(String[] args) {
        ArrayList <Product> productList = new ArrayList<>();
        productList.add(new Product("apple", 230));
        productList.add(new Product("banana", 200));
        productList.add(new Product("cherry", 2345));

        for(Product list :  productList ){
            System.out.println("Item : " + list.name + " , price " + list.price  +" yen" );

        }

    }
}
