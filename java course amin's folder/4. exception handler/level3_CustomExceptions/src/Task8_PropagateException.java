
public class Task8_PropagateException {
    public static void divideTwoNum(int num1 , int num2)
    {
        int div = num1/num2;
    }
    public static void calculator()
    {
      divideTwoNum(2,0);
    }
    public static void main (String[]args)
    {
        try{
            calculator();
        }catch(ArithmeticException e)
        {
            System.out.println("can't divide by zero");
        }
    }
}
