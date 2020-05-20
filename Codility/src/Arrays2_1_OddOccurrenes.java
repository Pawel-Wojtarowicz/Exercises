import java.util.*;
import java.util.stream.Collectors;

public class Arrays2_1_OddOccurrenes {

    //https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,6,7,5,4,3,2,1,9};
        System.out.println("Tablica wejściowa: " + Arrays.toString(array));
        System.out.println("Element bez pary to: " + solution(array));
        System.out.print("[STREAM] Element bez pary to: ");
        solution2(array);
        System.out.print("[STREAM#2] Element bez pary to: ");
        solution3();

    }
    public static int solution(int[] array){
        Set<Integer> integerSet = new HashSet<>();

        for (int i : array) {
            if(!integerSet.contains(i)){
                integerSet.add(i);
            }
            else{
                integerSet.remove(i);
            }
        }
        for (Integer i : integerSet) {
            return i;
        }
        return 0;
    }

    public static void solution3(){
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,6,7,5,4,3,2,1,9);
                integerList.stream()
                        .filter(i -> Collections.frequency(integerList, i) == 1)
                        .forEach(System.out::println);
    }
    public static void solution2(int[] a){
        List<Integer> list = Arrays   // <-  convert int[] into List using streams
                .stream(a)
                .boxed()
                .collect(Collectors.toList());

        list
                .stream()
                .filter(i -> Collections.frequency(list,i)==1)
                .forEach(System.out::println);
    }
}

