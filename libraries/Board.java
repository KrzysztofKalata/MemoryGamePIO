package memoryGame;

public class Board {
    public Card[] cards;
    private int sizeOfBoard;

    public Board() {

    }

    public Board(int sizeOfBoard) {
        int j = 0;
        switch (sizeOfBoard) {
            case 12:
                cards = new Card[12];
                this.sizeOfBoard = sizeOfBoard;
                generateBoard();
                break;
            case 16:
                cards = new Card[16];
                this.sizeOfBoard = sizeOfBoard;
                generateBoard();
                break;
            case 20:
                cards = new Card[20];
                this.sizeOfBoard = sizeOfBoard;
                generateBoard();
                break;
            default:
                System.out.println("ERROR");
                break;

        }

    }

    public void generateBoard() {
        int j = 0;
        for (int i = 0; i < cards.length; i++) {
            cards[i] = new Card(j);
            if (i % 2 == 1) {
                j++;
            }

        }
    }
}