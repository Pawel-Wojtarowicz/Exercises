import java.util.Scanner;

public class Password {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean symbols = false;
        boolean numbers = false;
        boolean lowercase = false;
        boolean uppercase = false;


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
        System.out.println("3. Include Uppercase Characters: (e.g. ABCDE). (Y) or (N)");
        if (scanner.next().equalsIgnoreCase("y")) {
            uppercase = true;
        }
        /*
        System.out.println(howLong +" "+symbols+" "+numbers+" "+lowercase+" "+uppercase);
        ..
        ..
        ..
        ..
         */
    }
}
