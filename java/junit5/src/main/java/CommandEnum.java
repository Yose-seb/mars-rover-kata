import java.util.Arrays;

public enum CommandEnum {

    FORWARD('f'),

    BACKWARD('b');

    private char value;

    CommandEnum(char c){
        this.value = c;
    }

    public static CommandEnum getCommand(char c){
        return Arrays.stream(values())
            .filter(command -> command.value == c)
            .findFirst()
            .orElseThrow();
    }
}
