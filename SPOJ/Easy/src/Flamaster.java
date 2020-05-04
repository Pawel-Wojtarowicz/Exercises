import java.util.Scanner;

public class Flamaster {
    //https://pl.spoj.com/problems/FLAMASTE/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ile słów? ");
        int howManyWords = scanner.nextInt();
        for(int i = 0; i < howManyWords; i++){
            StringBuilder sb = new StringBuilder();
            String word = scanner.next();
            for(int j = 0; j <= word.length(); j++){
                char actualChar = word.charAt(j);
                sb.append(actualChar);
                int count = 1;

                /////////////////////////////////////////////
                if (j == word.length() - 1) {
                    break;
                }
                while(actualChar == word.charAt(j+1)){
                    count++;
                    j++;
                if (j == word.length() - 1 ) {
                    break;
                    }
                }
                /////////////////////////////////////////////

                if (count == 2) {
                    sb.append(actualChar);
                } else if (count > 2) {
                    sb.append(count);
                }
            }
            System.out.println(sb.toString());
        }
    }
}
