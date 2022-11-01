import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Requirement_3_Test extends AbstractTest {

    @Test
    void req3_checkCommand_forward()
        throws ObstacleEncounteredException {
        Character[] commands = new Character[] {'f'};
        this.rover.executeCommand(commands);

        assertThat(this.rover.getPosition())
            .isEqualTo(new Coordinates(ROVER_INIT_POSITION_X + 1, ROVER_INIT_POSITION_Y));
    }

    @Test
    void req3_checkCommand_backward()
        throws ObstacleEncounteredException {
        Character[] commands = new Character[] {'b'};
        this.rover.executeCommand(commands);

        assertThat(this.rover.getPosition())
            .isEqualTo(new Coordinates(ROVER_INIT_POSITION_X - 1, ROVER_INIT_POSITION_Y));
    }

    @Test
    void req3_checkArrayCommands_forward_backward()
        throws ObstacleEncounteredException {
        Character[] commands = new Character[] {'f', 'b'};
        this.rover.executeCommand(commands);

        assertThat(this.rover.getPosition())
            .isEqualTo(new Coordinates(ROVER_INIT_POSITION_X, ROVER_INIT_POSITION_Y));
    }

    @Test
    void req3_checkCommand_fail() {
        Character[] commands = new Character[] {'a'};
        assertThrows(NoSuchElementException.class, () -> this.rover.executeCommand(commands));
    }
}
