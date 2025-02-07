class Rectangle {
    int length, width;

    // Default Constructor
    Rectangle() {
        length = 10;
        width = 5;
    }

    // Parameterized Constructor
    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    void area() {
        System.out.println("Area: " + (length * width));
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(); // Calls Default Constructor
        Rectangle r2 = new Rectangle(15, 7); // Calls Parameterized Constructor

        r1.area();
        r2.area();
    }
}
