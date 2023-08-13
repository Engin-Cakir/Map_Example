//String ifadeyi oluşturan harflerin sayısının HashMap ile listelenmesi

package map_example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> words = new HashMap<>();
        String randomWord = "Put an and to";
        for (int i = 0; i < randomWord.length(); i++) {
            int count = 1;
            if (randomWord.charAt(i) != ' ') {
                for (int j = i + 1; j < randomWord.length(); j++) {
                    if (randomWord.charAt(i) == randomWord.charAt(j)) {
                        count++;
                    }
                }

                words.putIfAbsent(String.valueOf(randomWord.charAt(i)), count);
            }
        }
        System.out.println(words.entrySet());
    }
}

