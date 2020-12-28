package sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortByKeyExample1 {
	
	public static void main(String[] args) {

		Map<String, Integer> unsortMap = new HashMap<String, Integer>();
		unsortMap.put("Zipkins", 10);
		unsortMap.put("Ribbon", 5);
		unsortMap.put("Zull", 6);
		unsortMap.put("Feign", 20);
		unsortMap.put("SpringCloud", 1);
		unsortMap.put("Enity", 7);
		unsortMap.put("MicroServices", 8);
		unsortMap.put("Security", 99);
		unsortMap.put("Juit", 50);
		unsortMap.put("Serialization", 2);
		unsortMap.put("Fork", 9);

		System.out.println("Unsort Map......");
		//printMap(unsortMap);

		System.out.println("\nSorted Map......By Value");
		Map<String, Integer> sortedMap = sortByValue(unsortMap);
		printMap(sortedMap);

	}

	private static Map<String, Integer> sortByValue(Map<String, Integer> unsortMap) {
		List<Map.Entry<String, Integer>> list = new LinkedList<>(unsortMap.entrySet());
		
		Collections.sort(list,new Comparator<Map.Entry<String, Integer>>() {

			public int compare(Map.Entry<String, Integer> entry1,Map.Entry<String, Integer> entry2) {
				return (entry1.getValue()).compareTo(entry2.getValue());
				
			}
			
		});
		Map<String, Integer> output = new LinkedHashMap<>();
		for(Map.Entry<String, Integer> entry : list ) {
			output.put(entry.getKey(), entry.getValue());
		}
		return output;
	}

	/*private static Map<String, Integer> sortByValue(Map<String, Integer> unsortMap) {

		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String,Integer>>(unsortMap.entrySet());
		System.out.println(list);
		
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){

			
			public int compare(Map.Entry<String, Integer> obj1, Map.Entry<String, Integer> obj2) {
				
				return (obj1.getKey()).compareTo(obj2.getKey());
			}
			
		});
		Map<String, Integer> output = new LinkedHashMap<>();
		for(Map.Entry<String, Integer> entry : list ) {
			output.put(entry.getKey(), entry.getValue());
		}
		
		return output;
	}
*/
	public static <K, V> void printMap(Map<K, V> map) {
		
		for (Map.Entry<K, V> entry : map.entrySet()) {
			System.out.println( entry.getKey()+" = "+ entry.getValue());
		}
	}
}
