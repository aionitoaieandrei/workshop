package Variables.StringsFun;

public class Concatenate{
    public static void main(String[] args) {

        //String Concatenation
        String str1 = "Be";
        String str2 = "the QA!";

        //Method 1 : Using concat
        String str3 = str1.concat(str2);
        System.out.println(str3);

        //Method 2 : Using "+" operator
        String str4 = str1 + str2;
        System.out.println(str4);
    }
}