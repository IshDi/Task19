import java.util.*;

public class Main {
    static String textLoremIpsum =
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
            "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
            "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
            "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
            "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> characterCounter = new HashMap<>();

        for (int i = 0; i < textLoremIpsum.length(); i++) {
            if (Character.isLetter(textLoremIpsum.charAt(i))) {
                if (characterCounter.containsKey(textLoremIpsum.charAt(i))) {
                    int value = characterCounter.get(textLoremIpsum.charAt(i));
                    characterCounter.put(textLoremIpsum.charAt(i), (value + 1));
                } else {
                    characterCounter.put(textLoremIpsum.charAt(i), 1);
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (Map.Entry<Character, Integer> kv : characterCounter.entrySet()) {
            System.out.println(kv.getKey() + " - " + kv.getValue());
            list.add(kv.getValue());
        }

        System.out.println("Максимальное значение: " + Collections.max(list));
        System.out.println("Минимальное значение: " + Collections.min(list));
    }
}