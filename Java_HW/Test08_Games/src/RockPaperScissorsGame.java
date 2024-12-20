import java.util.Random;

// 가위바위보 게임 클래스
public class RockPaperScissorsGame implements Game {
    public String getName() {
        return "가위바위보 게임"; // 게임 이름 반환
    }

    public String getDescription() {
        return "가위, 바위, 보 중 하나를 선택하여 컴퓨터와 대결합니다."; // 게임 설명 반환
    }

    public void play(GameStats stats) {
        // 가위, 바위, 보 옵션 정의
        String[] choices = {"가위", "바위", "보"};
        // 사용자와 컴퓨터의 선택
        int userChoice = GameUtils.getUserInput("선택하세요 (0: 가위, 1: 바위, 2: 보): ", 3);
        int computerChoice = new Random().nextInt(3);

        // 결과 출력
        System.out.printf("당신의 선택: %s\n컴퓨터의 선택: %s\n", choices[userChoice], choices[computerChoice]);
        if (userChoice == computerChoice) {
            System.out.println("결과: 무승부");
        } else if ((userChoice - computerChoice + 3) % 3 == 1) {
            System.out.println("결과: 당신이 이겼습니다!");
            stats.recordWin(); // 승리 기록
        } else {
            System.out.println("결과: 당신이 졌습니다!");
            stats.recordLoss(); // 패배 기록
        }
    }
}