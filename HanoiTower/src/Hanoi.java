public class Hanoi {

    public static void main(String[] args) {

        int i = 5;
        System.out.println("Tanoi Tower with " + i + " disks.");
        HanoiTower(i,'A','B','C');
    }

    private static void HanoiTower(int n, char a, char b, char c) {
        if (n>0) {
            HanoiTower(n-1, a, c, b);
            System.out.println("Moved Disk=" + n + " from rod " + a + " to rod " + c);
            HanoiTower(n-1, b, a, c);
        }

    }
}
