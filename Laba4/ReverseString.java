public class ReverseString {

    public static void Reverse(String value)
    {
        String temp = "";
        for (int i = value.length(); i > 0; i--) {

            temp = temp + value.charAt(i-1);
        }
        System.out.println("The given string is: " + value);
        System.out.println("The string in reverse order is: " + temp);
    }

}
