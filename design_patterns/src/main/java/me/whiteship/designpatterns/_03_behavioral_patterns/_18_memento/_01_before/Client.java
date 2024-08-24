package me.whiteship.designpatterns._03_behavioral_patterns._18_memento._01_before;

public class Client {

    public static void main(String[] args) {
        Game game = new Game();
        game.setRedTeamScore(10);
        game.setBlueTeamScore(20);

        /**
         * 디테일한 내부 정보가 Client 가 알아야 한다는게 문제다!!! 결합도를 낮추기 위해 Memento 패턴을 활용한다.
         */
        int blueTeamScore = game.getBlueTeamScore();
        int redTeamScore = game.getRedTeamScore();

        Game restoredGame = new Game();
        restoredGame.setBlueTeamScore(blueTeamScore);
        restoredGame.setRedTeamScore(redTeamScore);
    }
}
