public class StringCompare {


    public static void Compare(String first, String second)
    {

        int test = first.compareToIgnoreCase(second);

        if (test==0) {
            System.out.println("Result: " + first + " is equal to " + second);
        }
        if (test < 0)
        {
            System.out.println("Result: " + first + " is less than " + second);
        }
        if (test > 0)
        {
            System.out.println("Result: " + first + " is more than " + second);
        }

    }

}
