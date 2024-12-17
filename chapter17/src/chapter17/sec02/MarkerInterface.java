package chapter17.sec02;

interface Upper{}
interface Lower{}

interface Print2 {
    String getContent();
}

class Report implements Print2, Upper {
    String cons;

    Report(String cons) {
        this.cons = cons;
    }

    @Override
    public String getContent() {
        return cons;
    }
}

class Printer2 {
    public void PrintContents(Print2 doc) {
        //doc 참조 인스턴스가 Upper 구현한다면
        if(doc instanceof Upper) System.out.println((doc.getContent()).toUpperCase());
        //doc 참조 인스턴스가 Lower 구현하다면
        else if(doc instanceof Lower) System.out.println((doc.getContent()).toLowerCase());
        else System.out.println(doc.getContent());
    }
}

public class MarkerInterface {
    public static void main(String[] args) {
        Printer2 prn = new Printer2();
        Report doc = new Report("Simple News");

        prn.PrintContents(doc);
    }
}
