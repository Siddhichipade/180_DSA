public class grand
{
    public static void gfather()
    {
        System.out.println("Hello GrandPaa");
    }
    public static void father()
    {
        System.out.println("Hello Father");
    }
    
    public static void main(String[]args)
    {
    gfather();
    grand obj = new grand();
    obj.father();
    }
}