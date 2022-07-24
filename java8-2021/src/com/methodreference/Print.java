package com.methodreference;

@FunctionalInterface
interface Dil{

    void add(int a,int b);
    static int print(int a, int b){
        return  a+b;
    }
    default void printing(){

    }
}
public class Print {
    public static void main(String[] args) {
       int result = Dil.print(10,20);

        System.out.println(result);
    }
}
