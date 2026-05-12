package JavaAdvT2.Q01_basic4;

public class MemberManager {
   private MemberManager(){};
   static void showAllMember ( Member[] members){
    for(Member i : members){
        i.showMember();
    }


   } 
}
