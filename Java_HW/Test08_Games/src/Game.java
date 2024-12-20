 // Game 인터페이스: 모든 게임 클래스가 구현해야 할 메서드 정의
    public interface Game {
        String getName(); // 게임 이름 반환
        String getDescription(); // 게임 설명 반환
        void play(GameStats stats); // 게임 실행 (통계 업데이트 포함)
    }

