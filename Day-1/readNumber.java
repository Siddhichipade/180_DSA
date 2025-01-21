In this challenge, you must read 3 integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.

public class Solution {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    
        scanner.close();
    }
}

Solution:
42
100
125