package chapter14.sec01;

class Man {
    String name;

    public void tellYourName() {
        System.out.printf("My name is %s\n", name);
    }
}

class BusinessMan extends Man {
    String company;
    String position;

    public BusinessMan(String name, String company, String position) {
        //상위 클래스 Man의 맴버 초기화
        this.name = name;

        //하위 클래스 BusinessMan의 맴버 초기화
        this.company = company;
        this.position = position;
    }

    public void tellYourCompany() {
        System.out.printf("My company is %s\n", company);
        System.out.printf("My position is %s\n", position);
        tellYourName();
    }
}

public class MyBusinessMan {
    public static void main(String[] args) {
        BusinessMan man = new BusinessMan("Yoon", "Hu compay", "engineer");
        man.tellYourCompany();
    }
}
