import java.util.Arrays;
import java.util.List;

public class Yahtzee {

        public static void main(String[] args) {
            Integer[] roll = {2, 3, 5, 5, 6};
            List<Integer> rollList = Arrays.asList(roll);

            // loop through list
            // for first element, use that element number compare with next number
            // if next number is the same with first element, add elements together
            // if no more same number, compare the total with max, assign maximum num to max

            int max = 0;
            int total = 0;

            for (int i = 0; i < 5; i++) {
                total = rollList.get(i);
                for (int j = i + 1; j < 5; j++) {
                    if(rollList.get(i) == rollList.get(j)){
                        total += rollList.get(j);
                    }
                }
                max = Math.max(total, max);
                total = 0;
            }
            System.out.println(rollList + " => " + max);
        }
}
