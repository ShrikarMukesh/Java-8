package predicate;

import java.util.Scanner;
import java.util.function.Predicate;

class User{
    String username;
    String pwd;

    public User(String username,String pwd) {
        this.username = username;
        this.pwd = pwd;
    }
}
public class UserAunthentication {
    public static void main(String[] args) {

        Predicate<User> p = user->user.username.equals("root") && user.pwd.equals("root");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Username");
        String username= scanner.next();
        System.out.println("Password");
        String pwd= scanner.next();
        User u = new User(username,pwd);
        if (p.test(u)) {
            System.out.println("valid user");
        }else{
            System.out.println("Invalid user");
        }
    }
}
