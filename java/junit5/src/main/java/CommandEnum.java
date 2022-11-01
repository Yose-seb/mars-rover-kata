import java.util.Arrays;

public enum CommandEnum {

    FORWARD('f'),

    BACKWARD('b'),

    LEFT('l'),

    RIGHT('r');

    private char value;

    CommandEnum(char c) {
        this.value = c;
    }

    public static CommandEnum getCommand(char c) {
        return Arrays.stream(values())
            .filter(command -> command.value == c)
            .findFirst()
            .orElseThrow();
    }
}
