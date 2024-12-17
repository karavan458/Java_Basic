package chapter17.sec01;

class SPrinterDriver implements Printable {
    @Override
    public void print(String doc) {
        System.out.println("printing by S Printer");
        System.out.println(doc);
    }
}

class LPrinterDriver implements Printable {
    @Override
    public void print(String doc) {
        System.out.println("printing by L Printer");
        System.out.println(doc);
    }
}

public class PrintDiver {
    public static void main(String[] args) {
        String myDoc = "This is a report about ....";

        //S사의 프린터로 출력
        Printable prn = new SPrinterDriver();
        prn.print(myDoc);

        System.out.println();

        //L사의 프린터로 출력
        prn = new LPrinterDriver();
        prn.print(myDoc);
    }
}
