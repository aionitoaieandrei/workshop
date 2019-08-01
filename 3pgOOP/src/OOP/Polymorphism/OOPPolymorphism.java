package OOP.Polymorphism;

abstract class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }
    public String speak() {
        return name + " says " + sound();
    }
    public abstract String sound();
}
/* Notice how sound() is overriden */

class Cow extends Animal {
    public Cow(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "moooooo";
    }
}

class Horse extends Animal {
    public Horse(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "neigh";
    }
}

class Sheep extends Animal {
    public Sheep(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "baaaa";
    }
}

public class OOPPolymorphism {
    public static void main(String[] args) {
        Animal h = new Horse("Black Beauty");
        System.out.println(h.speak());
        Animal c = new Cow("Bessie");
        System.out.println(c.speak());
        System.out.println(new Sheep("Little Lamb").speak());
    }
}