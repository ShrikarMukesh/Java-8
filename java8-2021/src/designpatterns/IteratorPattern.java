package designpatterns;

import java.util.function.Consumer;

class MyArrayList{
    Object[] elements = new Object[5];
    public MyArrayList(Object[] elements){
        this.elements = elements;
    }
    public  void forEachShrikar(Consumer<Object> action){
        for(int i=0;i<elements.length;i++){
            action.accept(elements[i]);
        }
    }
}
public class IteratorPattern {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList(new Object[]{1,2,3,4,5});
        list.forEachShrikar(System.out::println);
    }
}
