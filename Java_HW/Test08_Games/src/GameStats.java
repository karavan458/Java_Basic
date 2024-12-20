// 게임 통계 클래스: 총 게임 수 및 승리 수를 관리
public class GameStats {
    private int totalGames = 0; // 총 플레이된 게임 수
    private int wins = 0; // 사용자가 이긴 게임 수

    // 승리 기록
    public void recordWin() {
        totalGames++;
        wins++;
    }

    // 패배 기록
    public void recordLoss() {
        totalGames++;
    }

    // 현재 통계 출력
    public void displayStats() {
        System.out.println("\n=== 게임 통계 ===");
        System.out.printf("총 플레이한 게임 수: %d\n", totalGames);
        System.out.printf("승리한 게임 수: %d\n", wins);
        if (totalGames > 0) {
            double winRate = (double) wins / totalGames * 100;
            System.out.printf("승률: %.2f%%\n", winRate);
        } else {
            System.out.println("아직 플레이한 게임이 없습니다.");
        }
    }
}