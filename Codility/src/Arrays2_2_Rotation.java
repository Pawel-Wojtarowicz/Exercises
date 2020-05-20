import java.util.Arrays;
import java.util.Scanner;

//https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
public class Arrays2_2_Rotation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1,2,3,4,5};

        System.out.print("Ile razy chcesz obrócić?: ");
        int k = scanner.nextInt();

        System.out.println("Wejsciowa tablica: " + Arrays.toString(array));
        System.out.print("Tablica po obróceniu *[" + k + "] ");
        solution(array,k);

    }

    public static int[] solution(int[] array, int k) {
        if (array.length == 0 || k == 0) {
            System.out.println(Arrays.toString(array));
            return array;
        } else {
            k = k % array.length;
            int[] result = new int[array.length];

            System.arraycopy(array, array.length - k, result, 0, k);
            System.arraycopy(array, 0, result, k, array.length - k);

            System.out.println(Arrays.toString(result));
            return result;
        }
    }

}
