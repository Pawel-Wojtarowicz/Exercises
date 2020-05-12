import java.util.Scanner;

public class StringMerge {

    //https://pl.spoj.com/problems/PP0504B/
    public static String StringMerge(String word, String word2){
        int size = 0;
        String word3 = "";
        if (word.length() <= word2.length()){
            size = word.length();
        }
        else {
            size = word2.length();
        }

        for (int i = 0; i < size; i++) {
            char c = word.charAt(i);
            word3 = word3 + c;
            for (int j = 0; j < size; j++) {
                char c1 = word2.charAt(j);
                word3 = word3 + c1;
                break;
            }
        }
        return word3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszy string: ");
        String word = scanner.next();
        System.out.print("Podaj drugi string: ");
        String word2 = scanner.next();
        System.out.println(StringMerge(word, word2));

    }
}
