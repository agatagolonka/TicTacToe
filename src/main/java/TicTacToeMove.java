public class TicTacToeMove {

    private char sign;

    public TicTacToeMove() {
    }

    public char getSign() {
        return this.sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void changePlayer() {
        this.sign = (this.sign == 'o') ? 'x' : 'o';
    }
}
