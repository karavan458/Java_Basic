package chapter15.sec02;

class MobilePhone {
    protected String number;

    public MobilePhone(String number) {
        this.number = number;
    }

    public void answer() {
        System.out.println("Hi ~ from " + number);
    }
}

class SmartPhone extends MobilePhone {
    private String androidVer;

    public SmartPhone(String num, String ver) {
        super(num);
        androidVer = ver;
    }

    public void playApp() {
        System.out.println("App is playing in " + androidVer);
    }
}

public class MobileSmartPhoneRef {
    public static void main(String[] args) {
        SmartPhone ph1 = new SmartPhone("010-0000-0000", "IceCreamCake");
        MobilePhone ph2 = new SmartPhone("010-1111-1111", "Nougat");

        ph1.answer();
        ph1.playApp();
        System.out.println();

        ph2.answer();
        //ph2.playApp();
    }
}
