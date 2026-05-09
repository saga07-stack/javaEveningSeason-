package AbstractP;

public class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("i am a circle");
    }
    public static void main(String[] args){
        Circle src = new Circle();
        src.draw();
    }

}
