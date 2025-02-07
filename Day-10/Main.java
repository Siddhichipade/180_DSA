class Student1 {
    String name;
    int age;
    int mark;

    // Constructor
    Student(String studentName, int studentAge, int studentmarks) {
        name = studentName;
        age = studentAge;
        mark = studentmarks; // Correct variable assignment
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Mark: " + mark); // Fixed syntax and variable name
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20, 50);
        Student s2 = new Student("Bob", 22, 90);

        s1.display();
        s2.display();
    }
}
