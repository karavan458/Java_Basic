import java.util.Random;

// 주사위 숫자 맞추기 게임 클래스
public class DiceGuessGame implements Game {
    public String getName() {
        return "주사위 숫자 맞추기 게임"; // 게임 이름 반환
    }

    public String getDescription() {
        return "1에서 6 사이의 숫자를 맞추는 게임입니다."; // 게임 설명 반환
    }

    public void play(GameStats stats) {
        // 주사위 숫자를 랜덤으로 생성
        int diceNumber = new Random().nextInt(6) + 1;
        // 사용자로부터 입력을 받음
        int userGuess = GameUtils.getUserInput("숫자를 입력하세요 (1 ~ 6): ", 6);

        // 결과 출력
        System.out.printf("주사위의 숫자: %d\n", diceNumber);
        if (userGuess == diceNumber) {
            System.out.println("결과: 정답, 당신이 이겼습니다!");
            stats.recordWin(); // 승리 기록
        } else {
            System.out.println("결과: 틀렸습니다!");
            stats.recordLoss(); // 패배 기록
        }
    }
}