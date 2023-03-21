package Testing;

public class Test7 {
    public static void main(String[] args) {
        int i =1;
        i++;
        increment(i);
        System.out.println(i);
    }

    private static void increment(int i) {
        i = i+2;
    }
}
