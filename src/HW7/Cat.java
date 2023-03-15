package HW7;

public class Cat extends Animal {

    static int cats;

    public Cat(String name) {
        this.name = name;
        cats++;
    }

    public static int getCats() {
        return cats;
    }

    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(this.name + " пробіг " + distance + " метрів.");
        } else {
            System.out.println(this.name + " заморився і ліг відпочити.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(this.name + " не вміє ще плавати");
    }
}

