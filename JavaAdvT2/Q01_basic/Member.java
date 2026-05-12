package JavaAdvT2.Q01_basic;

public class Member {
     String name;
     int age;
     int rank;

    // public void setName(String name){
    //     this.name = name;
    // }
    // public void setAge(int age){
    //     this.age= age;
    // }
    // public void setRank(int rank){
    //     this.rank= rank;
    // }
    // public String getName (){
    //     return name;
    // }
    // public int getAge (){
    //  return age;
    // }
    // public int getRank(){
    //     return rank;
    // }
     public Member (String name, int age, int rank){
        this.name = name;
        this.age = age;
        this.rank = rank;
     }

     public void showMember(){
        System.out.println("--show Data--");
        System.out.println("**member data  **");
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println( " rank : " + rank);
        System.out.println("**************");
     }


    
}
