package sigletondesignpatterns;

public class StringReverse {
    public static void main(String[] args) {
        String str = "shrikar";
        String reversed = reverseString(str);
        System.out.println("The reversed string is: " + reversed);
    }

    public static String reverseString(String str)
    {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        System.out.println(str);
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
