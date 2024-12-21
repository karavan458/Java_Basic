/*
작성자 : 정훈찬
작성일자 : 2024-12-11
사용 프로그렘 : openJDK 21, intelliJ IDE
프로그램 목적 : 로또 프로그램
 */

import java.util.Random;
import java.util.Scanner;

public class Main {
    static void buyLotto(Scanner scan) {
        int price = 1000;
        int money = 0; //내가 낸 돈
        int count = 0;
        int change = 0;

        System.out.println();
        System.out.println("Lotto 구입 시작");
        System.out.println("(1000원에 로또번호 하나입니다.)");
        System.out.print("금액 입력 : ");

        money = scan.nextInt();

        if (money < price) {
            System.out.println("금액이 부족합니다. 최소 1000원 이상 입력해주세요.");
            return;
        }

        System.out.println();

        count = money / price;
        change = money % price;

        System.out.println("행운의 로또번호는 아래와 같습니다.");
        for (int i = 1; i <= count; i++) {
            System.out.print("로또번호" + i + " : ");
            int[] lottoNum = generateLotto();

            for (int j = 0; j < lottoNum.length; j++) {
                System.out.print(lottoNum[j]);
                if (j < lottoNum.length - 1) System.out.print(", ");
            }

            System.out.println();
        }

        System.out.println();
        System.out.printf("받은 금액은 %d원이고 거스름돈은 %d원입니다.\n", money, change);
    }

    static int[] generateLotto() {
        Random ran = new Random();
        int[] ranNum = new int[45];
        int[] lottoNum = new int[6];

        for (int i = 0; i < ranNum.length; i++) ranNum[i] = i + 1;
        for (int i = 0; i < lottoNum.length; i++) {
            int k = ran.nextInt(45 - i);
            lottoNum[i] = ranNum[k];
            ranNum[k] = ranNum[44 - i];
        }

        sortArray(lottoNum);
        return lottoNum;
    }

    static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("==========================");
            System.out.println("       Lotto 프로그램");
            System.out.println("--------------------------");
            System.out.println(" 1. Lotto 구입");
            System.out.println(" 2. 프로그램 종료");
            System.out.println("==========================");
            System.out.print("메뉴 선택 : ");
            int m = sc.nextInt();

            switch (m) {
                case 1:
                    buyLotto(sc);
                    break;
                case 2:
                    System.out.println("감사합니다");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        } while (true);
    }
}