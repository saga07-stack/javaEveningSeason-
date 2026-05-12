package Students;

public class StudentInfo extends Register{
    
    @Override
    void aboutStudent() {
        System.out.println(" i am override from studentinfo");
    }
    StudentInfo(String name, int age){
        super(name, age);
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        
        
         

    }


}
