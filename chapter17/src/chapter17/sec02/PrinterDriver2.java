package chapter17.sec02;

interface Printable {   //os에서 제공하는 인터페이스
    void print(String doc);   //흘백 출력을 위한 추상메서드
}

class Prn204Drv implements Printable {
    @Override
    public void print(String doc) {
        System.out.println("From Prn204Drv");
        System.out.println(doc);
    }
}

class Prn731Drv implements Printable {
    @Override
    public void print(String doc) {
        System.out.println("From Prn731Drv");
        System.out.println(doc);
    }
}

public class PrinterDriver2 {
    public static void main(String[] args) {
        String myDoc = "This is report about ....";

        Printable prn = new Prn204Drv();
        prn.print(myDoc);

        System.out.println();

        Printable prn2 = new Prn731Drv();
        prn2.print(myDoc);
    }
}
