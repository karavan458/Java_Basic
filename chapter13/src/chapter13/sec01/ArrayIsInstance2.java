package chapter13.sec01;

class Box {
    private String conts;

    Box(String conts) {
        this.conts = conts;
    }

    public String toString() {
        return conts;
    }

}

public class ArrayIsInstance2 {
    public static void main(String[] args) {
        //길이가 5인 box형 1차원 배열 생성
        Box[] ar = new Box[5];
        System.out.println("length = " + ar.length);
    }
}
