import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class AbstractTest {

    protected final static String PLANET_NAME = "March";

    protected final static int PLANET_MAX_X = 4;

    protected final static int PLANET_MAX_Y = 4;

    protected final static int ROVER_INIT_POSITION_X = 2;

    protected final static int ROVER_INIT_POSITION_Y = 3;

    protected final static String ROVER_NAME = "Rover";

    protected final static DirectionEnum ROVER_INIT_DIRECTION_ENUM = DirectionEnum.EST;

    protected Vehicle rover;

    protected Planet planet;

    @BeforeEach
    void init() {
        this.planet = new Planet(
            PLANET_NAME,
            PLANET_MAX_X,
            PLANET_MAX_Y
        );

        this.rover = new Vehicle(
            ROVER_NAME,
            new Coordinates(ROVER_INIT_POSITION_X, ROVER_INIT_POSITION_Y),
            ROVER_INIT_DIRECTION_ENUM,
            planet
        );
    }

    @Test
    void fail() {
        assertThat("Test")
            .isEqualTo("Fail");
    }
}
