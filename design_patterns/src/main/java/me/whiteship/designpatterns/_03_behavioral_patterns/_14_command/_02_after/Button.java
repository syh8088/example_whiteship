package me.whiteship.designpatterns._03_behavioral_patterns._14_command._02_after;

import me.whiteship.designpatterns._03_behavioral_patterns._14_command._01_before.Game;
import me.whiteship.designpatterns._03_behavioral_patterns._14_command._01_before.Light;

import java.util.Stack;

/**
 * 호출자(invoker)
 *
 * 요청을 캡슐화 하여 호출자(invoker)와 수신자(receiver)를 분리하는 패턴.
 * • 요청을 처리하는 방법이 바뀌더라도, 호출자의 코드는 변경되지 않는다.
 */
public class Button {

    private Stack<Command> commands = new Stack<>();

    public void press(Command command) {
        command.execute();
        commands.push(command);
    }

    public void undo() {
        if (!commands.isEmpty()) {
            Command command = commands.pop();
            command.undo();
        }
    }

    public static void main(String[] args) {
        Button button = new Button();
        button.press(new GameStartCommand(new Game()));
        button.press(new LightOnCommand(new Light()));
        button.undo();
        button.undo();
    }

}
