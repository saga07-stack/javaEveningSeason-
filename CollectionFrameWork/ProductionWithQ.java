package CollectionFrameWork;
import java.util.*;
public class ProductionWithQ {
    private String product ;
    private int price;
    private int quantity;

    void setProduct(String product ){
        this.product = product ;
    }

    void setPrice (int price){
        this.price = price;
    }
    void setTotal (int quantity){
        this.quantity = quantity;
    }
    String getProduct (){
        return product;
    }
    int getPrice (){
        return price;
    }
    int getQuantity(){
        return quantity;
    }
     public ProductionWithQ(String product, int price, int quantity ){
          
          this.product = product;
          this.price = price;
          this.quantity = quantity;

       }

       public static void main(String[] args) {

        ArrayList<ProductionWithQ> products = new ArrayList<>();
        int total = 0;

        products.add(new ProductionWithQ("banana", 20, 30))   ;
        products.add(new ProductionWithQ("apple", 230, 1));
        products.add(new ProductionWithQ("pineapple", 188, 2));

        for( ProductionWithQ j : products ){

            System.out.println(" item : " + j.product + " price : " + j.price + " quantity " + j.quantity + " total " +  ( total += ( j.price * j.quantity ) ) );

        }     

 

       }

}
