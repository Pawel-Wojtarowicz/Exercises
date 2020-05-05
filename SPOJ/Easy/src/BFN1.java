import java.util.Scanner;

public class BFN1 {

    //https://pl.spoj.com/problems/BFN1/
    public static int count = 0;

    public static void checkNumber(int number){

        Integer x = number;
        int reversed = 0;
        while(number != 0){
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        if(x.equals(reversed)){
            System.out.println(reversed + " " + count);
            count=0;
        }
        else{
            count++;
            reversed = reversed + x;
            checkNumber(reversed);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ile liczb: ");
        int howMany = scanner.nextInt();
        for(int i = 1; i <= howMany; i++) {
            System.out.println("Podaj liczbę: ");
            checkNumber(scanner.nextInt());
        }
    }
}
