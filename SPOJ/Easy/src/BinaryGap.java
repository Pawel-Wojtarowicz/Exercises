public class BinaryGap {

    //https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
    public static void main(String[] args) {

        int solution = solution(74901729);
//        int solution = solution(20);
        System.out.println(solution);
    }

    private static int solution(int N) {
        String s = Long.toBinaryString(N);

        int modifier = 0;
        if (s.endsWith("0")){
            modifier = 1;
        }

        String[] split = s.split("1");

//        for (String s1 : split) {
//            System.out.println(s1);
//        }

        int max = 0;
        for (int i = 0; i < split.length - modifier; i++) {
            int length = split[i].length();
            if(length > max){
                max = length;
            }
        }
        return max;
    }

}
