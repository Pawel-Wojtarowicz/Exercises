import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class BinaryClock {

    public static void printBoard(char[][] board){
        for (char[] row : board) {
            for(char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
    public static void clock(char[][] board, String time){
        String[] value = time.split(":");
        int hours = Integer.parseInt(value[0]);
        int minutes = Integer.parseInt(value[1]);
        int seconds = Integer.parseInt(value[2]);

        switch (hours) {
            case 1:
                board[3][2] = 'X';
                break;
            case 2:
                board[2][2] = 'X';
                break;
            case 3:
                board[3][2] = 'X';
                board[2][2] = 'X';
                break;
            case 4:
                board[1][2] = 'X';
                break;
            case 5:
                board[1][2] = 'X';
                board[3][2] = 'X';
                break;
            case 6:
                board[1][2] = 'X';
                board[2][2] = 'X';
                break;
            case 7:
                board[1][2] = 'X';
                board[2][2] = 'X';
                board[3][2] = 'X';
                break;
            case 8:
                board[0][2] = 'X';
                break;
            case 9:
                board[0][2] = 'X';
                board[3][2] = 'X';
                break;
            case 10:
                board[3][1] = 'X';
                break;
            case 11:
                board[3][1] = 'X';
                board[3][2] = 'X';
                break;
            case 12:
                board[3][1] = 'X';
                board[2][2] = 'X';
                break;
            case 13:
                board[3][1] = 'X';
                board[2][2] = 'X';
                board[3][2] = 'X';
                break;
            case 14:
                board[3][1] = 'X';
                board[1][2] = 'X';
                break;
            case 15:
                board[3][1] = 'X';
                board[1][2] = 'X';
                board[3][2] = 'X';
                break;
            case 16:
                board[3][1] = 'X';
                board[1][2] = 'X';
                board[2][2] = 'X';
                break;
            case 17:
                board[3][1] = 'X';
                board[1][2] = 'X';
                board[2][2] = 'X';
                board[3][2] = 'X';
                break;
            case 18:
                board[3][1] = 'X';
                board[0][2] = 'X';
                break;
            case 19:
                board[3][1] = 'X';
                board[0][2] = 'X';
                board[3][2] = 'X';
                break;
            case 20:
                board[2][1] = 'X';
                break;
            case 21:
                board[2][1] = 'X';
                board[3][2] = 'X';
                break;
            case 22:
                board[2][1] = 'X';
                board[2][2] = 'X';
                break;
            case 23:
                board[2][1] = 'X';
                board[2][2] = 'X';
                board[3][2] = 'X';
                break;
            case 24:
                board[2][1] = 'X';
                board[1][2] = 'X';
                break;
        }
        switch (minutes) {
            case 1:
                board[3][5] = 'X';
                break;
            case 2:
                board[2][5] = 'X';
                break;
            case 3:
                board[3][5] = 'X';
                board[2][5] = 'X';
                break;
            case 4:
                board[1][5] = 'X';
                break;
            case 5:
                board[1][5] = 'X';
                board[3][5] = 'X';
                break;
            case 6:
                board[1][5] = 'X';
                board[2][5] = 'X';
                break;
            case 7:
                board[1][5] = 'X';
                board[2][5] = 'X';
                board[3][5] = 'X';
                break;
            case 8:
                board[0][5] = 'X';
                break;
            case 9:
                board[0][5] = 'X';
                board[3][5] = 'X';
                break;
            case 10:
                board[3][4] = 'X';
                break;
            case 11:
                board[3][4] = 'X';
                board[3][5] = 'X';
                break;
            case 12:
                board[3][4] = 'X';
                board[2][5] = 'X';
                break;
            case 13:
                board[3][4] = 'X';
                board[2][5] = 'X';
                board[3][5] = 'X';
                break;
            case 14:
                board[3][4] = 'X';
                board[1][5] = 'X';
                break;
            case 15:
                board[3][4] = 'X';
                board[1][5] = 'X';
                board[3][5] = 'X';
                break;
            case 16:
                board[3][4] = 'X';
                board[1][5] = 'X';
                board[2][5] = 'X';
                break;
            case 17:
                board[3][4] = 'X';
                board[1][5] = 'X';
                board[2][5] = 'X';
                board[3][5] = 'X';
                break;
            case 18:
                board[3][4] = 'X';
                board[0][5] = 'X';
                break;
            case 19:
                board[3][4] = 'X';
                board[0][5] = 'X';
                board[3][5] = 'X';
                break;
            case 20:
                board[2][4] = 'X';
                break;
            case 21:
                board[2][4] = 'X';
                board[3][5] = 'X';
                break;
            case 22:
                board[2][4] = 'X';
                board[2][5] = 'X';
                break;
            case 23:
                board[2][4] = 'X';
                board[2][5] = 'X';
                board[3][5] = 'X';
                break;
            case 24:
                board[2][4] = 'X';
                board[1][5] = 'X';
                break;
            case 25:
                board[2][4] = 'X';
                board[1][5] = 'X';
                board[3][5] = 'X';
                break;
            case 26:
                board[2][4] = 'X';
                board[1][5] = 'X';
                board[2][5] = 'X';
                break;
            case 27:
                board[2][4] = 'X';
                board[1][5] = 'X';
                board[2][5] = 'X';
                board[3][5] = 'X';
                break;
            case 28:
                board[2][4] = 'X';
                board[0][5] = 'X';
                break;
            case 29:
                board[2][4] = 'X';
                board[0][5] = 'X';
                board[3][5] = 'X';
                break;
            case 30:
                board[1][4] = 'X';
                break;
            case 31:
                board[1][4] = 'X';
                board[3][5] = 'X';
                break;
            case 32:
                board[1][4] = 'X';
                board[2][5] = 'X';
                break;
            case 33:
                board[1][4] = 'X';
                board[2][5] = 'X';
                board[3][5] = 'X';
                break;
            case 34:
                board[1][4] = 'X';
                board[1][5] = 'X';
                break;
            case 35:
                board[1][4] = 'X';
                board[1][5] = 'X';
                board[3][5] = 'X';
                break;
            case 36:
                board[1][4] = 'X';
                board[1][5] = 'X';
                board[2][5] = 'X';
                break;
            case 37:
                board[1][4] = 'X';
                board[1][5] = 'X';
                board[2][5] = 'X';
                board[3][5] = 'X';
                break;
            case 38:
                board[1][4] = 'X';
                board[0][5] = 'X';
                break;
            case 39:
                board[1][4] = 'X';
                board[0][5] = 'X';
                board[3][5] = 'X';
                break;
            case 40:
                board[1][4] = 'X';
                board[3][4] = 'X';
                break;
            case 41:
                board[1][4] = 'X';
                board[3][4] = 'X';
                board[3][5] = 'X';
                break;
            case 42:
                board[1][4] = 'X';
                board[3][4] = 'X';
                board[2][5] = 'X';
                break;
            case 43:
                board[1][4] = 'X';
                board[3][4] = 'X';
                board[3][5] = 'X';
                board[2][5] = 'X';
                break;
            case 44:
                board[1][4] = 'X';
                board[3][4] = 'X';
                board[1][5] = 'X';
                break;
            case 45:
                board[1][4] = 'X';
                board[3][4] = 'X';
                board[1][5] = 'X';
                board[3][5] = 'X';
                break;
            case 46:
                board[1][4] = 'X';
                board[3][4] = 'X';
                board[1][5] = 'X';
                board[2][5] = 'X';
                break;
            case 47:
                board[1][4] = 'X';
                board[3][4] = 'X';
                board[1][5] = 'X';
                board[3][5] = 'X';
                board[2][5] = 'X';
                break;
            case 48:
                board[1][4] = 'X';
                board[3][4] = 'X';
                board[0][5] = 'X';
                break;
            case 49:
                board[1][4] = 'X';
                board[3][4] = 'X';
                board[0][5] = 'X';
                board[3][5] = 'X';
                break;
            case 50:
                board[1][4] = 'X';
                board[2][4] = 'X';
                break;
            case 51:
                board[1][4] = 'X';
                board[2][4] = 'X';
                board[3][5] = 'X';
                break;
            case 52:
                board[1][4] = 'X';
                board[2][4] = 'X';
                board[2][5] = 'X';
                break;
            case 53:
                board[1][4] = 'X';
                board[2][4] = 'X';
                board[3][5] = 'X';
                board[2][5] = 'X';
                break;
            case 54:
                board[1][4] = 'X';
                board[2][4] = 'X';
                board[1][5] = 'X';
                break;
            case 55:
                board[1][4] = 'X';
                board[2][4] = 'X';
                board[1][5] = 'X';
                board[3][5] = 'X';
                break;
            case 56:
                board[1][4] = 'X';
                board[2][4] = 'X';
                board[2][5] = 'X';
                board[1][5] = 'X';
                break;
            case 57:
                board[1][4] = 'X';
                board[2][4] = 'X';
                board[2][5] = 'X';
                board[1][5] = 'X';
                board[3][5] = 'X';
                break;
            case 58:
                board[1][4] = 'X';
                board[2][4] = 'X';
                board[0][5] = 'X';
                break;
            case 59:
                board[1][4] = 'X';
                board[2][4] = 'X';
                board[0][5] = 'X';
                board[3][5] = 'X';
                break;
        }

        printBoard(board);
    }

    static char[][] cloneArray(char[][] array) {
        return Arrays.stream(array).map(char[]::clone).toArray(char[][]::new);
    }

    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formatDateTime = ldt.format(formatter);
        System.out.println("Time: " + formatDateTime + "\n");

        char[][] board = {

                {'|', ' ', '*','|', ' ', '*','|',' ', '*','|'},
                {'|', ' ', '*','|', '*', '*','|','*', '*','|'},
                {'|', '*', '*','|', '*', '*','|','*', '*','|'},
                {'|', '*', '*','|', '*', '*','|','*', '*','|'},
        };

        char[][] board2 = cloneArray(board);  //clean board
        clock(board,formatDateTime);


    }
}
