package Constructor;

public class Inheritance {
    private String hobby;

    void setHobby(String hobby){
        this.hobby= hobby;
    }
    String getHobby(){
        return hobby;
    }
    public Inheritance(){
        System.out.println("Inheritance クラスのコンストラクタが実行されました");
    }
    public static void main(String[] args) {
        Inheritance src = new Inheritance();
        
    }
}
