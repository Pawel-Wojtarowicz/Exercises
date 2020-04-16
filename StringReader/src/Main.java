import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\Pawel\\Desktop\\file.txt");
            Map<Character, Integer> stringMap = new HashMap<>();
            BufferedReader br = new BufferedReader(new FileReader(file));
            StringBuffer sb = new StringBuffer();
            String string;
            Character[] charsToSkip = new Character[] {',','.','!',':',';','(',')',' ','"','…','„','’','–','?','”','1','2','3','4','5','6','7','8','9','0'};
            List<Character> characterList = new LinkedList<>(Arrays.asList(charsToSkip));

            while ((string = br.readLine()) != null) {
                sb.append(string);
                sb.append("\n");
                for (char c: string.toCharArray()) {
                    Integer value = stringMap.get(c);
                    if (!characterList.contains(c)) {
                        if (value != null) {
                            value++;
                        } else {
                            value = 1;
                        }
                        stringMap.put(c, value);
                    }
                }
            }
            br.close();
            System.out.println(sb.toString());
            for (Character key : stringMap.keySet()) {
                Integer value = stringMap.get(key);
                System.out.println("Character: " + key + " occured " + value + " time(s).");
            }
            } catch (IOException e) {
                e.printStackTrace();
                e.getMessage();
        }
    }

}
