package chapter14.sec01;

class Man2 {
    String name;

    public Man2(String name) {
        this.name = name;
    }

    public void tellYouName() {
        System.out.println("My name is : " + name);
    }
}

class BusinessMan2 extends Man2 {
    String company;
    String position;

    public BusinessMan2(String name, String company, String position) {
        super(name); // 상위클래스의 생성자 호출
        this.company = company;
        this.position = position;
    }

    public void tellYourInfo() {
        System.out.println("My company is " + company);
        System.out.println("My position is " + position);
        tellYouName();
    }
}

public class MyBusinessMan2 {
    public static void main(String[] args) {
        BusinessMan2 man = new BusinessMan2("Yoon", "ELD", "engineer");
        man.tellYourInfo();
    }
}
