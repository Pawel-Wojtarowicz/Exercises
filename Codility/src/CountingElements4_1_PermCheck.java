public class CountingElements4_1_PermCheck {

    //https://app.codility.com/programmers/lessons/4-counting_elements/perm_check/
    public static void main(String[] args) {

        int[] array = {4, 1, 2, 3};
        //int[] array = {5, 1, 2, 3};

        boolean[] result = new boolean[array.length];

        for (int i = 0; i < result.length; i++) {
            int index = array[i] - 1;
            if(index > array.length-1){
                System.out.println("Out of bound exception");
                break;
            }
            if (!result[index]) {
                result[index] = true;
            } else {
                System.out.println("Value already exist in Array");
            }
            System.out.println("Index: " + i + " " + result[index]);
        }
    }
}