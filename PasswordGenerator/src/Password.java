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
    static char numbers(boolean value) {
        Random random = new Random();
        String chars = "1234567890";
        if (value) {
            return chars.charAt(random.nextInt(chars.length()));
        }
        return 0;
    }
    static char lowercase(boolean value) {
        Random random = new Random();
        String chars = "abcdefghijklmnopqrstuwxyz";
        if (value) {
            return chars.charAt(random.nextInt(chars.length()));
        }
        return 0;
    }
    static char uppercase(boolean value) {
        Random random = new Random();
        String chars = "ABCDEFGHIJKLMNOPQRSTUWXYZ";
        if (value) {
            return chars.charAt(random.nextInt(chars.length()));
        }
        return 0;
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
        System.out.println("2. Include Numbers: (e.g. 12345). (Y) or (N)");
        if (scanner.next().equalsIgnoreCase("y")) {
            numbers = true;
        }
        System.out.println("3. Include Lowercase Characters: (e.g. abcde). (Y) or (N)");
        if (scanner.next().equalsIgnoreCase("y")) {
            lowercase = true;
        }
        System.out.println("4. Include Uppercase Characters: (e.g. ABCDE). (Y) or (N)");
        if (scanner.next().equalsIgnoreCase("y")) {
            uppercase = true;
        }

        while (password.length() < howLong) {
                char s = symbols(symbols);
                if (s != 0){
                    password += s;
                }
                if (password.length() < howLong) {
                    char n = numbers(numbers);
                    if (n != 0) {
                        password += n;
                    }
                }
                if (password.length() < howLong) {
                    char l = lowercase(lowercase);
                    if(l != 0) {
                        password += l;
                    }
                }
                if (password.length() < howLong) {
                    char u = uppercase(uppercase);
                    if(u != 0) {
                        password += u;
                    }
                }
            }
            System.out.println("Your Password is: " + password);
    }
}

