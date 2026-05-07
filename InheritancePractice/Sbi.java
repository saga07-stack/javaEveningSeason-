package InheritancePractice;

public class Sbi extends Bank {
    @Override
    public void interest() {
        // TODO Auto-generated method stub
        
        System.out.println("SBI interest is 7%");
    }
    public static void main(String[] args) {
        Sbi src = new Sbi();
        src.interest();
        System.out.println();

    }
}
