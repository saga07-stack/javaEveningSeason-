package TokyoItSchoolSection;
public class Question11 {
private String title;
private int price;
 public  Question11(String title , int price){
    this.price = price;
    this.title = title;
}
public void setTitle (String title){
    this.title = title;
}
public void setPrice (int price){
    this.price = price;
}
public int getPrice (){
    return price;
}
public String getTitle (){
    return title;
}

public void show(){
    System.out.println(" the title of the book is " + title);
    System.out.println(" the price of the book is " + price);
      
}
public static void main(String[] args) {
     Question11 src = new Question11("java", 10);
     src.show();
}
    
}