package inheritance;

public class Account {
    private int accNo;
    private String branch;
    public Account(int accNo,String branch){
        this.accNo=accNo;
        this.branch=branch;
    }

    public void setAccNo(int accNo) {

        this.accNo = accNo;
    }

    public void setBranch(String branch) {

        this.branch = branch;
    }

    public int getAccNo() {
        return accNo;
    }

    public String getBranch() {
        return branch;
    }
}
