// Java Program to call Abstract Methods

abstract class Exabstract 
{
    // Creating abstract method
    abstract void check(String n);
}

// Main class extending to helper class
public class GFG extends Exabstract {

    public static void main(String[] args) {
      
        // Creating the instance of the class
        GFG ob = new GFG();

        // Accessing the abstract method
        ob.check("GFG");
    }

    // Extends the abstract method
    @Override void check(String n)
    {
        System.out.println(n);
    }
}