package HashMap;

// To find first non-repeated character in the string

import java.util.*;

public class Ques1 {
    public static void main(String[] args) {
        Map<Character, Integer> freqMap = new HashMap<>();
        String str = "a green apple";

        for(char ch : str.toCharArray()){
            if(freqMap.containsKey(ch)){
                freqMap.put(ch, freqMap.get(ch) + 1);
            }else{
                freqMap.put(ch, 1);
            }
        }

        for (char ch : str.toCharArray()){
            if(freqMap.get(ch) == 1){
                System.out.println(ch);
                break;
            }

        }
        System.out.println(freqMap);

    }
}
