public class StringEquality {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");

        //참조대상을 비교하는 if ~ else 문
        if(s1 == s2) System.out.println("s1, s2 일치");
        else System.out.println("s1, s2 불일치");

        //두 인스턴스 내용을 비교하는 if ~ else 문
        if(s1.equals(s2)) System.out.println("s1, s2 same instance");
        else System.out.println("s1, s2 different instance");
    }
}
