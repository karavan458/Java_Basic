package chapter14.sec02;

class SuperCLS {
    protected static int count = 0; //  procted는 하위 클래스 접근을 허용

    public SuperCLS() {
        count++;
    }
}

class SubCLS extends SuperCLS {
    public void showCount() {
        //상위 클래스에 위치한 클래스 변수 count에 접근함
        System.out.println(count);
    }
}

public class SuperSubStatic {
    public static void main(String[] args) {
        SuperCLS obj1 = new SuperCLS();
        SuperCLS obj2 = new SuperCLS();

        //아래 인스턴스 생성 과정에서 SuperCLS생성자 호출됨
        SubCLS obj3 = new SubCLS();
        obj3.showCount();
    }
}
