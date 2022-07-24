package sigletondesignpatterns;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class Check {
    public static void main(String[] args) {
        List<String> magazine = Arrays.asList("give","me","one","grand", "today","night");
        List<String> note = Arrays.asList("give","one","grand", "give");
        checkMagazine(magazine,note);
    }
    
    public static void checkMagazine(List<String> magazine, List<String> note) {
//        Map<String,Integer> map = new HashMap<>();
//        int count =0;
//        int flag =0;
//        for(String str: magazine){
//            map.put(str,++count);
//        }
//        //map.entrySet().stream().forEach((v)->System.out.println(v));
//        for(String str: note){
//            if(map.containsKey(str)){
//                map.remove(str);
//                continue;
//            }else{
//                flag++;
//            }
//        }
//        map.entrySet().stream().forEach((v)->System.out.println(v));
//        if(flag ==0){
//            System.out.println("Yes");
//        }else{
//            System.out.println("No");
//        }
//
//    }
//
//    private static Predicate<String> method(List<String> magazine, List<String> note) {
//        Map<String, Integer> magazineMap;
//        Map<String, Integer> noteMap;
//
//        public Solution(String magazine, String note) {
//            this.noteMap = new HashMap<String, Integer>();
//            this.magazineMap = new HashMap<String, Integer>();
//
//            // Must use an object instead of a primitive because it may be assigned a null reference.
//            Integer occurrences;
//
//            for(String s : magazine.split("[^a-zA-Z]+")) {
//                occurrences = magazineMap.get(s);
//
//                if(occurrences == null) {
//                    magazineMap.put(s, 1);
//                }
//                else {
//                    magazineMap.put(s, occurrences + 1);
//                }
//            }
//
//            for(String s : note.split("[^a-zA-Z]+")) {
//                occurrences = noteMap.get(s);
//
//                if(occurrences == null) {
//                    noteMap.put(s, 1);
//                }
//                else {
//                    noteMap.put(s, occurrences + 1);
//                }
//            }
//
//        }
//
//        public void solve() {
//            boolean canReplicate = true;
//            for(String s : noteMap.keySet()) {
//                if(!magazineMap.containsKey(s) || (magazineMap.get(s) < noteMap.get(s)) ) {
//                    canReplicate = false;
//                    break;
//                }
//            }
//
//            System.out.println( (canReplicate) ? "Yes" : "No" );
    }
}
