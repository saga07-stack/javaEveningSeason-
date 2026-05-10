package Interface;

public class Prepration implements Question17_01,Question17_pre {
    @Override
    public void display() {
        
        System.out.println("インターフェイス Preparation を実装しました");
    }
    @Override
    public void show() {
        System.out.println("インターフェイス Question17_pre を実装しました");
        
    }
    public static void main(String[] args) {
        Prepration src = new Prepration();
        src.display();
        src.show();
    }
}
