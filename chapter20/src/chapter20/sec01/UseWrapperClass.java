package chapter20.sec01;

public class UseWrapperClass {
    public static void showDate(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {
        //java9 부터 불가함
        Integer iInst = new Integer(3);
        showDate(iInst);
        showDate(new Double(3.14));
    }
}
