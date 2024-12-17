
package chapter17.sec02;

interface Printable2 {
    void print(String doc);
    default void printCMYK(String doc) {};  //interface's default method
}

class Prn731Drv2 implements Printable2 {
    @Override
    public void print(String doc) {
        System.out.println("From MD-731ver2 printer");
        System.out.println(doc);
    }
}

class Prn9092 implements Printable2 {
    //흑백출력
    @Override
    public void print(String doc) {
        System.out.println("From MD-909ver2 black & white ver");
        System.out.println(doc);
    }

    //컬러 출력
    @Override
    public void printCMYK(String doc) {
        System.out.println("From MD-909ver2 CMYK ver");
        System.out.println(doc);
    }
}

public class PrintableDriver4 {
    public static void main(String[] args) {
        String myDoc = "This is report about ...";
        Printable2 prn1 = new Prn731Drv2();
        Printable2 prn2 = new Prn9092();
        
        prn1.print(myDoc);
        System.out.println();
        prn2.print(myDoc);
    }
}
