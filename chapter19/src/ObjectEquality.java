class INum {
    private int num;

    public INum(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object obj) {
        if(this.num == ((INum)obj).num) return true;
        else return false;
    }
}

public class ObjectEquality {
    public static void main(String[] args) {
        INum n1 = new INum(10);
        INum n2 = new INum(12);
        INum n3 = new INum(10);

        if(n1.equals(n2)) System.out.println("num1, num2 내용 동일");
        else System.out.println("num1, num2 내용 불일치");

        if(n1.equals(n3)) System.out.println("num1, num3 내용 동일");
        else System.out.println("num1, num3 내용 불일치");
    }
}
