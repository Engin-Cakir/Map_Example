//String ifadeyi oluşturan harflerin sayısının HashMap ile listelenmesi

package map_example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> words = new HashMap<>();
        String RandomWord = "Put an and to";
        for (int i = 0; i < RandomWord.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < RandomWord.length(); j++) {
                if (RandomWord.charAt(i) == RandomWord.charAt(j)) {
                    count++;
                }

            }
            words.putIfAbsent(String.valueOf(RandomWord.charAt(i)), count);

        }
        System.out.println(words.entrySet());
    }
}

