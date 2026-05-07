package InheritancePractice;

public class HDFC extends Sbi{
    @Override
    public void interest() {
        // TODO Auto-generated method stub
       
        System.out.println("HDFC interest is 8% ");
    }
    public static void main (String[] args){
        HDFC src = new HDFC();
        src.interest();
    }
    
}
