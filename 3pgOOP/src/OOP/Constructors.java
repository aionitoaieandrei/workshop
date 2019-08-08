package OOP;

// Class Declaration

public class Constructors {
    // Instance variables
    int  value1;
    int  value2;

    // Constructor Declaration of Class
    Constructors(){
     value1 = 10;
     value2 = 20;
     System.out.println("Inside 1st Constructor");
    }

    /* Overloading Constructors
    *  Important!! Constructors cannot be overriden
    * */
    Constructors(int a){
        value1 = a;
        System.out.println("Inside 2nd Constructor");
    }
    Constructors(int a,int b){
        value1 = a;
        value2 = b;
        System.out.println("Inside 3rd Constructor");
    }

    // Method
    public void display(){
        System.out.println("Value1 === "+value1);
        System.out.println("Value2 === "+value2);
    }

    public static void main(String args[]){
        Constructors d1 = new Constructors();
        Constructors d2 = new Constructors(30);
        Constructors d3 = new Constructors(30,40);
        d1.display();
        d2.display();
        d3.display();
    }
}
