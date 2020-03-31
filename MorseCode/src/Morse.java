import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Morse {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("C:\\Users\\Pawel\\Desktop\\file.txt"));
        Map<Character,String> characterStringMap = new HashMap<>();
        characterStringMap.put('a',".-");
        characterStringMap.put('b',"-...");
        characterStringMap.put('c',"-.-.");
        characterStringMap.put('d',"-..");
        characterStringMap.put('e',".");
        characterStringMap.put('f',"..-.");
        characterStringMap.put('g',"--.");
        characterStringMap.put('h',"....");
        characterStringMap.put('i',"..");
        characterStringMap.put('j',".---");
        characterStringMap.put('k',"-.-");
        characterStringMap.put('l',".-..");
        characterStringMap.put('m',"--");
        characterStringMap.put('n',"-.");
        characterStringMap.put('o',"---");
        characterStringMap.put('p',".--.");
        characterStringMap.put('q',"--.-");
        characterStringMap.put('r',".-.");
        characterStringMap.put('s',"...");
        characterStringMap.put('t',"-");
        characterStringMap.put('u',"..-");
        characterStringMap.put('v',"...-");
        characterStringMap.put('w',".--");
        characterStringMap.put('x',"-..-");
        characterStringMap.put('y',"-.--");
        characterStringMap.put('z',"--..");
        int howManyDots = 0;
        int howManyDashes = 0;

       while(scanner.hasNext()) {
           String message = scanner.next();
           String morse = "";
           char dots = '.';

           for (char c : message.toCharArray()){
               morse += characterStringMap.get(c);
               }
           //print message
//           System.out.println(message + ": " + morse);
           for (int i = 0; i <morse.length(); i++) {
               if(morse.charAt(i) == dots) {
                  howManyDots++;
               }
               else {
                   howManyDashes++;
               }
           }
           }
        scanner.close();
        System.out.println("Dots(.):   " + howManyDots + "\nDashes(-): " + howManyDashes);
       }
    }
