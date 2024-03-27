package wed;

public class Fruit {
    public String name;
    public String color;
    public double weight;

    public Fruit(String name, String color) {
        this(name, color, 3.0);
    }

    public Fruit(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public Fruit getInstance() {
        return this;
    }

    public static void main(String[] args) {
        Fruit banana = new Fruit("banana", "yellow", 2.3);
        System.out.println(banana.name);
        System.out.println(banana.color);
        System.out.println(banana.weight);
    }
}
