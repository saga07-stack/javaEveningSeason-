package Interface;

public class Voice implements Talk2  {
    @Override
    public void cry() {
        System.out.println("猫が鳴きました");
        
    }
    @Override
    public void bark() {
       System.out.println("犬が吠えました"); 
        
    }
}
