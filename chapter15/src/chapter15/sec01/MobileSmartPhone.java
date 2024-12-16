package chapter15.sec01;

class MobilePhone {
    protected String number; // 전화번호

    public MobilePhone(String number) {
        this.number = number;
    }

    public void answer() {
        System.out.println("Hi ~ from " + number);
    }
}

class SmartPhone extends MobilePhone {
    private String android;

    public SmartPhone(String num, String ver) {
        super(num);
        android = ver;
    }

    public void playApp() {
        System.out.println("App is Running in " + android);
    }
}

public class MobileSmartPhone {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone("010-0000-0000", "Android IceCreamCake");
        phone.answer();
        phone.playApp();
    }
}
