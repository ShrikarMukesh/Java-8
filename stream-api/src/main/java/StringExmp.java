import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class StringExmp {

    public static void main(String[] args) {
        String str = "shrikar";
        char[] arr = str.toCharArray();

        HashMap<Character,Integer> hashMap = new HashMap<>();
        int counter = 0;
        for(int i=0;i<arr.length;i++){
            if(hashMap.containsKey(arr[i])){
                counter = hashMap.get(arr[i]).intValue();
                hashMap.get(arr[i]);
                hashMap.put(arr[i], ++counter);
            }
            else {

                 hashMap.put(arr[i] , 1);
            }
        }
        Optional<Map.Entry<Character, Integer>> maxValue = hashMap.entrySet().stream().max( (item1, item2) -> item1.getValue() - item2.getValue());
        if(maxValue.isPresent()){
            Integer value = maxValue.get().getValue();
            System.out.println(value);
        }

    }
}
