package HW7;

public class Animal {
    static int animals;
    String name;


    public Animal() {
        animals++;
    }

    public void run(int distance) {
        System.out.println(this.name + "пробіг " + distance + " метрів.");
    }

    public void swim(int distance) {
        System.out.println(this.name + "проплив " + distance + " метрів.");
    }
}
