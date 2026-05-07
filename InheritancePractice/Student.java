package InheritancePractice;

public class Student extends Person {
    int age;
    public Student (String name , int age ){
        super( name );
        System.out.println(age);

    }

    public static void main(String[] args) {
       Student obj = new Student("sagar", 25); 

    }
}
