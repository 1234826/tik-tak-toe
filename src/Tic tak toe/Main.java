import sample.Board;

import java.util.Scanner

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();

        board.display();

        if ( Player1(board) ) {
            System.out.println("player 1 win");
        } else {
            System.out.println("Game over");
        }

        if ( Player2(board)) {
            System.out.println("player 2 win");
        } else {
            System.out.println("Game over");
        }

        System.out.println ("Draw game");
    }

    public static boolean Player1(Board brd) {
        System.out.print("X");

        Scanner userInput2 = new Scanner(System.in);
        System.out.print("select a private char");
        Char op = userInput2.next();

        if(brd.a1 == 'X' && brd.a2 == 'X' &&  brd.a3 == 'X')
            return true;
        if(brd.b1 == 'X' && brd.b2 == 'X' && brd.b3 == 'X')
            return true;
        if(brd.c1 == 'X' && brd.c2 == 'X' && brd.c3 == 'X')
            return true;
        if(brd.a1 == 'X' && brd.b1 == 'X' && brd.c1 == 'X')
            return true;
        if(brd.a2 == 'X' && brd.b2 == 'X' && brd.c2 == 'X')
            return true;
        if(brd.a3 == 'X' && brd.b3 == 'X' && brd.c3 == 'X')
            return true;
        if(brd.a1 == 'X' && brd.b2 == 'X' && brd.c3 == 'X'")
            return true;
        if(brd.c1 == 'X' && brd.b2 == 'X' && brd.a3 == 'X')
            return true;
    }

    public static boolean Player2(Board brd) {
        System.out.print("O");

        Scanner userInput = new Scanner(System.in);
        System.out.print ("select a private char");
        Char op2 = userInput.next();

        if(brd.a1 == 'O' && brd.a2 == 'O' &&  brd.a3 == 'O')
            return true;
        if(brd.b1 == 'O' && brd.b2 == 'O' && brd.b3 == 'O')
            return true;
        if(brd.c1 == 'O' && brd.c2 == 'O' && brd.c3 == 'O')
            return true;
        if(brd.a1 == 'O' && brd.b1 == 'O' && brd.c1 == 'O')
            return true;
        if(brd.a2 == 'O' && brd.b2 == 'O' && brd.c2 == 'O')
            return true;
        if(brd.a3 == 'O' && brd.b3 == 'O' && brd.c3 == 'O')
            return true;
        if(brd.a1 == 'O' && brd.b2 == 'O' && brd.c3 == 'O'")
            return true;
        if(brd.c1 == 'O' && brd.b2 == 'O' && brd.a3 == 'O')
            return true;
    }

}






