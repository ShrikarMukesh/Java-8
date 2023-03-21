package com.streamapi1;

import java.util.function.BiFunction;

public class test {
    public static void main(String[] args) {
        BiFunction<String,String,Boolean> compareString  = (x,y) -> x.equals(y);
        System.out.println(compareString.apply("Java8" , "Java8"));
    }
}
