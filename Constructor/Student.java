package Constructor;

public class Student {
    private String name;
    private int age;
    public Student(String name, int age){
        this.name = name;
        this.age = age;

    }
    public void setName (String name){
        this.name = name;

    }
    public void setAge (int age){
        this.age = age;
    }
    public void show(){
        System.out.println("my name is " + name);
        System.out.println(" my age is " + age);
    }
    public static void main (String[] args) {
        Student src = new Student("sagar", 32);
        src.show();
    }

}
