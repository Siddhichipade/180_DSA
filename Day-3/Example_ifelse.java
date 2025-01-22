import java.util.Scanner;
public class Example_ifelse
{
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        if(age > 18)
        {
            System.out.print("your age is above 18");
        }
        else
        {
            System.out.print("your age is below 18"); 
        }
    }
}