package part01.chapter03.sec01;

public class Ex01SignOperatorExample {
    public static void main(String[] args) {
        int x = -100;
        x = -x;
        System.out.println("x : " + x);

        byte b = 100;
        int y = -b;
        System.out.println("y : " + y);
    }
}
