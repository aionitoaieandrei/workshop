package OOP;

public class UnstructuredProgramming {

    private int account_number=20;
    private int account_balance=100;

    public void check_account_balance(){
        account_balance=account_balance+100;
        System.out.println("Account Number = " + account_number);
        System.out.println("Account Balance = " + account_balance);

        account_balance=account_balance+50;
        System.out.println("Account Number = " + account_number);
        System.out.println("Account Balance = " + account_balance);

        account_balance=account_balance+25;
        System.out.println("Account Number = " + account_number);
        System.out.println("Account Balance = " + account_balance);
    }
}
