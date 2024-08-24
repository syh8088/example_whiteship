package me.whiteship.designpatterns._03_behavioral_patterns._18_memento._02_after;

/**
 * Originator
 * - 본래의 상태 정보를 저장하고 복원 하고 싶어하는 데이터
 */
public class Game {

    private int redTeamScore;

    private int blueTeamScore;

    public int getRedTeamScore() {
        return redTeamScore;
    }

    public void setRedTeamScore(int redTeamScore) {
        this.redTeamScore = redTeamScore;
    }

    public int getBlueTeamScore() {
        return blueTeamScore;
    }

    public void setBlueTeamScore(int blueTeamScore) {
        this.blueTeamScore = blueTeamScore;
    }

    /**
     * Originator 의 내부정보를 Memento 이라는 클래스로 추상화 해서 전달
     * @return
     */
    public GameSave save() {
        return new GameSave(this.blueTeamScore, this.redTeamScore);
    }

    /**
     * 외부에서 전달 받은 Memento 정보를 가지고 자신의 정보를 복원 하는 역활
     * @param gameSave
     */
    public void restore(GameSave gameSave) {
        this.blueTeamScore = gameSave.getBlueTeamScore();
        this.redTeamScore = gameSave.getRedTeamScore();
    }

}
