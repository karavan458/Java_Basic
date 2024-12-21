import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //우리한테 가위바위보를 만들기위한 변수가 뭘까?
        /*
        1. 스캐너가 필요 (o)_
        2. 랜덤이 필요 (0)
        3. 컴퓨터의 가위... 값을 저장할 변수(0)
        4. 내가 쓸변수(0)
        5. 결과를 저장할 변수가 필요해 (0)
         */

        //우리가 가위바위보를 만들기위한 로직이 뭘까?
        /*
        1. 랜덤크래스의 메서드를 통해 컴류터가 정할 ㄱ값을 구하는(0)
        2. 나의 값을 받을수 있는 기능(0)
        3. 1, 2번을 통해 얻은 값을 바탕으로 결과를 구하는 기능 -> 비즈니스 로직 - > 세부구현
        - 연산을 해야함 (데이터 타입을 일치) (0)
        - 연산을 진행해서 나오는 결과값을 분기로 정해 분기에 따른 결과값을 다르게 출력한다.
         */
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int a = 0;
        int computer = rand.nextInt(3) + 1;
        String me = null;

        System.out.print("computer : "); //프롬프트

        me = sc.nextLine();

        if(me.equals("주먹")) a = 1;
        else if(me.equals("가위")) a = 2;
        else if(me.equals("보")) a = 3;

        int result =  a - comupter;

        if(result == -1 || result == 2) System.out.println("your wins!");
        else if(result == 1 || result == -2) System.out.println("you lose!");
        else if(result == 0) System.out.println("draw");
    }
}
