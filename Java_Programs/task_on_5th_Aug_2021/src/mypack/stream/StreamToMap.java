package mypack.stream;


import java.util.stream.*;
import java.util.Arrays;
import java.util.Map;

public class StreamToMap {

	public static Map toMap(String input){
        Map<String, Integer> map = Arrays.stream(input.split(" "))
                  .collect(Collectors.toMap(value-> value, value -> value.length()));
  
        return map;
    }
    public static void main(String[] args){
        String input = "converting stream to map";
        System.out.println(toMap(input));
    }
}


