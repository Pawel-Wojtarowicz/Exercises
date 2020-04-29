

public class PrimeNumbers {

    public static void main(String[] args) {

        int[] array = new int[10000];

        System.out.println("Szukanie liczb pierwszysch z zakresy 1-10000");
        for (int i = 0; i < array.length; i++) {
            boolean isPrime=true;
            for(int j = 2; j < i; j++){
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                if (i <= 1){
                } else
                System.out.println(i + " jest liczbą pierwszą");
            }
        }
    }
}

