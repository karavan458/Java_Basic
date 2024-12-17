package chapter17.sec02;

interface PrintMethod {
    static void printLine(String str) {
        System.out.println(str);
    }

    default void print(String str) {
        printLine(str);
    }
}

class Printer implements PrintMethod { }

public class SimplePrinter {
    public static void main(String[] args) {
        String myDoc = "This is my report";
        PrintMethod prn = new Printer();

        prn.print(myDoc);
        //인터페이스의 static method 직접 호출
        PrintMethod.printLine("end of line");
    }
}
