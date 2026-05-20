package inheritance;

public class Bank {
    static void main(String[] args) {
        SavingsAccount sa=new SavingsAccount(13444553,"Lal Kuan",20000);
        sa.getAccNo();
        sa.getBranch();
        sa.getBalance();
        System.out.println("Account no is...."+sa.getAccNo());
        System.out.println("Branch is...."+sa.getBranch());
        System.out.println("Balance is...."+sa.getBalance());
    }
}
