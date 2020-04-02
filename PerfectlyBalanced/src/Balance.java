import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Balance {

    public static void main(String[] args) {
        String string = "yyxyxxyxxyyyyxxxyxyx";
        if (string.length() != 1) {
            Map<Character, Integer> characterIntegerMap = new HashMap<>();
            for (char c : string.toCharArray()) {
                Integer value = characterIntegerMap.get(c);
                if (value != null) {
                    value++;
                } else {
                    value = 1;
                }
                characterIntegerMap.put(c, value);
            }
            Set<Integer> values = new HashSet<>(characterIntegerMap.values());
            boolean isUnique = values.size() == 1;

            System.out.println("String: " + string);
            for (Character key : characterIntegerMap.keySet()) {
                Integer value = characterIntegerMap.get(key);
                System.out.println("Character: " + key + " occured: " + value + " time(s).");
            }
            System.out.println("Is perfectly balanced? " + isUnique);
        }
        else {
            System.out.println("Provided string has 1 character and because of that it is not perfectly balanced.");
        }
    }

    }


