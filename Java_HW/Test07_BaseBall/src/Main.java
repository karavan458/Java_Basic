import java.util.Random;
import java.util.Scanner;

class Main {
    public static int[] generateBaseNum(int size) {
        int[] ranNum = new int[9];
        int[] baseNum = new int[size];
        Random rand = new Random();

        for (int i = 0; i < ranNum.length; i++) ranNum[i] = (i + 1);
        for (int i = 0; i < baseNum.length; i++) {
            int r = rand.nextInt(9 - i);
            baseNum[i] = ranNum[r];
            ranNum[r] = ranNum[8 - i];
        }
        return baseNum;
    }

    public static int[] generateMyNum(Scanner sc, int size) {
        int[] num = new int[size];
        System.out.print("Enter num: ");

        for (int i = 0; i < num.length; i++) num[i] = sc.nextInt();
        System.out.println("--------------------");
        return num;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int strike;
        int ball;
        int count = 0;
        int[] comNum = generateBaseNum(3);


        do {
            ball = 0;
            strike = 0;
            int[] myNum = generateMyNum(sc, 3);
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (myNum[i] == comNum[j]) {
                        if (i == j) strike++;
                        else ball++;
                    }
                }
            }
            count++;
            System.out.printf("Ball: %d\nStrike: %d\n", ball, strike);
            System.out.printf("count = %d\n", count);
        } while (strike != 3);

        sc.close();
    }
}