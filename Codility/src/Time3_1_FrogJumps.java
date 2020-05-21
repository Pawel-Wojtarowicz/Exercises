public class Time3_1_FrogJumps {

    //https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
    public static void main(String[] args) {

        int result = solution(10, 85, 30);
        System.out.println("From pos 10 to 85, Frog needs to jump " + result + " times.");

    }
    public static int solution(int X, int Y, int D){

        int distnce = Y- X;
        int jumps = distnce/D;

        if(distnce % D > 0){
            jumps++;
        }
        return jumps;
    }
}
