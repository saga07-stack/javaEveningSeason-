package TokyoItSchoolSection;

public class Question12_01 {
    public static void main(String[] args){
        Bank sampleTaro = new Bank(10000);
        Bank testHanako = new Bank(900000);
        sampleTaro.deposit(70000);
        testHanako.deposit(30000);

        System.out.println("total " + Bank.getTotalBalance());
        System.out.println("tarou balance" + sampleTaro.getBalance());
        System.out.println(" testHanako balance " + testHanako.getBalance());
    }
}
