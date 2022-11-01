import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Requirement_3_Test extends AbstractTest {

    @Test
    void req3_checkArrayCommands_f() {
        Character[] commands = new Character[] {'f'};
        this.rover.executeCommand(commands);

        assertThat(this.rover.getPosition())
            .isEqualTo(new Coordinates(ROVER_INIT_POSITION_X + 1, ROVER_INIT_POSITION_Y));
    }

    @Test
    void req3_checkArrayCommands_fff() {
        Character[] commands = new Character[] {'f', 'f', 'f'};
        this.rover.executeCommand(commands);

        assertThat(this.rover.getPosition())
            .isEqualTo(new Coordinates((ROVER_INIT_POSITION_X + 3) % PLANET_MAX_X, ROVER_INIT_POSITION_Y));
    }

    @Test
    void req3_checkArrayCommands_b() {
        Character[] commands = new Character[] {'b'};
        this.rover.executeCommand(commands);

        assertThat(this.rover.getPosition())
            .isEqualTo(new Coordinates(ROVER_INIT_POSITION_X - 1, ROVER_INIT_POSITION_Y));
    }

    @Test
    void req3_checkArrayCommands_bbb() {
        Character[] commands = new Character[] {'b', 'b', 'b'};
        this.rover.executeCommand(commands);

        assertThat(this.rover.getPosition())
            .isEqualTo(new Coordinates(3, ROVER_INIT_POSITION_Y));
    }

    @Test
    void req3_checkArrayCommands_fb() {
        Character[] commands = new Character[] {'f', 'b'};
        this.rover.executeCommand(commands);

        assertThat(this.rover.getPosition())
            .isEqualTo(new Coordinates(ROVER_INIT_POSITION_X, ROVER_INIT_POSITION_Y));
    }

    @Test
    void req3_checkArrayCommands_a_fail() {
        Character[] commands = new Character[] {'a'};
        assertThrows(NoSuchElementException.class, () -> this.rover.executeCommand(commands));
    }
}
