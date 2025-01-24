public class ExReturn
{
    double avg(double x, double y)
     {
        double res = (x + y) / 2.0;
        return res;    
    }
    public static void main(String[] args) {
        System.out.println(new ExReturn().avg(5.5, 6.5));
    }
}