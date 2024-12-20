class Point2 implements Cloneable {
    private int xPos, yPos;

    public Point2(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public void showPosition() {
        System.out.printf("[%d, %d]\n", xPos, yPos);
    }

    public void changePos(int x, int y) {
        xPos = x;
        yPos = y;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Ractangle implements Cloneable {
    private Point2 upperLeft;
    private Point2 lowerRight;

    public Ractangle(int x1, int y1, int x2, int y2) {
        upperLeft = new Point2(x1, y1);
        lowerRight = new Point2(x2, y2);
    }

    public void changePos(int x1, int y1, int x2, int y2) {
        upperLeft.changePos(x1, y1);
        lowerRight.changePos(x2, y2);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void showPosition() {
        System.out.print("좌측 상단 : ");
        upperLeft.showPosition();
        System.out.print("우측 하단 : ");
        lowerRight.showPosition();
    }

}

public class ShallowCopy {
    public static void main(String[] args) {
        Ractangle org = new Ractangle(1, 1, 9, 9);
        Ractangle cpy;

        try{
            cpy = (Ractangle)org.clone();
            org.changePos(2, 2, 7, 7);

            org.showPosition();
            cpy.showPosition();
        }
        catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
