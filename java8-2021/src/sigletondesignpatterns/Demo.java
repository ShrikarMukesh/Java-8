package sigletondesignpatterns;

import java.util.Arrays;
import java.util.Locale;

public class Demo {

    public static void main(String[] args) {

        String str = "hello world";//Hello World
        String [] array = str.split(" ");

        StringBuilder sb = new StringBuilder();
        for (String s : array){
           convert(s);
        }

    }

    private static void convert(String s) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i =0;i<arr.length;i++){

            if(i == 0){
                char c = arr[i];;

                String str = new String(String.valueOf(c));

                str = str.toUpperCase();
                sb.append(str);
            }
            else {
                sb.append(arr[i]);
            }
        }
        System.out.println(sb);

    }
}
