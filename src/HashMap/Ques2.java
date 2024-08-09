package HashMap;

// TO get first repeated character in string

import java.util.HashMap;
import java.util.Map;

public class Ques2 {
    public static void main(String[] args) {
        Map<Character, Integer> freqMap = new HashMap<>();
        String str = "a green apple";

        for (char ch : str.toCharArray()) {
            if (freqMap.containsKey(ch)) {
                freqMap.put(ch, freqMap.get(ch) + 1);
            } else {
                freqMap.put(ch, 1);
            }
        }

        for (char ch : str.toCharArray()) {
            if (freqMap.get(ch) != 1) {
                System.out.println(ch);
                break;
            }

        }
        System.out.println(freqMap);

    }
}
