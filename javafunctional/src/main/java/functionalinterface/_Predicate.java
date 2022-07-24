package functionalinterface;
import java.util.function.Predicate;
public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("0700000000"));
        System.out.println(isPhoneNumberValid("09845484475"));
        System.out.println("with _Predicate Examples");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("0700000000"));
        System.out.println(
                "Is phone number is valid and contains number 3 = "+
                isPhoneNumberValidPredicate.and(containsnumber3).test("0700000000")
        );
        System.out.println(
                "Is phone number is valid and contains number 3 = "+
                        isPhoneNumberValidPredicate.or(containsnumber3).test("0700000003")
        );
    }
    static boolean isPhoneNumberValid(String phoneNumber){
        return  phoneNumber.startsWith("07") && phoneNumber.length()==11;
    }
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber->phoneNumber.startsWith("07")&&phoneNumber.length()==11;

    static Predicate<String> containsnumber3 =phooneNumber->phooneNumber.contains("3");
}
