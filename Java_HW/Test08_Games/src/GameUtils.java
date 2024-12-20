import java.util.Scanner;

// 유틸리티 클래스: 사용자 입력 및 공통 기능 제공
public class GameUtils {
    // 사용자 입력을 받아 특정 범위에서 유효성을 검사
    public static int getUserInput(String prompt, int range) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        int input;
        while (true) {
            input = scanner.nextInt();
            if (input > 0 && input <= range) break; // 범위 내 입력 확인
            System.out.print("잘못된 입력입니다. 다시 입력하세요: ");
        }
        return input;
    }

    // 사용 가능한 게임 목록 출력
    public static void displayGames(Game[] games) {
        System.out.println("\n=== 게임 목록 ===");
        for (int i = 0; i < games.length; i++) {
            System.out.printf("%d. %s - %s\n", i + 1, games[i].getName(), games[i].getDescription());
        }
    }

    // 게임 루프 실행 (반복적으로 게임을 플레이하고 종료 시 통계 출력)
    public static void startGameLoop(Game[] games, GameStats stats) {
        do {
            // 게임 목록 출력
            displayGames(games);
            // 사용자가 선택한 게임 실행
            int gameChoice = getUserInput("플레이할 게임을 선택하세요 (1 ~ " + games.length + "): ", games.length) - 1;
            games[gameChoice].play(stats); // 선택한 게임 실행

            // 현재 통계 출력
            stats.displayStats();
        } while (getUserInput("\n다른 게임을 하시겠습니까? (0: 아니오, 1: 예): ", 2) == 1);

        // 게임 종료 메시지 및 최종 통계 출력
        System.out.println("게임 종료!");
        stats.displayStats();
    }
}