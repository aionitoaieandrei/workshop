package HowToClass;

// Class Declaration
public class Dog {
    // Instance Variables
    String breed;
    String size;
    int age;
    String color;


    // method 1
    public String getInfo() {
        return ("Breed is: "+breed+" \nSize is: "+size+" \nAge is: "+age+" \nColor is: "+color);
    }

    public static void eat(Dog dog) {
        System.out.println("Dog " + dog.breed + " eats food");
    }

    public static void run(Dog dog) {
        System.out.println("Dog " + dog.breed + " runs with ball");
    }


    public static void main(String[] args) {
        Dog maltese = new Dog();
        maltese.breed = "Maltese";
        maltese.size = "Small";
        maltese.age = 2;
        maltese.color = "white";

        System.out.println(maltese.getInfo());

        Dog beagle = new Dog();
        beagle.breed = "Beagle";
        beagle.size = "Medium";
        beagle.age = 3;
        beagle.color = "Brown and white";

        eat(maltese);
        run(beagle);
        run(maltese);
    }
}