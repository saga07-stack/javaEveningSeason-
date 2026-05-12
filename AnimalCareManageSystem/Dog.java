package AnimalCareManageSystem;

public class Dog extends Animal implements Runnable  {
  
   Dog(String name, int age){
     super(name, age);
   }

  @Override
    public void fly() {
        // TODO Auto-generated method stub

    }

    
    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("i am running");
    }
    @Override
    void makeSound() {
        // TODO Auto-generated method stub
        System.out.println("bhau bhau");
    }
    public static void main(String[] args) {
        Dog src = new Dog("kukur",2);
        src.fly();
        src.run();
        src.makeSound();
        
    }
    
}
