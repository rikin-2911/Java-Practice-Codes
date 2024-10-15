import java.util.Scanner;
public class nextPosOfQueenW66j{
    // 8x8 chessboard represented by a 2D array
    static char[][] board = new char[8][8];

    // Method to initialize the chessboard
    public static void initializeBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = '.';
            }
        }
    }

    // Method to display the chessboard
    public static void printBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method to check if the move is valid for the Queen
    public static boolean isValidQueenMove(int startX, int startY, int endX, int endY) {
        // Check if the move is horizontal, vertical, or diagonal
        if (startX == endX || startY == endY || Math.abs(startX - endX) == Math.abs(startY - endY)) {
            return true;
        }
        return false;
    }

    // Method to move the Queen
    public static void moveQueen(int startX, int startY, int endX, int endY) {
        if (isValidQueenMove(startX, startY, endX, endY)) {
            // Move the Queen
            board[startX][startY] = '.';  // Clear the previous position
            board[endX][endY] = 'Q';      // Place the Queen at the new position
            System.out.println("Queen moved successfully!");
        } else {
            System.out.println("Invalid move for the Queen.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the board and place the Queen at a starting position
        initializeBoard();
        System.out.println("Enter the initial position of the Queen (row and column): ");
        int startX = scanner.nextInt() - 1;
        int startY = scanner.nextInt() - 1;
        board[startX][startY] = 'Q';

        // Display the initial board
        printBoard();

        // Get the new position to move the Queen
        System.out.println("Enter the new position to move the Queen (row and column): ");
        int endX = scanner.nextInt() - 1;
        int endY = scanner.nextInt() - 1;

        // Try to move the Queen
        moveQueen(startX, startY, endX, endY);

        // Display the board after the move
        printBoard();

        scanner.close();
    }
}
    