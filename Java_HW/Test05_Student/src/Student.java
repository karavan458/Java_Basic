public class Student {
    String name;
    int koreanScore;
    int mathScore;
    int englishScore;

    void setName(String name){
        this.name = name;
    }

    void setKoreanScore(int koreanScore){
        this.koreanScore = koreanScore;
    }

    void setMathScore(int mathScore){
        this.mathScore = mathScore;
    }

    void setEnglishScore(int englishScore){
        this.englishScore = englishScore;
    }

    int getKoreanScore() {
        return koreanScore;
    }

    int getMathScore() {
        return mathScore;
    }

    int getEnglishScore() {
        return englishScore;
    }

    int allScore() {
        return koreanScore + mathScore + englishScore;
    }
}
