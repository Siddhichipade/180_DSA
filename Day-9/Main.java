abstract class Animal {
    // Abstract method (no body)
    abstract void makeSound();

    // Concrete method (has body)
    void sleep() {
        System.out.println("Sleeping...");
    }
}
class Dog extends Animal {
    // Providing implementation for the abstract method
    @Override
    void makeSound() {
        System.out.println("Woof Woof!");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Polymorphism
        myDog.makeSound(); // Calls the implemented method
        myDog.sleep();     // Calls the concrete method from the abstract class
    }
}
