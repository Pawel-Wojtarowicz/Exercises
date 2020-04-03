public class Sudoku {

    public static int current[][] = new int[9][9];
    public static int sudoku[][] =
            {{5,3,0,0,7,0,0,0,0},
                    {6,0,0,1,9,5,0,0,0},
                    {0,9,8,0,0,0,0,6,0},
                    {8,0,0,0,6,0,0,0,3},
                    {4,0,0,8,0,3,0,0,1},
                    {7,0,0,0,2,0,0,0,6},
                    {0,6,0,0,0,0,2,8,0},
                    {0,0,0,4,1,9,0,0,5},
                    {0,0,0,0,8,0,0,7,9}};

    static void printBoard(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == 0) System.out.print(". ");
                if (board[i][j] == 1) System.out.print("1 ");
                if (board[i][j] == 2) System.out.print("2 ");
                if (board[i][j] == 3) System.out.print("3 ");
                if (board[i][j] == 4) System.out.print("4 ");
                if (board[i][j] == 5) System.out.print("5 ");
                if (board[i][j] == 6) System.out.print("6 ");
                if (board[i][j] == 7) System.out.print("7 ");
                if (board[i][j] == 8) System.out.print("8 ");
                if (board[i][j] == 9) System.out.print("9 ");
            }
            System.out.println(" ");
        }
    }

    static boolean isPossible(int x, int y, int value){
        for(int i = 0; i < 9; i++) {
            if (value == current[x][i] || value == current[i][y] ||
                    value == current[x/3*3+i%3][y/3*3+i/3]) return false;
        } return true;
    }

    static boolean next(int x, int y) {
        if (x == 8 && y == 8) return true;
        else if (x == 8) return solve(0, y + 1);
        else return solve(x + 1, y);
    }

    static boolean solve(int x, int y) {
        if (sudoku[x][y] == 0) {
            for(int i = 1; i <= 9; i++) {
                if (isPossible(x, y, i)) {
                    current[x][y] = i;
                    if (next(x, y)) return true;
                }
            } current[x][y] = 0; return false;
        } return next(x, y);
    }

    static void solveSudoku(){
        for(int i=0; i<9; i++)
            for(int j=0; j<9; j++)
                current[i][j] = sudoku[i][j];
        if (solve(0,0)) {
            for(int i=0; i<9; i++) {
                for(int j=0; j<9; j++) {
                    System.out.print(current[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Impossible");
        }
    }

    public static void main(String[] args) {

        System.out.print("Sudoku to solve:\n");
        printBoard(sudoku);
        System.out.println("\nSolved Sudoku:");
        solveSudoku();
        }
    }

