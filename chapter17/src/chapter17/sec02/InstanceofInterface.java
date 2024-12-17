package chapter17.sec02;

interface Print {
    void printLine(String str);
}

class SimplePrint implements Print {
    @Override
    public void printLine(String str) {
        System.out.println(str);
    }
}

class MultiPrinter extends SimplePrint {
    public void printLine(String str) {
        super.printLine("start of multi....");
        super.printLine(str);
        super.printLine("end of multi....");
    }
}

public class InstanceofInterface {
    public static void main(String[] args) {
        Print print = new SimplePrint();
        Print print2 = new MultiPrinter();

        if(print instanceof Print) print.printLine("This is a  Simple Print");
        System.out.println();
        if(print2 instanceof Print) print2.printLine("This is a  Multi Print");
    }
}
