public class Task6_multipleCatchBlocks {
    public static void main (String[] args)
    {
    String name = null;
    int a ,b;
    a= 10 ;
    b= 0 ;
    try{
        System.out.println(name);
        System.out.println(a/b);
    } catch (NullPointerException e) {
        System.out.println("Enter text");
    }catch (ArithmeticException e)
    {
        System.out.println("Can't divide by zero");
    }



    }
}
