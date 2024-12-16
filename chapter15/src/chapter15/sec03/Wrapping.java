
package chapter15.sec03;

class Box {
    public void simpleWrap() {
        System.out.println("Simple wrap");
    }
}

class PaperBox extends Box {
    public void paperWrap() {
        System.out.println("Paper wrap");
    }
}

class GoldPaperBox extends PaperBox {
    public void goldWrap() {
        System.out.println("Gold wrap");
    }
}

public class Wrapping {
    public static void main(String[] args) {
        Box box1 = new Box();
        PaperBox box2 = new PaperBox();
        GoldPaperBox box3 = new GoldPaperBox();

        wrapBox(box1);
        wrapBox(box2);
        wrapBox(box3);
    }

    public static void wrapBox(Box box) {
        if(box instanceof GoldPaperBox) ((GoldPaperBox) box).goldWrap();
        else if(box instanceof PaperBox) ((PaperBox) box).paperWrap();
        else box.simpleWrap();
        // 메서드 오버라이딩을 하면 핝줄로 출력가능하다.
    }

}
