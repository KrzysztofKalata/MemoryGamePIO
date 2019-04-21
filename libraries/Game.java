package memoryGame;

public class Game {
    private Board board;
    private int score = 0;
    private int multiplier = 0;
    private int lifes = 0;
    private int difficulty = 0;
    private int sizeOfBoard = 0;

    public Game() {

    }

    public Game(int difficulty, int sizeOfBoard) {
        if (sizeOfBoard != 12 && sizeOfBoard != 16 && sizeOfBoard != 20) {
            //TU POLECI ERROR
        }
        if (difficulty != 1 && difficulty != 2 && difficulty != 3) {
            //TU POLECI ERROR
        }

        this.difficulty = difficulty;
        this.sizeOfBoard = sizeOfBoard;

        switch (difficulty) {
            case 1:
                board = new Board(sizeOfBoard);
                this.lifes = 9999999;
                this.multiplier = 1;
                break;
            case 2:
                board = new Board(sizeOfBoard);
                this.lifes = sizeOfBoard;
                this.multiplier = 2;
                break;
            case 3:
                board = new Board(sizeOfBoard);
                this.lifes = sizeOfBoard / 2;
                this.multiplier = 3;
                break;
            default:
                // MIEJSCE NA ERROR
        }

    }

    public Board getBoard() {
        return board;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public int getLifes() {
        return lifes;
    }

    public int getMultiplier() {
        return multiplier;
    }

    public int getScore() {
        return score;
    }

    public int getSizeOfBoard() {
        return sizeOfBoard;
    }
}