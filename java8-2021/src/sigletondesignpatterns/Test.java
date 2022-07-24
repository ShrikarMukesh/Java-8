package sigletondesignpatterns;

import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        String str = "my name is shrikar my is my";

        String[] strArray = str.split(" ");

        HashMap<String,Integer> hashMap = new HashMap<>();
        int flag =1;
        for(String s: strArray){
            if(!hashMap.containsKey(s)){
                hashMap.put(s,flag);
            }
            else{
                 int count =hashMap.get(s);
                 hashMap.put(s,++count);
            }
        }

        System.out.println(hashMap);

        HashMap<String, Integer> temp = hashMap.entrySet().stream().sorted((i1, i2) -> i1.getValue().compareTo(i2.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(temp);
        //Stream<Map.Entry<String,Integer>> result =  hashMap.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue));
    }
}
