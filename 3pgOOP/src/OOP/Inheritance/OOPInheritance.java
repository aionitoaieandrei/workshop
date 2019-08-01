package OOP.Inheritance;

class Parent {
    private String parentSalary = "A lot";

    public String toys = "Drones";
    public String parentCar = "Ferrari";
}

class BigBrother extends Parent {
    private String newToys = "New toys";
    protected String toysToShareWithBrotherOnly = "Shared toys";

    public String toys = "Toys";
    public String oldToys = "Old toys";
}

class BabyBrother extends BigBrother {
    public String toys = "Small toys";
}


public class OOPInheritance {
    public static void main(String[] args) {
        BigBrother andrei = new BigBrother();
        BabyBrother radu = new BabyBrother();

        /* Will inherit the parentCar from the Parent Class */
        System.out.println("BigBrother does NOT have a car but it will inherit it from the Parent --> " + andrei.parentCar);

        /* Class child has toys so will not look further to inherit the toys from the Parent */
        System.out.println("BigBrother has toys --> " + andrei.toys);

        System.out.println("Parent also has toys --> " + ((Parent) andrei).toys);

//        System.out.println("BigBrother does not have access to Parent salary" + andrei.parentSalary);

        System.out.println("BabyBrother also inherits Parent car --> " + radu.parentCar);

        System.out.println("BabyBrother also inherits oldToys from BigBrother --> " + radu.oldToys);

//        System.out.println("BabyBrother cannot inherit newToys from BigBrother" + radu.newToys);

    }
}
