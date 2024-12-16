package chapter15.sec03;

class Cake {}
class CheeseCake extends Cake {}
class StrawberryCake extends Cake {}

public class YummyCakeOf {
    public static void main(String[] args) {
        Cake cake = new StrawberryCake();

        if(cake instanceof Cake) {
            System.out.println("케익 인스턴스 or");
            System.out.println("케익 상속하는 인스턴스 \n");
        }

        if(cake instanceof CheeseCake) {
            System.out.println("치즈케익 인스턴스 or");
            System.out.println("치즈케익 상속하는 인스턴스 \n");
        }

        if(cake instanceof StrawberryCake) {
            System.out.println("딸기치즈케익 인스턴스 or");
            System.out.println("딸치즈케익 상속하는 인스턴스 \n");
        }
    }
}