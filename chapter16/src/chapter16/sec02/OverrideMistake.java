package chapter16.sec02;

class ParentAdder {
    public int add(int a, int b) {
        return a + b;
    }
}

class ChildAdder extends ParentAdder {
    public double add(double a, double b) {
        return a + b;
    }
}

public class OverrideMistake {
    public static void main(String[] args) {
        ParentAdder parentAdder = new ChildAdder();
        System.out.println(parentAdder.add(1, 2));
    }
}
