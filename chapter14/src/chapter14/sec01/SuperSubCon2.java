package chapter14.sec01;

class SuperCLS2 {
    public SuperCLS2() {
        System.out.println("Con : SuperCLS2");
    }

    public SuperCLS2(int i) { // 1
        System.out.println("Con : SuperCLS2(int i)");
    }

    public SuperCLS2(int i, int j) { // 2
        System.out.println("Con : SuperCLS2(int i, int j)");
    }
}

class SubCLS2 extends SuperCLS2 {
    public SubCLS2() {
        System.out.println("Con : SubCLS2:)");
    }

    public SubCLS2(int i) {
        super(i);
        System.out.println("Con : SubCLS2(int i)");
    }

    public SubCLS2(int i, int j) {
        super(i, j);
        System.out.println("Con : SubCLS2(int i, int j)");
    }
}

public class SuperSubCon2 {
    public static void main(String[] args) {
        System.out.println("1. ");
        new SubCLS2();
        System.out.println();

        System.out.println("2. ");
        new SubCLS2(1);
        System.out.println();

        System.out.println("3. ");
        new SubCLS2(2, 3);
        System.out.println();
    }
}
