public class CountingEmelents4_2_FrogRiverOne {

        //https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/
        public static int frog(int X, int[] A) {
            int steps = X;
            boolean[] road = new boolean[steps+1];
            for(int i = 0; i < A.length; i++){
                if(!road[A[i]]){
                    road[A[i]] = true;
                    steps--;
                    if(steps == 0) return i;
                }
            }
            return -1;
        }

    public static void main(String[] args) {
        int[] array = {1,3,1,4,2,3,5,4};
        System.out.println(frog(5,array));
    }
}

