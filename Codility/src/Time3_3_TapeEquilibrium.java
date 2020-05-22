import java.util.Arrays;

public class Time3_3_TapeEquilibrium {

    //https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
    public static void main(String[] args) {

        int[] array = {3,1,2,4,3};
        System.out.println(Arrays.toString(array));

        int[] left = new int[array.length];
        int[] right = new int[array.length];

        left[0] = array[0];
        for (int i = 1; i <array.length ; i++) {
            left[i] = left[i-1] + array[i];
        }

        right[array.length-1] = array[array.length-1];
        for (int i = array.length-2; i >=0 ; i--) {
            right[i] = right[i+1] + array[i];
        }

        int best = Integer.MAX_VALUE;
        for (int i = 0; i <array.length-1; i++) {
            int diff = Math.abs(left[i]-right[i+1]);
            if(diff < best){
                best = diff;
            }
        }
        System.out.println(best);
    }
}
