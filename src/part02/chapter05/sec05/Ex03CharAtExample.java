package part02.chapter05.sec05;

public class Ex03CharAtExample {
    public static void main(String[] args) {
        String ssn = "9606242XXXXXXXX";
        char sex = ssn.charAt(6);

        switch (sex) {
            case'1':
            case'3':
                System.out.println("남자입니다.");
                break;
            case'2':
            case'4':
                System.out.println("여자입니다.");
                break;
        }
    }
}
