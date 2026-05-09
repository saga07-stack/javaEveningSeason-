package AbstractP;

public class Rectangle extends Circle {
    @Override
    void draw() {
        
        System.out.println("i am drawing rectangle");
    }
    public static void main (String [] args){
        Rectangle src = new Rectangle();
        src.draw();

    }
}
