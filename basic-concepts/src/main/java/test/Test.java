package test;

@FunctionalInterface
interface Interface1{
    int generateQRCode(int x);
    default void hello(){
        System.out.println("Hello Guys");
    }
    static void fortune(){
        System.out.println("Hello Guys");
    }

}
@FunctionalInterface
interface Interface2 extends Interface1{
    int generateQRCode(int x);

}

public class Test {
    public static void main(String[] args) {
        Interface1 interface1 = (x) -> x * 3;

        System.out.println(interface1.generateQRCode(3));


        
    }
}
