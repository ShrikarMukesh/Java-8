package groupingBy;

import java.util.Map;
import java.util.HashMap;;
public class NoOfOcc {
	public static void main(String[] args) {
		
		String str = "shrikar";
		char[] cArray = str.toCharArray();

		Map<Character,Integer> map = new HashMap<>();

		for(int i=0;i<cArray.length;i++){
			int flag =0;
			if(!map.containsKey(cArray[i])){
				map.put(cArray[i],1);
			}
			else{
				flag = map.get(cArray[i]);
				map.put(cArray[i],++flag);
			}
		}
		map.forEach((k,v) ->System.out.println(k + " = " + v));
	}
	
}

