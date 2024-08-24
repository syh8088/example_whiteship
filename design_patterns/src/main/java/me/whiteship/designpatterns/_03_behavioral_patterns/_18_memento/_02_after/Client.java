package me.whiteship.designpatterns._03_behavioral_patterns._18_memento._02_after;

/**
 * CareTaker
 * - Originator 의 내부 정보를 CareTaker 가 가져와서 저장 및 복원하는 Client 역활
 *
 * - CareTaker 가 Originator 의 디테일 한 상태정보를 가지고 있는게 아니라 Originator 의 내부정보를 Memento 이라는 타입으로 가지고 있는다.
 */
public class Client {

    public static void main(String[] args) {
        Game game = new Game();
        game.setBlueTeamScore(10);
        game.setRedTeamScore(20);

        GameSave save = game.save();

        game.setBlueTeamScore(12);
        game.setRedTeamScore(22);

        game.restore(save);

        System.out.println(game.getBlueTeamScore());
        System.out.println(game.getRedTeamScore());
    }
}
