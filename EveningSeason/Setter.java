package EveningSeason;

public class Setter {
    private int age ;
    private String name;

    public void setAge (int i){
        age = i;
    }
    public int getAge (){
        return age;
    }
    public void setName (String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public static void main (String[] args){
        Setter src = new Setter();
        src.setAge(20);
        System.out.println(src.getAge());
        src.setName("sagarrrr");
        System.out.println(src.getName());
    }
}
