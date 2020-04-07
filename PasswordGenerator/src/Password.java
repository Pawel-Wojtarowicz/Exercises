import java.util.Random;
import java.util.Scanner;

public class Password {

    static boolean symbols;
    static boolean numbers;
    static boolean lowercase;
    static boolean uppercase;

    static char symbols(boolean value) {
        Random random = new Random();
        String chars = "@&+\\/'!#$^?:.(){}[]~-_,";
        if (value) {
            return chars.charAt(random.nextInt(chars.length()));
        }
        return 0;
    }
    static void numbers(boolean value) {
        Random random = new Random();
        String chars = "1234567890";
        if (value) {
            char c = chars.charAt(random.nextInt(chars.length()));
        }
    }
    static void lowercase(boolean value) {
        Random random = new Random();
        String chars = "abcdefghijklmnopqrstuwxyz";
        if (value) {
            char c = chars.charAt(random.nextInt(chars.length()));
        }
    }
    static void uppercase(boolean value) {
        Random random = new Random();
        String chars = "ABCDEFGHIJKLMNOPQRSTUWXYZ";
        if (value) {
            char c = chars.charAt(random.nextInt(chars.length()));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "";

        System.out.println("Password Length:");
        int howLong = scanner.nextInt();
        System.out.println("1. Include Symbols: (e.g. !@#$%). (Y) or (N)");
        if (scanner.next().equalsIgnoreCase("y")) {
            symbols = true;
        }
//        System.out.println("2. Include Numbers: (e.g. 12345). (Y) or (N)");
//        if (scanner.next().equalsIgnoreCase("y")) {
//            numbers = true;
//        }
//        System.out.println("3. Include Lowercase Characters: (e.g. abcde). (Y) or (N)");
//        if (scanner.next().equalsIgnoreCase("y")) {
//            lowercase = true;
//        }
//        System.out.println("4. Include Uppercase Characters: (e.g. ABCDE). (Y) or (N)");
//        if (scanner.next().equalsIgnoreCase("y")) {
//            uppercase = true;
//        }

        for (int i = 0; i <howLong; i++) {
            if(password.length() <= howLong) {
                password += symbols(symbols);
            }
        }
        System.out.println("Your Password is: " + password);
    }
}

