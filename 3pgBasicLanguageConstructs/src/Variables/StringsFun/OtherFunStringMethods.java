package Variables.StringsFun;

public class OtherFunStringMethods {
    public static void main(String[] args){
        //Check if String contains a sequence
        String str_Sample = "RockStar";
        System.out.println("Contains sequence 'tar': " + str_Sample.contains("tar"));
        System.out.println("EndsWith character 'r': " + str_Sample.endsWith("r"));
        System.out.println("Replace 'Rock' with 'Duke': " + str_Sample.replace("Rock", "Duke"));
        System.out.println("Convert to LowerCase: " + str_Sample.toLowerCase());
        System.out.println("Convert to UpperCase: " + str_Sample.toUpperCase());
    }
}