import java.util.Random;

// 홀짝 게임 클래스
public class OddEvenGame implements Game {
    public String getName() {
        return "홀짝 게임"; // 게임 이름 반환
    }

    public String getDescription() {
        return "0 (짝수) 또는 1 (홀수)를 선택하여 컴퓨터와 대결합니다."; // 게임 설명 반환
    }

    public void play(GameStats stats) {
        // 사용자가 숫자를 입력하고, 컴퓨터는 랜덤으로 숫자를 선택
        int userChoice = GameUtils.getUserInput("숫자를 입력하세요 (0: 짝수, 1: 홀수): ", 2);
        int computerChoice = new Random().nextInt(2);

        // 결과 출력 및 통계 업데이트
        System.out.printf("컴퓨터의 숫자: %d\n", computerChoice);
        if ((userChoice + computerChoice) % 2 == 0) {
            System.out.println("결과: 짝수, 당신이 이겼습니다!");
            stats.recordWin(); // 승리 기록
        } else {
            System.out.println("결과: 홀수, 당신이 졌습니다!");
            stats.recordLoss(); // 패배 기록
        }
    }
}