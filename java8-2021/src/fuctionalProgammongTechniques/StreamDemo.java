package fuctionalProgammongTechniques;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamDemo {
   public List<String> datafromDatabase(){

        List<String> list = new ArrayList<>();
        list.add("Basics");
        list.add("");
        list.add("Strong");
        list.add("");
        list.add("BasicsStrong");

        list.stream().findFirst();
        return  list;
    }
}
