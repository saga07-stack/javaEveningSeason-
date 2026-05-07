package InheritancePractice;

public class Eagle extends Bird {
    @Override
    public void fly() {
        // TODO Auto-generated method stub
        super.fly();
        System.out.println("Eagle flies very high");
    }
    public static void main (String[] args){
        Eagle src = new Eagle();
                 src.fly();
        
        
    }
    
}
