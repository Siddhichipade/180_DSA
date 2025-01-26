public class Main {
    public static void World() {
        System.out.println("Welcome to my World");
    }

    public static void main(String[] args) {
        World();        // Calling the static method directly
        Main.World();   // Calling the static method using the class name
    }
}
