package Constructor;

public class Resturant {
    private String restName;
    private int rating ;
    public Resturant ( String restName, int rating){
        this.rating = rating;
        this.restName = restName;
    }
    public void setRating (int rating){
        this.rating = rating;
        
    }
    public void setRestName (String name){
        this.restName = name;
    }
    public String getRestName (){
        return restName;

    }
    public int getRating (){
        return rating;
    }
    public void show (){
        System.out.println(" Restaurant name is  " + restName + " has " + rating + " stars");
    }
    public static void main(String[] args) {
        Resturant src = new Resturant("abd", 3);
        src.show();
        
      
  }  
  }