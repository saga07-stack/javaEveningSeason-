package TokyoItSchoolSection;

public class Book {
   private String title;
   private int price;

//    public void setBook (String title){
//    title = this.title;
//    }
//    public void setPrice (int price){
//     this.price = price;
//    }
//    public int getPrice (){
//     return price;
//    }
//    public String getBook(){
//     return title;
//    }
public  Book(String title, int price){
 this.title = title;
 this.price = price;
}


 public void show(){
    System.out.println("the title of the book is " + title);
    System.out.println("this is the price of the book" + price);
 }

}
