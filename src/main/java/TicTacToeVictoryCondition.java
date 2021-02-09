import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TicTacToeVictoryCondition {

    List<Character> boardToVictoryCondition;
    Boolean isWinner = false;

    public List<Character> getBoardToVictoryCondition() {
        return this.boardToVictoryCondition;
    }

    public char getField(int i) {
        return this.boardToVictoryCondition.get(i);
    }

    public boolean checkField(int i) {
        if (this.boardToVictoryCondition.get(i) == 'o' || this.boardToVictoryCondition.get(i) == 'x')
            return true;

        else
            return false;
    }

    public void setBoardToVictoryCondition(int toReplace, char sign) {
        this.boardToVictoryCondition.set(toReplace, sign);
    }

    public TicTacToeVictoryCondition() {
        this.boardToVictoryCondition = IntStream.rangeClosed(1, 9).boxed()
                .map(i -> Character.forDigit(i, 10))
                .collect(Collectors.toList());

    }

    public boolean checkWinner() {
        int row = 0;
        int col = 0;

        if ((this.boardToVictoryCondition.get(0) == this.boardToVictoryCondition.get(4) && this.boardToVictoryCondition.get(4) == this.boardToVictoryCondition.get(8))) {
            this.isWinner = true;
        } else if (this.boardToVictoryCondition.get(2) == this.boardToVictoryCondition.get(4) && this.boardToVictoryCondition.get(4) == this.boardToVictoryCondition.get(6)) {
            this.isWinner = true;
        } else {

            while (row < 7) {
                if (this.boardToVictoryCondition.get(0 + row) == this.boardToVictoryCondition.get(1 + row) && this.boardToVictoryCondition.get(1 + row) == this.boardToVictoryCondition.get(2 + row)) {
                    this.isWinner = true;
                }
                row = row + 3;
            }
            while (col < 3) {
                if (this.boardToVictoryCondition.get(0 + col) == this.boardToVictoryCondition.get(3 + col) && this.boardToVictoryCondition.get(3 + col) == this.boardToVictoryCondition.get(6 + col)) {
                    this.isWinner = true;
                }
                col = col + 1;
            }
        }
        return this.isWinner;
    }


}
