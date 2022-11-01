import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Requirement_6_Test extends AbstractTest {

    @Test
    void req6_moveToObstacle_1() {
        Character[] commands = new Character[] {'f', 'f', 'r', 'f'};

        var thrown = assertThrows(
            ObstacleEncounteredException.class,
            () -> rover.executeCommand(commands)
        );

        assertThat(thrown.getObstacle())
            .isEqualTo(OBSTACLE_2);

        assertThat(rover.getPosition())
            .isEqualTo(new Coordinates(4, 3));
    }

    @Test
    void req6_moveToObstacle_2() {
        Character[] commands = new Character[] {'l', 'f'};

        var thrown = assertThrows(
            ObstacleEncounteredException.class,
            () -> rover.executeCommand(commands)
        );

        assertThat(thrown.getObstacle())
            .isEqualTo(OBSTACLE_1);

        assertThat(rover.getPosition())
            .isEqualTo(new Coordinates(2, 3));
    }

}