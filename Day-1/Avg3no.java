import java.util.Scanner;

public class Avg3no {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter Second Number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter Thrid Number: ");
        double num3 = scanner.nextDouble();

        double average = (num1 + num2 + num3) / 3;

        System.out.println("The average is: " + average);


    }
    
}
