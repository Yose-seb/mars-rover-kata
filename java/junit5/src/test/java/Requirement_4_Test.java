import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Requirement_4_Test extends AbstractTest {

    @Test
    void req4_checkLeftCommand_1()
        throws ObstacleEncounteredException {
        Character[] commands = new Character[] {'l'};
        this.rover.executeCommand(commands);

        assertThat(this.rover.getDirection())
            .isEqualTo(DirectionEnum.NORTH);
        assertThat(this.rover.getPosition())
            .isEqualTo(new Coordinates(ROVER_INIT_POSITION_X, ROVER_INIT_POSITION_Y));
    }

    @Test
    void req4_checkRightCommand_1()
        throws ObstacleEncounteredException {
        Character[] commands = new Character[] {'r'};
        this.rover.executeCommand(commands);

        assertThat(this.rover.getDirection())
            .isEqualTo(DirectionEnum.SOUTH);
        assertThat(this.rover.getPosition())
            .isEqualTo(new Coordinates(ROVER_INIT_POSITION_X, ROVER_INIT_POSITION_Y));
    }

    @Test
    void req4_checkLeftRigntCommand_1()
        throws ObstacleEncounteredException {
        Character[] commands = new Character[] {'l', 'r'};
        this.rover.executeCommand(commands);

        assertThat(this.rover.getDirection())
            .isEqualTo(ROVER_INIT_DIRECTION_ENUM);
        assertThat(this.rover.getPosition())
            .isEqualTo(new Coordinates(ROVER_INIT_POSITION_X, ROVER_INIT_POSITION_Y));
    }

    @Test
    void req4_RoundInCircles_1()
        throws ObstacleEncounteredException {
        Character[] commands = new Character[] {'r', 'r', 'r', 'r'};
        this.rover.executeCommand(commands);

        assertThat(this.rover.getDirection())
            .isEqualTo(ROVER_INIT_DIRECTION_ENUM);
        assertThat(this.rover.getPosition())
            .isEqualTo(new Coordinates(ROVER_INIT_POSITION_X, ROVER_INIT_POSITION_Y));
    }

    @Test
    void req4_RoundInCircles_2()
        throws ObstacleEncounteredException {
        Character[] commands = new Character[] {'l', 'l', 'l', 'l'};
        this.rover.executeCommand(commands);

        assertThat(this.rover.getDirection())
            .isEqualTo(ROVER_INIT_DIRECTION_ENUM);
        assertThat(this.rover.getPosition())
            .isEqualTo(new Coordinates(ROVER_INIT_POSITION_X, ROVER_INIT_POSITION_Y));
    }

}
