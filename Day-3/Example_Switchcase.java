import java.util.Scanner;

public class Example_Switchcase {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your day: ");
        String day = scanner.nextLine();        
        switch (day)
        {
        case "Monday":
            System.out.print("You entered Monday");
            break;
         case "Tuesday":
            System.out.print("You entered tuesday");
            break;
        case "Wednesday":
            System.out.print("You entered Wednesday");
            break;
         case "thursday":
            System.out.print("You entered thursday");
            break;
         case "Friday":
            System.out.print("You entered Friday");
            break;
         case "Saturday":
            System.out.print("You entered Saturday");
            break;
         case "Sunday":
            System.out.print("You entered Sunday");
            break;
         default:
            System.out.print("you not enter any day between 1 to 7 day");
            break;
        }
        scanner.close();
    }
}
   