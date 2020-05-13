import java.util.Scanner;

public class CircleField {

    //https://pl.spoj.com/problems/ETI06F1/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj r: ");
        double r = scanner.nextDouble();
        System.out.print("Podaj d: ");
        double d = scanner.nextDouble();

        System.out.printf("Wynik: %.2f",calculate(r, d));
    }

        public static double calculate(double r, double d) {
            double wynik = ((d/2 * d/2) - r * r); // d2 + x2 = r2 -> d2 - r2 = -x2
            wynik = ((-1 * wynik) * Math.PI);
            return wynik;
        }
    }
