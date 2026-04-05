package boardgame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null; // Mesmo se não colocarmos, o valor padrão de position é null, pois é um tipo
                         // referência
    }

    protected Board getBoard() {
        return board;
    }

}