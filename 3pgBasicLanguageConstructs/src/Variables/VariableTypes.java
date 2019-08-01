package Variables;

public class VariableTypes {
    static VariableTypes variableTypes;
    int data = 99; //instance variable
    static int a = 1; //static variable
    static int method() {
        System.out.println("Inside method");
        int a = 90; //local variable
        return a;
    }

    public static void main(String[] args) {

        System.out.println(method());
        variableTypes =  new VariableTypes();
        System.out.println("Instance variable: " + variableTypes.data);
//        System.out.println("Instance variable can be accessed only from instance" + data);
        System.out.println("Static variable after method() was called: " + a);
    }
}
