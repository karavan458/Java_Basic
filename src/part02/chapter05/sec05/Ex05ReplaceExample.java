package part02.chapter05.sec05;

public class Ex05ReplaceExample {
    public static void main(String[] args) {
        String oldStr = "자바 문자열은 불변객체입니다. 자바 문자열은 String입니다.";
        String newStr = oldStr.replace("자바", "JAVA");

        System.out.println(oldStr);
        System.out.println(newStr);
    }
}
