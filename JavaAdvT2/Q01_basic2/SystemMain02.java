package JavaAdvT2.Q01_basic2;

public class SystemMain02 {
    public static void main(String[] args) {
        Member src = new Member();
        src.setAge(30);
        src.setName("Miura Manabu");
        src.setRank(1);
     
           
         src.showMember();
         src.rankUp();
         src.getRank();

    }
    
}
