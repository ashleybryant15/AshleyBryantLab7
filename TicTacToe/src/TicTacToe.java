import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Disclaimer:
//  this is the WORST program I have ever coded

class TicTacToe {
    
    public static void main(String[] args) {
        
        Board Game = new Board();
        int[] move = new int[2];
        boolean space = true;
        char player = 'k'; //random variable to check
        int players = 2;
        char winner = 'f';
        int getTurn = 1;

    }
    
    public static void makeMove(Board Game, int[] move, boolean space, char player){
    new InputStreamReader(System.in);
        BufferedReader theKeyboard = new BufferedReader(new InputStreamReader(System.in));

        
        String input = "";


        System.out.println("Enter 1-9 to make a move.");

         

        System.out.println(Game); 
    }
    
    public static void changePlayer(Board Game, int[] move, boolean space, char player, int players, int getTurn){
        while (true) 
        {
            player = 'x';
            // Player X's turn
            if (getTurn % 2 != 0) {
                if (players == 2) {

                    System.out.print("Player X, Enter 1-9 to make choice: ");
                    while (true) {
                        move = makeMove();

                        spacesInUse(Game, move, space);
                    }

                }

            

            // Player O's turn
            System.out.print("Player O, Enter 1-9 to make choice: ");
            player = 'o';
            while (true) {
                move = makeMove();
                if (!Game.elementMarked(move[0], move[1]))
                    break;
                spacesInUse(Game, move, space);
            }

            Game.markSecond(move[0], move[1]);

                char winner = Game.win(); // Check if win

            if (winner != 'N')
                break;
            System.out.println(Game);

            getTurn++; // return turn to the other player
        }

        System.out.println(Game);
            char winner = 0;

        if (winner == 'T')
            System.out.println("Tie");

        if (winner != 'T')
            System.out.println("The winner is: " + winner);

    }

}


    public static void currentPlayer(char player){
        
        System.out.println("Current player is " +player);
        
    }
    
    public static boolean spacesInUse(Board Game, int[] move, boolean space){
        
        if (!Game.elementMarked(move[0], move[1])){
                        System.out.println("That space is occupied.");
                        
                        space = true;
        }
        
        return space;
    }

    public static int[] makeMove() {
        new InputStreamReader(System.in);
        BufferedReader theKeyboard = new BufferedReader(new InputStreamReader(System.in));

        String input = "";
        int[] move = new int[2];
        boolean errorInput = false;
        do {
            try {
                input = theKeyboard.readLine();
            } catch (IOException e) {
                System.out.println("input error:" + e);
                System.exit(1);
            }
            if (input.equals("1")) {
                move[0] = 0;
                move[1] = 0;
                errorInput = false;
            } else if (input.equals("2")) {
                move[0] = 0;
                move[1] = 1;
                errorInput = false;
            } else if (input.equals("3")) {
                move[0] = 0;
                move[1] = 2;
                errorInput = false;
            } else if (input.equals("4")) {
                move[0] = 1;
                move[1] = 0;
                errorInput = false;
            } else if (input.equals("5")) {
                move[0] = 1;
                move[1] = 1;
                errorInput = false;
            } else if (input.equals("6")) {
                move[0] = 1;
                move[1] = 2;
                errorInput = false;
            } else if (input.equals("7")) {
                move[0] = 2;
                move[1] = 0;
                errorInput = false;
            } else if (input.equals("8")) {
                move[0] = 2;
                move[1] = 1;
                errorInput = false;
            } else if (input.equals("9")) {
                move[0] = 2;
                move[1] = 2;
                errorInput = false;
            } else
                errorInput = true;

            if (errorInput)
                System.out.print("Error. Try again ");
        } while (errorInput);

        return move;
    }


    public static int[] Convert(int square) {
        int move[] = new int[2];

        if (square == 1) {
            move[0] = 0;
            move[1] = 0;
        } else if (square == 2) {
            move[0] = 0;
            move[1] = 1;
        } else if (square == 3) {
            move[0] = 0;
            move[1] = 2;
        } else if (square == 4) {
            move[0] = 1;
            move[1] = 0;
        } else if (square == 5) {
            move[0] = 1;
            move[1] = 1;
        } else if (square == 6) {
            move[0] = 1;
            move[1] = 2;
        } else if (square == 7) {
            move[0] = 2;
            move[1] = 0;
        } else if (square == 8) {
            move[0] = 2;
            move[1] = 1;
        } else if (square == 9) {
            move[0] = 2;
            move[1] = 2;
        }

        return move;
    }
}

class Board {
    private int[][] myBoard = new int[3][3];

    // Create a 3 by 3 array and use for a tic tac toe board.
    public Board() {
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                myBoard[row][column] = 0;
            }
        }
    }

    public int[][] copyBoard() {
        return myBoard;
    }

    /*
     * markFirst makes places a 2 accumulation for X
     */
    public void markFirst(int row, int column) {
        myBoard[row][column] = 2;
    }

    /*
     * markSecond makes places a 1 accumulation for O
     */
    public void markSecond(int row, int column) {
        myBoard[row][column] = 1;
    }

    /*
     * elementMarked returns a true if the space has been taken
     */
    public boolean elementMarked(int row, int column) {
        if (myBoard[row][column] == 0)
            return false;
        else
            return true;
    }

    /*
     * Win constructor checks if someone wins. Here are the meanings of each
     * return type 'N' means no winner; 'X' means X won; 'O' means O won
     */
    public char win() {
        char winner = 'N';
        int tieCheck = 1;

        // Check the columns
        for (int column = 0; column < 3; column++) {
            int accumulation = myBoard[0][column] * myBoard[1][column] * myBoard[2][column];

            if (accumulation == 8) // 2*2*2 = 8, a win for X
            {
                winner = 'X';
                break;
            }
            if (accumulation == 1) // 1*1*1 = 1, a win for O
            {
                winner = 'O';
                break;
            }
        }

        if (winner != 'N')
            return winner;

        // Check the rows
        for (int row = 0; row < 3; row++) {
            int accumulation = myBoard[row][0] * myBoard[row][1] * myBoard[row][2];
            if (accumulation == 8) {
                winner = 'X';
                break;
            }
            if (accumulation == 1) {
                winner = 'O';
                break;
            }
        }

        if (winner != 'N')
            return winner;

        // Check one diagonal
        int accumulation = myBoard[0][0] * myBoard[1][1] * myBoard[2][2];
        if (accumulation == 1)
            winner = 'O';
        if (accumulation == 8)
            winner = 'X';

        // Check the other diagonal
        accumulation = myBoard[0][2] * myBoard[1][1] * myBoard[2][0];
        if (accumulation == 1)
            winner = 'O';
        if (accumulation == 8)
            winner = 'X';


        if (winner == 'N') {
            for (int row = 0; row < 3; row++) {
                for (int column = 0; column < 3; column++) {
                    tieCheck *= myBoard[row][column];
                }
            }
            // any empty space is a zero. So product is zero if there is space
            // left.
            if (tieCheck != 0)
                winner = 'T';
        }

        return winner;
    }

    
    public String printBoard() {
        String printBoard = "";
        char XorO;
        int position = 49; 

        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                if (myBoard[row][column] == 1)

                    XorO = (char) (myBoard[row][column] + 78);
                else if (myBoard[row][column] == 2)

                    XorO = (char) (myBoard[row][column] + 86);
                else
                    XorO = (char) (position);

                position++;

                printBoard = printBoard + XorO + " ";
            }
            printBoard = printBoard + "\n"; 
            
        }
        return printBoard;
    }
}