package chapter18.sec01;

class Board{}
class PBoard extends Board {}

public class ClassCast {
    public static void main(String[] args) {
        Board b = new PBoard();
        PBoard p = (PBoard)b;

        System.out.println("intermediate location");
        Board b2 = new Board();
        PBoard p2 = (PBoard)b2;
    }

}
