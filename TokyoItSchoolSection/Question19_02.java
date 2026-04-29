package TokyoItSchoolSection;

public class Question19_02 {
    public static void main (String[] args){
        Question19  test1 = new Question19 ();
        Question19  test2 = new Question19 ();

        test1.setStr("test1");
        test2.setStr("test2");
      //  test2 = test1;
        System.out.println("1つ目は"+ test1.getStr() + "です");
        System.out.println("2つ目は"+ test2.getStr() + "です");


    }
}
