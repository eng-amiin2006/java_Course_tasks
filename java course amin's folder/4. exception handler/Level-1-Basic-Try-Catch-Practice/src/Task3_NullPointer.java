
public class Task3_NullPointer {

    public static String toUpper_case(String s)
    {
        try{
            return s.toUpperCase();
        } catch (NullPointerException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        String name =null;
        String result =toUpper_case(name);
        System.out.println(result);
    }
}