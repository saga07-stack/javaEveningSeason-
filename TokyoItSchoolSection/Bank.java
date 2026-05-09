package TokyoItSchoolSection;

public class Bank {
    private int balance;
    static int totalBalance = 0;
    
    public Bank (int initialBalance){
        this.balance = initialBalance;
        totalBalance += initialBalance; 
    }
    public void deposit (int amount){
        balance += amount;
        totalBalance += amount;
    }

    public int getBalance(){
        return balance;
    }
    static int getTotalBalance(){
        return totalBalance;
    }
}
