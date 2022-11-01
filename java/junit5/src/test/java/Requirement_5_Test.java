import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Requirement_5_Test extends AbstractTest {

    @Test
    void req5_checkPlanetEdge_1()
        throws ObstacleEncounteredException {
        Character[] commands = new Character[] {'f', 'f', 'f'};
        this.rover.executeCommand(commands);

        assertThat(this.rover.getPosition())
            .isEqualTo(new Coordinates((ROVER_INIT_POSITION_X + commands.length) % PLANET_MAX_X, ROVER_INIT_POSITION_Y));
    }

    @Test
    void req5_checkPlanetEdge_2()
        throws ObstacleEncounteredException {
        Character[] commands = new Character[] {'b', 'b', 'b'};
        this.rover.executeCommand(commands);

        assertThat(this.rover.getPosition())
            .isEqualTo(new Coordinates(3, ROVER_INIT_POSITION_Y));
    }
}