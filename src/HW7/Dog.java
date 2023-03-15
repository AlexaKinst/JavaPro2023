package HW7;

public class Dog extends Animal {

    static int dogs;

    public Dog(String name) {
        this.name = name;
        dogs++;
    }

    public static int getDogs() {
        return dogs;
    }

    public void run(int distance) {
        if (distance <= 500) {
            System.out.println(this.name + " пробігла " + distance + " метрів.");
        } else {
            System.out.println(this.name + " не хоче бігати, тому вирішила піти поїсти.");
        }
    }

    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println(this.name + " проплила " + distance + " метрів.");
        } else {
            System.out.println("Не так вже й " + this.name + " любить плавати.");
        }
    }
}
