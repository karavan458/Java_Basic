package chapter15.sec02;

class Cake {
    public void yummy() {
        System.out.println("Yummy Cake");
    }
}

class CheeseCake extends Cake {
    public void yummy() { //Cake 의 yummy를 오버라이딩
        System.out.println("Yummy Cheese Cake");
    }
}

public class YummyCakeOverriding {
    public static void main(String[] args) {
        Cake c1 = new CheeseCake();
        CheeseCake c2 = new CheeseCake();

        c1.yummy(); //overriding method call
        c2.yummy(); //overriding method call
    }
}
