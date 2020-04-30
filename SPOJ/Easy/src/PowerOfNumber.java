import java.util.Scanner;

public class PowerOfNumber {
 //https://pl.spoj.com/problems/PA05_POT/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ile liczb chcesz potęgować: ");
        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.print("Podaj podstawę: ");
            int x = scanner.nextInt();
            System.out.print("Podaj wykładnik: ");
            int y = scanner.nextInt();
            if(y>0) {
                double result = (Math.pow(x, y) % 10);
                System.out.printf("Result 1: %.0f\n", result);
            } else {
                System.out.println("1");
            }

            //Second result
            if(y > 0) {
                if (y % 4 == 0){
                    y = 4;
                }else {
                    y = y % 4;
                }
                int result2 = x;
                for(int j = 1; j<y; j++){
                    result2 *= x;
                }
                System.out.println("Result 2: " + result2 % 10);
            }
            else {
                System.out.println("1");
            }

        }
    }
}
