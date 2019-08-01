package OOP;

public class OOPProgramming {
    private int account_number;
    private int account_balance;

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public int getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(int account_balance) {
        this.account_balance = account_balance;
    }

    public void check_account_balance(){
        System.out.println("Account Number = " + getAccount_number());
        System.out.println("Account Balance = " + getAccount_balance());
    }

    public void update_account_balance(int how_much){
        account_balance = account_number + how_much;
    }
}