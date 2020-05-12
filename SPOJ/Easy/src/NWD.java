import java.util.Scanner;

//https://pl.spoj.com/problems/PP0501A/
public class NWD {


    public static int NWD(int a, int b){
        while (a!=b){
            if(a<b){
                b = b - a;
            }else {
                a = a - b;
            }
        }
        return a;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe 1: ");
        int a = scanner.nextInt();
        System.out.print("Podaj liczbe 2: ");
        int b = scanner.nextInt();
        System.out.print("Najwiekszy wspólny dzielnik to: ");
        System.out.println(NWD(a, b));

    }
}
