package mypack.map;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;


public class Task2 {

	public static void uniqueVowelCount(String sentence) {
    	Map<Integer, String> sortedMap = new TreeMap<>();
        String[] words = sentence.split(" ");
        for (String word : words) {
            int count = 0, a = 0, e = 0 , i = 0, o = 0, u = 0;
            for (int pos = 0; pos < word.length(); pos++) {
                if (word.charAt(pos) == 'a')
                	a = 1;
                else if (word.charAt(pos) == 'e')
                	e = 1;
                else if (word.charAt(pos) == 'i')
                	i = 1;
                else if (word.charAt(pos) == 'o')
                	o = 1;
                else if ( word.charAt(pos) == 'u') 
                	u = 1;
                
                count = a+e+i+o+u;
                
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
        //String s = "hey hello everyone its getting complicated right that's why we should wrap up the tasks given on same day but we rarely stick to it sad";
        String s = "heelloo wooorld how aaare yoouuuu everyone";
        uniqueVowelCount(s);
       
    }

}
