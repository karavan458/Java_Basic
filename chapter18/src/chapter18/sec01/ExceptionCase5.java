package chapter18.sec01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCase5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("a / b ... a? ");
            int a = sc.nextInt();
            System.out.print("a / b ... b? ");
            int b = sc.nextInt();
            System.out.printf("%d / %d = %d\n", a, b, a / b);
        }
        catch(ArithmeticException e) {
            e.getMessage();
        }
        catch(InputMismatchException e) {
            e.getMessage();
        }

        System.out.println("End of Program");
    }
}
