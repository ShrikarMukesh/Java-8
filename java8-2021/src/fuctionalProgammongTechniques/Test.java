package fuctionalProgammongTechniques;

import java.util.List;
import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        StreamDemo s = new StreamDemo();
        List<String> data = s.datafromDatabase();
        Optional<String> optional  = data.stream().findFirst();

        System.out.println(optional.get());
    }
}
