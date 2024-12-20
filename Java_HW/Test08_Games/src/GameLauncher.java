// 메인 클래스: 프로그램 시작점
public class GameLauncher {
    public static void main(String[] args) {
        // 게임 객체 배열 생성
        Game[] games = {
                new OddEvenGame(),
                new RockPaperScissorsGame(),
                new DiceGuessGame()
        };

        // 게임 통계 객체 생성
        GameStats stats = new GameStats();

        // 게임 루프 시작
        GameUtils.startGameLoop(games, stats);
    }
}