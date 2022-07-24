package functionalInterfaces;

import java.util.function.BinaryOperator;

public class BinaryOPeratorPractice {
    public static void main(String[] args) {
        BinaryOperator<String> operator = (a,b)->a+"."+b;
        System.out.println(operator.apply("Gmail","com"));
    }
}
