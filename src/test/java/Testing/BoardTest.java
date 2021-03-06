package Testing;

import main.Board;
import main.Frame;
import main.Pool;

public class BoardTest
{

    public static void main(String[] args)
    {
        Pool pool = new Pool();

        //Testing the creation and display of Board.
        Board board = new Board();
        System.out.println("Creation and display of a new blank board: \n" + board);


        //Testing the ability to place a word with all necessary checks included.
        //Involves the creation of a special testing frame (below)
        Frame frame = new Frame(pool);
        frame.createTestableFrame();
        System.out.println("A special frame is created for testing purposes: " + frame);

        //Placing of two words intersecting each other:
        board.placeWord(3,7,"HELLO", frame,true);
        System.out.println("Board after placing word 'hello'\n" + board);
        board.placeWord(7,6,"NOT", frame,false);
        System.out.println("Board after placing word 'not' on the end of the 'hello'\n" + board);


        //Testing of resetBoard function:
        board.resetBoard();
        System.out.println("Board after being reset:\n" + board);

    }

}
