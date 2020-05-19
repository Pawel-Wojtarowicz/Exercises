import java.util.Scanner;

public class Cesar {

    public Cesar(){}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your text: ");
        String input = scanner.nextLine();
        System.out.print("Enter distance: ");
        int distance = scanner.nextInt();
        String encrypted = encrypt(input, distance);
        System.out.print("Result: ");
        System.out.print(encrypted);

    }
    public static String encrypt(String message, int distance){
        StringBuilder stringBuilder = new StringBuilder(message);
        for (int i = 0; i < stringBuilder.length() ; i++) {
            int c = stringBuilder.charAt(i);
            if(c + distance > 122){
                c = 31 + distance - (122 - c);
            }
            else{
                c += distance;
            }
            stringBuilder.setCharAt(i, (char)c);
        }
        return stringBuilder.toString();
    }
}