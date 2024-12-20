import java.util.Scanner;

public class Cal {
    static void add(int a, int b) {
        System.out.printf("%d + %d = %d\n", a, b, a + b);
    }

    static void sub(int a, int b) {
        System.out.printf("%d - %d = %d\n", a, b, a - b);
    }

    static void mul(int a, int b) {
        System.out.printf("%d * %d = %d\n", a, b, a * b);
    }

    static void div(int a, int b) {
        System.out.printf("%d / %d = %d\n", a, b, a / b);
    }

    static void add(double a, double b) {
        System.out.printf("%f + %f = %f\n", a, b, a + b);
    }

    static void sub(double a, double b) {
        System.out.printf("%f - %f = %f\n", a, b, a - b);
    }

    static void mul(double a, double b) {
        System.out.printf("%f * %f = %f\n", a, b, a * b);
    }

    static void div(double a, double b) {
        System.out.printf("%f / %f = %f\n", a, b, a / b);
    }

    static int showMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("======================");
        System.out.println("계산기 프로그램");
        System.out.println("======================");

        System.out.println("메뉴를 선택하세요");
        System.out.println("1. 더하기 연산");
        System.out.println("2. 빼기 연산");
        System.out.println("3. 곱하기 연산");
        System.out.println("4. 나누기 연산");
        System.out.println("0. 프로그램 종료");
        System.out.print("메뉴 입력 : ");

        int menu = sc.nextInt();

        return menu;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        do {

            int op1 = 0;
            int op2 = 0;

            int m = showMenu();
            switch (m) {
                case 1:
                    System.out.println("더하기 연산을 위한 두수를 입력해주세요");
                    System.out.print("입력 : ");
                    op1 = scan.nextInt();
                    op2 = scan.nextInt();
                    add(op1, op2);
                    break;

                case 2:
                    System.out.println("빼기 연산을 위한 두수를 입력해주세요");
                    System.out.print("입력 : ");
                    op1 = scan.nextInt();
                    op2 = scan.nextInt();
                    sub(op1, op2);
                    break;
                case 3 :
                    System.out.println("곱하기 연산을 위한 두수를 입력해주세요");
                    System.out.print("입력 : ");
                    op1 = scan.nextInt();
                    op2 = scan.nextInt();
                    mul(op1, op2);
                    break;
                case 4 :
                    System.out.println("곱하기 연산을 위한 두수를 입력해주세요");
                    System.out.print("입력 : ");
                    op1 = scan.nextInt();
                    op2 = scan.nextInt();
                    div(op1, op2);
                    break;
                case 0 :
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
            }
        } while (true);
    }
}
