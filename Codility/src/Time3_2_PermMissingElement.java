import java.util.Arrays;


public class Time3_2_PermMissingElement {

    //https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
    public static void main(String[] args) {

        int[] array = {2,3,1,5,4,7,8,9};
        System.out.println(Arrays.toString(array));
        System.out.println("Missing element: " + solution(array));

//        int[] inputArray = {9,2,3,4,5,6,7,8};
//        boolean[] resultArray = new boolean[inputArray.length+1];
//
//        for (int i = 0; i < inputArray.length; i++) {
//            resultArray[inputArray[i]-1] = true;  
//        }
//
//        for (int i = 0; i <resultArray.length ; i++) {
//            if(!resultArray[i]){
//                System.out.println(i+1);
//            }
//        }
    }

    public static int solution(int[] array){

        int size = (array.length+1);
        int actualSum = (size*(size+1))/2;
        int sum = Arrays
                .stream(array)
                .sum();

        int result = actualSum - sum;

        return result;
    }
}
