import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
    }
}
