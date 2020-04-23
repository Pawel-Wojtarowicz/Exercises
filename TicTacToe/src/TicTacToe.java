import java.util.*;

public class TicTacToe {

    static ArrayList<Integer> playerPos = new ArrayList<>();
    static ArrayList<Integer> cpuPos = new ArrayList<>();

    public static void main(String[] args) {

        char[][] board = {{' ', '|', ' ', '|', ' '},
                          {'-', '+', '-', '+', '-'},
                          {' ', '|', ' ', '|', ' '},
                          {'-', '+', '-', '+', '-'},
                          {' ', '|', ' ', '|', ' '}};
        printBoard(board);

        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose from (1-9):");
            //int choose = scanner.nextInt();
            placeSymbol(board, scanner.nextInt(), "player");

            Random random = new Random();
            int cpuChoose = random.nextInt(9 + 1);
            placeSymbol(board, cpuChoose, "cpu");
            System.out.println();
            printBoard(board);

            String result = checkWinner();
            System.out.println(result);
        }

    }

    public static String checkWinner() {

        List tRow = Arrays.asList(1, 2, 3);
        List mRow = Arrays.asList(4, 5, 6);
        List bRow = Arrays.asList(7, 8, 9);
        List lCol = Arrays.asList(1, 4, 7);
        List mCol = Arrays.asList(2, 5, 8);
        List rCol = Arrays.asList(3, 6, 9);
        List cross1 = Arrays.asList(1, 5, 9);
        List cross2 = Arrays.asList(7, 5, 3);

        List<List> winning = new ArrayList<>();
        winning.add(tRow);
        winning.add(mRow);
        winning.add(bRow);
        winning.add(lCol);
        winning.add(mCol);
        winning.add(rCol);
        winning.add(cross1);
        winning.add(cross2);

        for(List list : winning) {
            if(playerPos.containsAll(list)){
                System.out.println("You won!");
            }else if(cpuPos.containsAll(list)){
                System.out.println("CPU won ;(");
            } else if(playerPos.size() + cpuPos.size() == 9) {
                System.out.println("Draw");
            }
        }
        return "";
    }

    public static void printBoard(char[][] board){
        for (char[] row : board) {
            for(char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public static void placeSymbol(char[][] board, int choose, String user){
        char symbol = ' ';

        if(user.equals("player")){
            symbol = 'X';
        } else if(user.equals("cpu")) {
            symbol = 'O';
        }

        switch (choose) {
            case 1:
                board[0][0] = symbol;
                break;
            case 2:
                board[0][2] = symbol;
                break;
            case 3:
                board[0][4] = symbol;
                break;
            case 4:
                board[2][0] = symbol;
                break;
            case 5:
                board[2][2] = symbol;
                break;
            case 6:
                board[2][4] = symbol;
                break;
            case 7:
                board[4][0] = symbol;
                break;
            case 8:
                board[4][2] = symbol;
                break;
            case 9:
                board[4][4] = symbol;
                break;
            default:
                System.out.println("Wrong choose :(");
                break;
        }
    }

}
