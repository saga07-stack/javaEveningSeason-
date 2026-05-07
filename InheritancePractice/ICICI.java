package InheritancePractice;

public class ICICI extends HDFC {
    @Override
    public void interest() {
        // TODO Auto-generated method stub
       
        System.out.println("ICICI interest is 9% ");
    }
    public static void main(String[] args){
        ICICI src = new ICICI();
        src.interest();
    }
}
