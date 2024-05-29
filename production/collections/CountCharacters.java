package out.production.collections;

import java.util.HashMap;
import java.util.Map;

public class CountCharacters {

    public static void main(String[] args) {

        Map<Character, Integer> charMap = new HashMap<>();
        String words = "HelloWorldHiHello";

        for(char ch : words.toCharArray()){
            if(charMap.containsKey(ch)){
                int count = charMap.get(ch);
                System.out.println("count "+count);
                charMap.put(ch, ++count);
            }else{
                charMap.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            System.out.println("key is " + entry.getKey() + " value is " + entry.getValue());
        }
    }
}
