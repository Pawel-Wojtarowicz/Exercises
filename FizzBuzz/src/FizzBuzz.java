public class FizzBuzz {

    static void fizzBuzz(int[] array) {
        for (int i = 0; i <= array.length; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        fizzBuzz(array);
    }
}
