package main;


import java.util.Random;
import java.util.Scanner;


public class main
{
    public static void main(String[] args)
    {
        Random generator = new Random();
        int random = 0;
        Board board = new Board(12);
        int random_tab[] = {0,1,2,3,4,5,6,7,8,9,10,11};
        int i = 0;
        while (i != 100)
        {
            random = generator.nextInt(12);
            if(random_tab[random] != -1)
            {

                System.out.print(board.cards[random_tab[random]].getId_card());
                random_tab[random] = -1;
                if ((i + 1) % 4 == 0)
                {
                    System.out.println();
                }
                i++;
            }
        }
    }
}

