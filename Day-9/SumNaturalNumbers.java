public class SumNaturalNumbers {
    public static int sum(int n) {
        if (n == 0) {  // Base case
            return 0;
        }
        return n + sum(n - 1);  // Recursive call
    }

    public static void main(String[] args) {
        int n = 5;  // Calculate sum of first 5 natural numbers
        System.out.println("Sum of first " + n + " natural numbers: " + sum(n));
    }
}
