package chapter04.sec06;

import java.util.Scanner;

public class Ex01DoWhileExample {
    public static void main(String[] args) {
        System.out.println("메시지를 입력해주십시오.");
        System.out.println("프로그램을 종료하시려면 q를 입력해주십시오.");

        Scanner scanner = new Scanner(System.in);
        String inputString;

        do {
            System.out.print(">");
            inputString = scanner.nextLine();
            System.out.println(inputString);
        }
        while (!inputString.equals("q"));

        System.out.println();
        System.out.println("프로그램 종료");
    }
}
