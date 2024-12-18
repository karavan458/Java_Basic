package chapter18.sec01;

public class NullPointer {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str);
        int len = str.length();
    }
}
