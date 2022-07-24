package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional.ofNullable("mukesh.shrikar@gmail.com").ifPresentOrElse(
                email -> System.out.println("sending emil to "+email),()-> System.out.println("cannot send email")
        );
    }
}
