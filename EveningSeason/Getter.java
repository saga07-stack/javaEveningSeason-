package EveningSeason;

public class Getter {
   private  int age ;
    private String name;
  public void setage(int i){
   age = i;
  }
  public int getage(){
    return age;
  }
  public void setName(String n){
  name =n;
  }
  public String getName(){
    return name;
  }
    public static void main(String[] args){
       Getter src = new Getter();
       src.setage(20);
       src.setName("sagar");
       System.out.println(src.getName());

    }
}
