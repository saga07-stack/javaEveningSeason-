package EveningSeason;

public class Child extends Calculator {
    public static void main (String [ ] args){
        Child calc = new Child();
        System.out.println( "adding " +calc.add(10, 20));
        System.out.println("subtract " + calc.subtract(100, 20));

    }
}
