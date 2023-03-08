package chapter05.sec05;

public class Ex04LengthExample {
    public static void main(String[] args) {
        String ssn = "9506242XXXXXX";
        int length = ssn.length();

        if(length == 13) {
            System.out.println("옳바른 주민등록번호입니다.");
        }
        else {
            System.out.println("주민등록번호를 다시 확인하세요.");
        }
    }
}
