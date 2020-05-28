import java.time.Clock;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BinaryClock {

    public static void printBoard(char[][] board){
        for (char[] row : board) {
            for(char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Clock clock = Clock.systemDefaultZone();
        System.out.println("Zone: " + clock);

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatDateTime = ldt.format(formatter);
        System.out.println("Time: " + formatDateTime + "\n");

        int hours = 24;
        char[][] board = {

                {'|', '-', '-','|', ' ','|', '-', '-','|', ' ','|', '-', '-','|'},
                {'|', ' ', 'o','|', ' ','|', ' ', '*','|', ' ','|', ' ', '*','|'},
                {'|', ' ', 'o','|', ' ','|', '*', '*','|', ' ','|', '*', '*','|'},
                {'|', 'o', 'o','|', ' ','|', '*', '*','|', ' ','|', '*', '*','|'},
                {'|', 'o', 'o','|', ' ','|', '*', '*','|', ' ','|', '*', '*','|'},
                {'|', '-', '-','|', ' ','|', '-', '-','|', ' ','|', '-', '-','|'},
        };


        switch (hours) {
            case 1:
                board[4][2] = 'X';
                break;
            case 2:
                board[3][2] = 'X';
                break;
            case 3:
                board[3][2] = 'X';
                board[4][2] = 'X';
                break;
            case 4:
                board[2][2] = 'X';
                break;
            case 5:
                board[2][2] = 'X';
                board[4][2] = 'X';
                break;
            case 6:
                board[2][2] = 'X';
                board[3][2] = 'X';
                break;
            case 7:
                board[2][2] = 'X';
                board[3][2] = 'X';
                board[4][2] = 'X';
                break;
            case 8:
                board[1][2] = 'X';
                break;
            case 9:
                board[1][2] = 'X';
                board[4][2] = 'X';
                break;
            case 10:
                board[1][2] = 'X';
                board[3][2] = 'X';
                break;
            case 11:
                board[1][2] = 'X';
                board[3][2] = 'X';
                board[4][2] = 'X';
                break;
            case 12:
                board[1][2] = 'X';
                board[2][2] = 'X';
                break;
            case 13:
                board[4][1] = 'X';
                board[3][2] = 'X';
                board[4][2] = 'X';
                break;
            case 14:
                board[4][1] = 'X';
                board[2][2] = 'X';
                break;
            case 15:
                board[4][1] = 'X';
                board[2][2] = 'X';
                board[2][4] = 'X';
                break;
            case 16:
                board[4][1] = 'X';
                board[2][2] = 'X';
                board[3][2] = 'X';
                break;
            case 17:
                board[4][1] = 'X';
                board[2][2] = 'X';
                board[3][2] = 'X';
                board[4][2] = 'X';
                break;
            case 18:
                board[4][1] = 'X';
                board[1][2] = 'X';
                break;
            case 19:
                board[4][1] = 'X';
                board[1][2] = 'X';
                board[4][2] = 'X';
                break;
            case 20:
                board[3][1] = 'X';
                break;
            case 21:
                board[3][1] = 'X';
                board[4][2] = 'X';
                break;
            case 22:
                board[3][1] = 'X';
                board[3][2] = 'X';
                break;
            case 23:
                board[3][1] = 'X';
                board[3][2] = 'X';
                board[4][2] = 'X';
                break;
            case 24:
                board[3][1] = 'X';
                board[2][2] = 'X';
                break;
        }

        printBoard(board);
    }
}
