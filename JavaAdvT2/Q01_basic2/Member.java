package JavaAdvT2.Q01_basic2;

public class Member {
    private String name;
    private int age;
    private int rank;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age= age;
    }
    public void setRank(int rank){
        this.rank= rank;
    }
    public String getName (){
        return name;
    }
    public int getAge (){
     return age;
    }
    public int getRank(){
        return rank;
    }
    public void rankUp(){
        System.out.println(">> RANKUp>>");
        System.out.println("--Get Rank");
        System.out.println("new Rank" + (++rank));
      
    }
    public void showMember (){
    System.out.println("--show Data--");
        System.out.println("**member data  **");
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println( " rank : " + rank);
        System.out.println("**************");
    }
    
}
