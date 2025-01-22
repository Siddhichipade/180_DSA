import java.util.Scanner;
public class Example_elseif
{
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        if(age < 0)
        {
            System.out.print("invalid age number shouls be positive");
        }
        else if(age <= 18)
        {
            System.out.print("your are minnor"); 
        }
        else if(age <= 60)
        {
            System.out.print("your are adult"); 
        }
        else
        {
            System.out.print("your are senior citizen");  
        }
        scanner.close();
    }
}