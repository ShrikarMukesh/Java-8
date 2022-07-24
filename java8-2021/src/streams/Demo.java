package streams;

import java.util.Locale;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        Stream<?> arr = Stream.of(Locale.getISOCountries());
        arr.forEach(t-> System.out.print(t));
    }
}
