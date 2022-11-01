public enum DirectionEnum {
    NORTH('n'),

    EST('e'),

    WEST('w'),

    SOUTH('s');

    private char value;

    DirectionEnum(char c) {
        this.value = c;
    }
}
