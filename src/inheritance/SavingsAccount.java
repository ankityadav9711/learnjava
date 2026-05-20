package inheritance;

public class SavingsAccount extends Account{
    private int balance;
    public SavingsAccount(int accNo,String branch,int balance){
        super(accNo, branch);
        this.balance=balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
}
