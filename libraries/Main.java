package memoryGame;

import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Random generator = new Random();
        int random = 0;
        Board board = new Board(12);
        int randomTab[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int i = 0;
        while (i != 12) {
            random = generator.nextInt(12);
            if (randomTab[random] != -1) {

                System.out.print(board.cards[randomTab[random]].getCardValue());
                randomTab[random] = -1;
                if ((i + 1) % 4 == 0) {
                    System.out.println();
                }
                i++;
            }
        }
    }
}

