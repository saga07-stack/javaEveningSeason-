package CollectionFrameWork;
import java.util.*;
public class User{
    private String name;
private int age;
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getAge() {
return age;
}
public void setAge(int age) {
this.age = age;
}
public User(String name, int age){
this.name = name;
this.age = age;

}
public static void main(String[] args) {
    ArrayList <User> list = new ArrayList<User>();
    list.add( new User("suzuki", 20));
    list.add(new User("tarou", 23));

    for (User a : list){
        System.out.println("name : " + a.name + ", age : " + a.age );
    }


}
}