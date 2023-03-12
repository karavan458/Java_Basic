package chapter06.sec07.exam05;

public class Car {
    //필드 선언
    String company = "현대 자동차";
    String model;
    String color;
    int maxSpeed;

    //생성자1
    Car(String model) {
        // 24라인 생성자 호출
        this(model, "은색", 250);
    }

    //생성자2
    Car(String model, String color) {
        // 24라인 생성자 호출
        this(model, color, 250);
    }

    //생성자3
    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

}
