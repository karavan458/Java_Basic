package chapter03.sec04;

public class Ex01AccuracyExample {
    public static void main(String[] args) {
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;

        double result = apple - number * pieceUnit;
        System.out.println("사과 1개에서 남은 양 : " + result);

    }
}
