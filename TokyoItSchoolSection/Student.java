package TokyoItSchoolSection;

public class Student {
    private String name;
    private int age;
    public Student(String name, int age){
        this.name =name;
        this.age = age;
    }
    public void showName (){
        System.out.println("my name is " + name);
        System.out.println("my age is " + age);
        
    }
}
