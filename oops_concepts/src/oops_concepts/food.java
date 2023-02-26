package oops_concepts;

abstract class food1 {
    String name;
    String colour;
    int price;

    public food1(String name, String colour, int price) {
        this.name = name;
        this.price = price;
        this.colour = colour;
    }

    public abstract void whattype();
}

class Burger extends food1 {
    public Burger(String name, String colour, int price) {
        super(name, colour, price);
    }

    public void whattype() {
        System.out.println("type: fastfood");
    }
}

class Cabbage extends food1 {
    public Cabbage(String name, String colour, int price) {
        super(name,colour, price);
    }

    public void whattype() {
        System.out.println("type: vegetable");
    }
}

public class food {
    public static void main(String[] args) {
        Burger burger = new Burger("Maharaja mac", "brown", 100);
        System.out.println("Name: " + burger.name);
        System.out.println("colour: " + burger.colour);
        System.out.println("price: " + burger.price);
        burger.whattype();
        
        Cabbage cabbage = new Cabbage("Cabbage", "green", 50);
        System.out.println("Name: " + cabbage.name);
        System.out.println("colour: " + cabbage.colour);
        System.out.println("price: " + cabbage.price);
        burger.whattype();
    }
}

