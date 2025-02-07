public class EvenOddChecker {
    public static void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }

    public static void main(String[] args) {
        checkEvenOdd(10);  // Test with an even number
        checkEvenOdd(7);   // Test with an odd number
    }
}
