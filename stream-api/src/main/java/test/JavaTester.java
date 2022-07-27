package test;


public class JavaTester {
    public int counter = 0;
    public static int staticCounter = 0;
    public JavaTester() {
        counter++;
        staticCounter++;
    }

    public static void main(String args[]) {
        JavaTester tester = new JavaTester();
        JavaTester tester1 = new JavaTester();
        JavaTester tester2 = new JavaTester();
        System.out.println("Counter: " + tester2.counter);
        System.out.println("Static Counter: " + tester2.staticCounter);
    }
}



