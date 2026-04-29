package EveningSeason;

class Base{
int x;
public int getX(){
    return x;
}
public void setX(int x){
    this.x =x;
}
public void printMe(){
    System.out.println("I am a constructor");
}
}
class Boss extends Base{
    
    public void callme (){
        System.out.println("calling from Boss ");
    }
}
public class Inheritance {
public static void main(String[] args) {
    Boss src = new Boss();
    src.callme();
    src.printMe();
    src.setX(200);
   System.out.println(src.getX());
    
}    
}
