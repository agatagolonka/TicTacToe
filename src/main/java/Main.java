import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        TicTacToeBoard displayedBoard = new TicTacToeBoard();
        TicTacToeVictoryCondition checkWinBoard = new TicTacToeVictoryCondition();
        TicTacToeMove Player = new TicTacToeMove();

        Player.setSign('x');
        char field=' ';

        System.out.println("Welcome to my tic tac toe game");

        while (!checkWinBoard.checkWinner()) {
            System.out.println(displayedBoard.getBoard());
            Player.changePlayer();
            System.out.println("Give me nr of field to add " + Player.getSign());
            
            do {
                    field = new Scanner(System.in).next().charAt(0);
                
                if (checkWinBoard.checkField(Character.getNumericValue(field)-1)) {

                    System.out.println("This field is occupied, Give me nr of field to add " + Player.getSign());
                }
            } while ((checkWinBoard.checkField(Character.getNumericValue(field)-1)));

            displayedBoard.setBoard(field, Player.getSign());
            checkWinBoard.setBoardToVictoryCondition(Character.getNumericValue(field) - 1, Player.getSign());
        }
        System.out.println("Winner is Player with sign "+Player.getSign());
    }

}
