package chapter15.sec02;

class Cake3 {
    public int size;

    public Cake3(int size) {
        this.size = size;
    }

    public void showCakeSize() {
        System.out.println("Bread Ounces : " + size);
    }
}

class CheeseCake3 extends Cake3 {
    public int size;

    public CheeseCake3(int size1, int size2) {
        super(size1);
        size = size2;
    }

    public void showCakeSize() {
        //super.size는 상위 클래스 맴버 size를 의미함
        System.out.println("Bread Ounces : " + super.size);

        //size 는 이 클래스의 맴버 size를 의미함
        System.out.println("Cheese Ounces : " + size);
    }
}

public class YummyCakeSize {
    public static void main(String[] args) {
        CheeseCake3 ca1 = new CheeseCake3(5, 7);
        Cake3 ca2 = ca1;

        //ca2는 Cake3형이므로 ca2.size는 Cake의 맴버 size를 의마함
        System.out.println("Bread Ounces : " + ca2.size);

        //ca1는 CheeseCake3형이므로 ca1.size는 CheeseCake의 맴버 size를 의마함
        System.out.println("Cheese Ounces : " + ca1.size);
        System.out.println();

        ca1.showCakeSize();
        System.out.println();
        ca2.showCakeSize();
    }
}
