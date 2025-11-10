
import java.util.List;
class Fruit { }
class Apple extends Fruit { }
class Mango extends Fruit { }
class FruitBox<T extends Fruit> {
    private java.util.List<T> fruits = new java.util.ArrayList<>();
    public void add(T fruit) {
        fruits.add(fruit);
    }
    public void display() {
        for (T f : fruits)
            System.out.println(f.getClass().getSimpleName());
    }
    public static void main(String[] args) {
        FruitBox<Fruit> box = new FruitBox<>();
        box.add(new Apple());
        box.add(new Mango());
        box.display();
    }
    public List<T> getFruits() {
        return fruits;
    }
    public void setFruits(List<T> fruits) {
        this.fruits = fruits;
    }
}
