import java.util.Scanner;

public class PalindromeNumber 
{
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reversed = 0, original = number;
        while (number > 0) 
        {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }

        if (original == reversed)
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");

        scanner.close();
    }
}
