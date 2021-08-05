package mypack.map;
import java.util.*;

public class Task1 {
	
	
	public static void highestVowelCountFirst(String sentence) {
    	Map<Integer, String> sortedMap = new TreeMap<>();
        String[] words = sentence.split(" ");
        for (String word : words) {
            int count = 0;
            for (int pos = 0; pos < word.length(); pos++) {
                if (word.charAt(pos) == 'a' || word.charAt(pos) == 'e' || word.charAt(pos) == 'i' || word.charAt(pos) == 'o' || word.charAt(pos) == 'u') {
                    count++;
                }
            }
    
            if (sortedMap.containsKey(count)) {
                String availableSentence = sortedMap.get(count);
                sortedMap.put(count, availableSentence + " " + word);
            } else {
                sortedMap.put(count, word);
            }
        }
        System.out.println(sortedMap);
        for (int key :sortedMap.keySet()) {
            String value = sortedMap.get(key);
            String[] array = value.split(" ");
            Arrays.sort(array, Collections.reverseOrder());
            String s = "";
            for (int i =0;i< array.length;i++) {
                s+=array[i];
                s+=" ";
            }
            sortedMap.put(key, s);
        }
        System.out.println(sortedMap);
    }

    public static void main(String[] args) {
        String s = "hey hello everyone its getting complicated right that's why we should wrap up the tasks given on same day but we rarely stick to it sad";
        //String s = "hello world how are you";
        highestVowelCountFirst(s);
       
    }

}
