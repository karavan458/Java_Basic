package chapter17.sec02;

//Printable을 상속하는 인터페이스
interface ColorPrintable extends Printable {
    void printCMYK(String doc);
}

//S사의 컬러 프린트 드라이버
class Prn909 implements ColorPrintable {
    //흑백출력
    @Override
    public void print(String doc) {
        System.out.println("From MD-909 black & white ver");
        System.out.println(doc);
    }

    //컬러 출력
    @Override
    public void printCMYK(String doc) {
        System.out.println("From MD-909 CMYK ver");
        System.out.println(doc);
    }
}

public class PrintableDriver3 {
    public static void main(String[] args) {
        String myDoc = "This is report about ....";
        ColorPrintable prn = new Prn909();

        prn.print(myDoc);
        System.out.println();
        prn.printCMYK(myDoc);
    }
}
