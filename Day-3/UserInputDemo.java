import java.util.Scanner;
public class UserInputDemo
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); 

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); 

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble(); 

        System.out.print("Enter your favorite letter: ");
        char favoriteLetter = scanner.next().charAt(0);

        scanner.close();
    }
}
