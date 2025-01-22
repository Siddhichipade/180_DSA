public class OperatorsDemo {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Bitwise Operators
        System.out.println("\nBitwise Operators:");
        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));
        System.out.println("~a: " + (~a));
        System.out.println("a << 1: " + (a << 1));
        System.out.println("a >> 1: " + (a >> 1));

        // Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = 20;
        System.out.println("c = " + c);
        c += 5;
        System.out.println("c += 5: " + c);
        c -= 5;
        System.out.println("c -= 5: " + c);
        c *= 2;
        System.out.println("c *= 2: " + c);
        c /= 2;
        System.out.println("c /= 2: " + c);
        c %= 3;
        System.out.println("c %= 3: " + c);

        // Unary Operators
        System.out.println("\nUnary Operators:");
        int d = 10;
        System.out.println("d: " + d);
        System.out.println("++d: " + (++d));
        System.out.println("d++: " + (d++));
        System.out.println("d: " + d);
        System.out.println("--d: " + (--d));
        System.out.println("d--: " + (d--));
        System.out.println("d: " + d);

        // Ternary Operator
        System.out.println("\nTernary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b: " + max);

        // instanceof Operator
        System.out.println("\ninstanceof Operator:");
        String str = "Hello";
        System.out.println("str instanceof String: " + (str instanceof String));
    }
}
