package OOP;

import OOP.Encapsulation.OOPEncapsulation;

public class runOOP {
    private static OOPEncapsulation oopObject;
    private static UnstructuredProgramming unstructuredObject;

    public static void main(String args[]){
        System.out.println("Unstructured Programming");
        unstructuredObject = new UnstructuredProgramming();
        unstructuredObject.check_account_balance();

        System.out.println("\nOOP Programming");
        oopObject = new OOPEncapsulation();
        oopObject.setAccount_balance(10);
        oopObject.setAccount_number(1);
        oopObject.update_account_balance(100);
        oopObject.check_account_balance();
        oopObject.update_account_balance(1000);
        oopObject.check_account_balance();
    }
}
