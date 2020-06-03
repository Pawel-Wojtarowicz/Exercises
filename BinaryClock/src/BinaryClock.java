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
//    public static void clearScreen(){
//        System.out.print("\033[H\033[2J");
//        System.out.flush();
//    }

    public static void clock(char[][] board, String time){
        String[] value = time.split(":");
        String hours = value[0];
        String minutes = value[1];
        String seconds = value[2];

        switch (hours) {
            case "01":
                board[3][2] = 'X';
                break;
            case "02":
                board[2][2] = 'X';
                break;
            case "03":
                board[3][2] = 'X';
                board[2][2] = 'X';
                break;
            case "04":
                board[1][2] = 'X';
                break;
            case "05":
                board[1][2] = 'X';
                board[3][2] = 'X';
                break;
            case "06":
                board[1][2] = 'X';
                board[2][2] = 'X';
                break;
            case "07":
                board[1][2] = 'X';
                board[2][2] = 'X';
                board[3][2] = 'X';
                break;
            case "08":
                board[0][2] = 'X';
                break;
            case "09":
                board[0][2] = 'X';
                board[3][2] = 'X';
                break;
            case "10":
                board[3][1] = 'X';
                break;
            case "11":
                board[3][1] = 'X';
                board[3][2] = 'X';
                break;
            case "12":
                board[3][1] = 'X';
                board[2][2] = 'X';
                break;
            case "13":
                board[3][1] = 'X';
                board[2][2] = 'X';
                board[3][2] = 'X';
                break;
            case "14":
                board[3][1] = 'X';
                board[1][2] = 'X';
                break;
            case "15":
                board[3][1] = 'X';
                board[1][2] = 'X';
                board[3][2] = 'X';
                break;
            case "16":
                board[3][1] = 'X';
                board[1][2] = 'X';
                board[2][2] = 'X';
                break;
            case "17":
                board[3][1] = 'X';
                board[1][2] = 'X';
                board[2][2] = 'X';
                board[3][2] = 'X';
                break;
            case "18":
                board[3][1] = 'X';
                board[0][2] = 'X';
                break;
            case "19":
                board[3][1] = 'X';
                board[0][2] = 'X';
                board[3][2] = 'X';
                break;
            case "20":
                board[2][1] = 'X';
                break;
            case "21":
                board[2][1] = 'X';
                board[3][2] = 'X';
                break;
            case "22":
                board[2][1] = 'X';
                board[2][2] = 'X';
                break;
            case "23":
                board[2][1] = 'X';
                board[2][2] = 'X';
                board[3][2] = 'X';
                break;
            case "24":
                board[2][1] = 'X';
                board[1][2] = 'X';
                break;
            default:
                break;
        }
        switch (minutes) {
            case "01":
                board[3][5] = 'X';
                break;
            case "02":
                board[2][5] = 'X';
                break;
            case "03":
                board[3][5] = 'X';
                board[2][5] = 'X';
                break;
            case "04":
                board[1][5] = 'X';
                break;
            case "05":
                board[1][5] = 'X';
                board[3][5] = 'X';
                break;
            case "06":
                board[1][5] = 'X';
                board[2][5] = 'X';
                break;
            case "07":
                board[1][5] = 'X';
                board[2][5] = 'X';
                board[3][5] = 'X';
                break;
            case "08":
                board[0][5] = 'X';
                break;
            case "09":
                board[0][5] = 'X';
                board[3][5] = 'X';
                break;
            case "10":
                board[3][4] = 'X';
                break;
            case "11":
                board[3][4] = 'X';
                board[3][5] = 'X';
                break;
            case "12":
                board[3][4] = 'X';
                board[2][5] = 'X';
                break;
            case "13":
                board[3][4] = 'X';
                board[2][5] = 'X';
                board[3][5] = 'X';
                break;
            case "14":
                board[3][4] = 'X';
                board[1][5] = 'X';
                break;
            case "15":
                board[3][4] = 'X';
                board[1][5] = 'X';
                board[3][5] = 'X';
                break;
            case "16":
                board[3][4] = 'X';
                board[1][5] = 'X';
                board[2][5] = 'X';
                break;
            case "17":
                board[3][4] = 'X';
                board[1][5] = 'X';
                board[2][5] = 'X';
                board[3][5] = 'X';
                break;
            case "18":
                board[3][4] = 'X';
                board[0][5] = 'X';
                break;
            case "19":
                board[3][4] = 'X';
                board[0][5] = 'X';
                board[3][5] = 'X';
                break;
            case "20":
                board[2][4] = 'X';
                break;
            case "21":
                board[2][4] = 'X';
                board[3][5] = 'X';
                break;
            case "22":
                board[2][4] = 'X';
                board[2][5] = 'X';
                break;
            case "23":
                board[2][4] = 'X';
                board[2][5] = 'X';
                board[3][5] = 'X';
                break;
            case "24":
                board[2][4] = 'X';
                board[1][5] = 'X';
                break;
            case "25":
                board[2][4] = 'X';
                board[1][5] = 'X';
                board[3][5] = 'X';
                break;
            case "26":
                board[2][4] = 'X';
                board[1][5] = 'X';
                board[2][5] = 'X';
                break;
            case "27":
                board[2][4] = 'X';
                board[1][5] = 'X';
                board[2][5] = 'X';
                board[3][5] = 'X';
                break;
            case "28":
                board[2][4] = 'X';
                board[0][5] = 'X';
                break;
            case "29":
                board[2][4] = 'X';
                board[0][5] = 'X';
                board[3][5] = 'X';
                break;
            case "30":
                board[2][4] = 'X';
                board[3][4] = 'X';
                break;
            case "31":
                board[2][4] = 'X';
                board[3][4] = 'X';
                board[3][5] = 'X';
                break;
            case "32":
                board[2][4] = 'X';
                board[3][4] = 'X';
                board[2][5] = 'X';
                break;
            case "33":
                board[2][4] = 'X';
                board[3][4] = 'X';
                board[2][5] = 'X';
                board[3][5] = 'X';
                break;
            case "34":
                board[2][4] = 'X';
                board[3][4] = 'X';
                board[1][5] = 'X';
                break;
            case "35":
                board[1][4] = 'X';
                board[1][5] = 'X';
                board[3][5] = 'X';
                break;
            case "36":
                board[2][4] = 'X';
                board[3][4] = 'X';
                board[1][5] = 'X';
                board[2][5] = 'X';
                break;
            case "37":
                board[2][4] = 'X';
                board[3][4] = 'X';
                board[1][5] = 'X';
                board[2][5] = 'X';
                board[3][5] = 'X';
                break;
            case "38":
                board[2][4] = 'X';
                board[3][4] = 'X';
                board[0][5] = 'X';
                break;
            case "39":
                board[2][4] = 'X';
                board[3][4] = 'X';
                board[0][5] = 'X';
                board[3][5] = 'X';
                break;
            case "40":
                board[1][4] = 'X';
                board[3][4] = 'X';
                break;
            case "41":
                board[1][4] = 'X';
                board[3][4] = 'X';
                board[3][5] = 'X';
                break;
            case "42":
                board[1][4] = 'X';
                board[3][4] = 'X';
                board[2][5] = 'X';
                break;
            case "43":
                board[1][4] = 'X';
                board[3][4] = 'X';
                board[3][5] = 'X';
                board[2][5] = 'X';
                break;
            case "44":
                board[1][4] = 'X';
                board[3][4] = 'X';
                board[1][5] = 'X';
                break;
            case "45":
                board[1][4] = 'X';
                board[3][4] = 'X';
                board[1][5] = 'X';
                board[3][5] = 'X';
                break;
            case "46":
                board[1][4] = 'X';
                board[3][4] = 'X';
                board[1][5] = 'X';
                board[2][5] = 'X';
                break;
            case "47":
                board[1][4] = 'X';
                board[3][4] = 'X';
                board[1][5] = 'X';
                board[3][5] = 'X';
                board[2][5] = 'X';
                break;
            case "48":
                board[1][4] = 'X';
                board[3][4] = 'X';
                board[0][5] = 'X';
                break;
            case "49":
                board[1][4] = 'X';
                board[3][4] = 'X';
                board[0][5] = 'X';
                board[3][5] = 'X';
                break;
            case "50":
                board[1][4] = 'X';
                board[2][4] = 'X';
                break;
            case "51":
                board[1][4] = 'X';
                board[2][4] = 'X';
                board[3][5] = 'X';
                break;
            case "52":
                board[1][4] = 'X';
                board[2][4] = 'X';
                board[2][5] = 'X';
                break;
            case "53":
                board[1][4] = 'X';
                board[2][4] = 'X';
                board[3][5] = 'X';
                board[2][5] = 'X';
                break;
            case "54":
                board[1][4] = 'X';
                board[2][4] = 'X';
                board[1][5] = 'X';
                break;
            case "55":
                board[1][4] = 'X';
                board[2][4] = 'X';
                board[1][5] = 'X';
                board[3][5] = 'X';
                break;
            case "56":
                board[1][4] = 'X';
                board[2][4] = 'X';
                board[2][5] = 'X';
                board[1][5] = 'X';
                break;
            case "57":
                board[1][4] = 'X';
                board[2][4] = 'X';
                board[2][5] = 'X';
                board[1][5] = 'X';
                board[3][5] = 'X';
                break;
            case "58":
                board[1][4] = 'X';
                board[2][4] = 'X';
                board[0][5] = 'X';
                break;
            case "59":
                board[1][4] = 'X';
                board[2][4] = 'X';
                board[0][5] = 'X';
                board[3][5] = 'X';
                break;
            default:
                break;
        }
        switch (seconds) {
            case "01":
                board[3][8] = 'X';
                break;
            case "02":
                board[2][8] = 'X';
                break;
            case "03":
                board[3][8] = 'X';
                board[2][8] = 'X';
                break;
            case "04":
                board[1][8] = 'X';
                break;
            case "05":
                board[1][8] = 'X';
                board[3][8] = 'X';
                break;
            case "06":
                board[1][8] = 'X';
                board[2][8] = 'X';
                break;
            case "07":
                board[1][8] = 'X';
                board[2][8] = 'X';
                board[3][8] = 'X';
                break;
            case "08":
                board[0][8] = 'X';
                break;
            case "09":
                board[0][8] = 'X';
                board[3][8] = 'X';
                break;
            case "10":
                board[3][7] = 'X';
                break;
            case "11":
                board[3][7] = 'X';
                board[3][8] = 'X';
                break;
            case "12":
                board[3][7] = 'X';
                board[2][8] = 'X';
                break;
            case "13":
                board[3][7] = 'X';
                board[2][8] = 'X';
                board[3][8] = 'X';
                break;
            case "14":
                board[3][7] = 'X';
                board[1][8] = 'X';
                break;
            case "15":
                board[3][7] = 'X';
                board[1][8] = 'X';
                board[3][8] = 'X';
                break;
            case "16":
                board[3][7] = 'X';
                board[1][8] = 'X';
                board[2][8] = 'X';
                break;
            case "17":
                board[3][7] = 'X';
                board[1][8] = 'X';
                board[2][8] = 'X';
                board[3][8] = 'X';
                break;
            case "18":
                board[3][7] = 'X';
                board[0][8] = 'X';
                break;
            case "19":
                board[3][7] = 'X';
                board[0][8] = 'X';
                board[3][8] = 'X';
                break;
            case "20":
                board[2][7] = 'X';
                break;
            case "21":
                board[2][7] = 'X';
                board[3][8] = 'X';
                break;
            case "22":
                board[2][7] = 'X';
                board[2][8] = 'X';
                break;
            case "23":
                board[2][7] = 'X';
                board[2][8] = 'X';
                board[3][8] = 'X';
                break;
            case "24":
                board[2][7] = 'X';
                board[1][8] = 'X';
                break;
            case "25":
                board[2][7] = 'X';
                board[1][8] = 'X';
                board[3][8] = 'X';
                break;
            case "26":
                board[2][7] = 'X';
                board[1][8] = 'X';
                board[2][8] = 'X';
                break;
            case "27":
                board[2][7] = 'X';
                board[1][8] = 'X';
                board[2][8] = 'X';
                board[3][8] = 'X';
                break;
            case "28":
                board[2][7] = 'X';
                board[0][8] = 'X';
                break;
            case "29":
                board[2][7] = 'X';
                board[0][8] = 'X';
                board[3][8] = 'X';
                break;
            case "30":
                board[2][7] = 'X';
                board[3][7] = 'X';
                break;
            case "31":
                board[2][7] = 'X';
                board[3][7] = 'X';
                board[3][8] = 'X';
                break;
            case "32":
                board[2][7] = 'X';
                board[3][7] = 'X';
                board[2][8] = 'X';
                break;
            case "33":
                board[2][7] = 'X';
                board[3][7] = 'X';
                board[2][8] = 'X';
                board[3][8] = 'X';
                break;
            case "34":
                board[2][7] = 'X';
                board[3][7] = 'X';
                board[1][8] = 'X';
                break;
            case "35":
                board[1][7] = 'X';
                board[1][8] = 'X';
                board[3][8] = 'X';
                break;
            case "36":
                board[2][7] = 'X';
                board[3][7] = 'X';
                board[1][8] = 'X';
                board[2][8] = 'X';
                break;
            case "37":
                board[2][7] = 'X';
                board[3][7] = 'X';
                board[1][8] = 'X';
                board[2][8] = 'X';
                board[3][8] = 'X';
                break;
            case "38":
                board[2][7] = 'X';
                board[3][7] = 'X';
                board[0][8] = 'X';
                break;
            case "39":
                board[2][7] = 'X';
                board[3][7] = 'X';
                board[0][8] = 'X';
                board[3][8] = 'X';
                break;
            case "40":
                board[1][7] = 'X';
                board[3][7] = 'X';
                break;
            case "41":
                board[1][7] = 'X';
                board[3][7] = 'X';
                board[3][8] = 'X';
                break;
            case "42":
                board[1][7] = 'X';
                board[3][7] = 'X';
                board[2][8] = 'X';
                break;
            case "43":
                board[1][7] = 'X';
                board[3][7] = 'X';
                board[3][8] = 'X';
                board[2][8] = 'X';
                break;
            case "44":
                board[1][7] = 'X';
                board[3][7] = 'X';
                board[1][8] = 'X';
                break;
            case "45":
                board[1][7] = 'X';
                board[3][7] = 'X';
                board[1][8] = 'X';
                board[3][8] = 'X';
                break;
            case "46":
                board[1][7] = 'X';
                board[3][7] = 'X';
                board[1][8] = 'X';
                board[2][8] = 'X';
                break;
            case "47":
                board[1][7] = 'X';
                board[3][7] = 'X';
                board[1][8] = 'X';
                board[3][8] = 'X';
                board[2][8] = 'X';
                break;
            case "48":
                board[1][7] = 'X';
                board[3][7] = 'X';
                board[0][8] = 'X';
                break;
            case "49":
                board[1][7] = 'X';
                board[3][7] = 'X';
                board[0][8] = 'X';
                board[3][8] = 'X';
                break;
            case "50":
                board[1][7] = 'X';
                board[2][7] = 'X';
                break;
            case "51":
                board[1][7] = 'X';
                board[2][7] = 'X';
                board[3][8] = 'X';
                break;
            case "52":
                board[1][7] = 'X';
                board[2][7] = 'X';
                board[2][8] = 'X';
                break;
            case "53":
                board[1][7] = 'X';
                board[2][7] = 'X';
                board[3][8] = 'X';
                board[2][8] = 'X';
                break;
            case "54":
                board[1][7] = 'X';
                board[2][7] = 'X';
                board[1][8] = 'X';
                break;
            case "55":
                board[1][7] = 'X';
                board[2][7] = 'X';
                board[1][8] = 'X';
                board[3][8] = 'X';
                break;
            case "56":
                board[1][7] = 'X';
                board[2][7] = 'X';
                board[2][8] = 'X';
                board[1][8] = 'X';
                break;
            case "57":
                board[1][7] = 'X';
                board[2][7] = 'X';
                board[2][8] = 'X';
                board[1][8] = 'X';
                board[3][8] = 'X';
                break;
            case "58":
                board[1][7] = 'X';
                board[2][7] = 'X';
                board[0][8] = 'X';
                break;
            case "59":
                board[1][7] = 'X';
                board[2][7] = 'X';
                board[0][8] = 'X';
                board[3][8] = 'X';
                break;
            default:
                break;
        }

        printBoard(board);
    }

    static char[][] cloneArray(char[][] array) {
        return Arrays.stream(array).map(char[]::clone).toArray(char[][]::new);
    }

    public static void main(String[] args) {

        char[][] board = {

                {'|', ' ', '*','|', ' ', '*','|',' ', '*','|'},
                {'|', ' ', '*','|', '*', '*','|','*', '*','|'},
                {'|', '*', '*','|', '*', '*','|','*', '*','|'},
                {'|', '*', '*','|', '*', '*','|','*', '*','|'},
        };
        char[][] cleanBoard = cloneArray(board);

        while(true) {
            LocalDateTime ldt = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            String time = ldt.format(formatter);
            try {
                Thread.sleep(1000);
                System.out.println("\nTime: " + time);
                clock(board, time);
                board = cloneArray(cleanBoard);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
