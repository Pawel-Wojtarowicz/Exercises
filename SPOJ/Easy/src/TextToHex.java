import java.math.BigInteger;
import java.util.Scanner;

public class TextToHex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj Stringa: ");
        String input = scanner.next();
        System.out.print("String to HEX: "+convertStringToHex(input) + "\n");
        String input2 = convertStringToHex(input);
        System.out.print("Hex to String: "+ convertHexToString(input2.replace(" ", "")));

    }
    public static String convertStringToHex(String input){
        StringBuilder stringBuilder = new StringBuilder();
        for( char c: input.toCharArray()){
            if (stringBuilder.length() > 0 )
                stringBuilder.append(' ');
            stringBuilder.append(String.format("%04x", (int) c));
        }
        return stringBuilder.toString();
    }

    public static String convertHexToString(String input){
        return new String(new BigInteger(input, 16).toByteArray());
    }
}
