package me.whiteship.designpatterns._03_behavioral_patterns._18_memento._02_after;

/**
 * Memento
 *  - 내부 정보를 Memento 이라는 객체로 추상화 한다.
 *  - 불면 객체로 만든다.
 */
public final class GameSave {

    private final int blueTeamScore;

    private final int redTeamScore;

    public GameSave(int blueTeamScore, int redTeamScore) {
        this.blueTeamScore = blueTeamScore;
        this.redTeamScore = redTeamScore;
    }

    public int getBlueTeamScore() {
        return blueTeamScore;
    }

    public int getRedTeamScore() {
        return redTeamScore;
    }
}
