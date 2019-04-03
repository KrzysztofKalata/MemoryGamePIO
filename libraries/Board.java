package main;

public class Board {
    public Card[] cards;
    private int size_of_board;

    public Board() {

    }
    public Board(int size_of_board) {
        int j = 0;
        switch (size_of_board)
        {
            case 12:
                cards = new Card[12];
                this.size_of_board = size_of_board;
                for(int i = 0 ; i <cards.length;i++)
                {
                    cards[i] = new Card(j);             //plansza 3x4
                    if(i%2 == 1)
                    {
                        j++;
                    }
                }
                break;
            case 16:
                cards = new Card[16];
                this.size_of_board = size_of_board;
                for(int i = 0 ; i <cards.length;i++)
                {
                    cards[i] = new Card(j);              //plansza 4x4
                    if(i%2 == 1)
                    {
                        j++;
                    }
                }
                break;
            case 20:
                cards = new Card[20];
                this.size_of_board = size_of_board;
                for(int i = 0 ; i <cards.length;i++)
                {
                    cards[i] = new Card(j);              //plansza 4x5
                    if(i%2 == 1)
                    {
                        j++;
                    }
                }
                break;
            default:
                System.out.println("ERROR");
                break;

        }

    }
    public void generateBoard() {

    }


}