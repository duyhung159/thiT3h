package Bai1;

    // Abstract class Animal
abstract class Animal {
    protected String name; // Thuộc tính name

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Phương thức abstract greets()
    abstract void greets();
}

// Lớp con Cat kế thừa từ Animal
class Cat extends Animal {
    // Constructor
    public Cat(String name) {
        super(name);
    }

    // Override phương thức greets() của Animal
    void greets() {
        System.out.println("Meow");
    }
}

// Lớp con Dog kế thừa từ Animal
class Dog extends Animal {
    // Constructor
    public Dog(String name) {
        super(name);
    }

    // Override phương thức greets() của Animal
    void greets() {
        System.out.println("Woof");
    }

    // Phương thức greets() mới trong lớp Dog
    void greets(String dog) {
        System.out.println("Wooooof");
    }
}

// Lớp con BigDog kế thừa từ Dog
class BigDog extends Dog {
    // Constructor
    public BigDog(String name) {
        super(name);
    }

    // Override phương thức greets() của Dog
    void greets() {
        System.out.println("Wooow");
    }

    // Phương thức greets() mới trong lớp BigDog
    void greets(String dog) {
        System.out.println("Wooooow");
    }
    
}

public class ThiT3h {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Cat và gọi phương thức greets()
        Cat cat = new Cat("Meo");
        cat.greets();

        // Khởi tạo đối tượng Dog và gọi phương thức greets()
        Dog dog = new Dog("Buddy");
        dog.greets();

        // Gọi phương thức greets() mới trong lớp Dog
        dog.greets("Arf");

        // Khởi tạo đối tượng BigDog và gọi phương thức greets()
        BigDog bigDog = new BigDog("Max");
        bigDog.greets();

        // Gọi phương thức greets() mới trong lớp BigDog
        bigDog.greets("Grr");
    }
}


