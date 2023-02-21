package sec02;

public class Ex03LongExample {
    public static void main(String[] args) {
        long var1 = 10;
        long var2 = 20L;
        //long var3 = 10000000000; 컴파일러는 L이 없으면 int로 간주함
        long var4 = 10000000000L;

        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var4 = " + var4);
    }
}
