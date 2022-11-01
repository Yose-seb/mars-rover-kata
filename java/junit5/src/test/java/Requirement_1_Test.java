import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Requirement_1_Test extends AbstractTest {

    @Test
    void req1_checkRoverInitialisation() {
        assertThat(this.rover.getName()).isEqualTo(ROVER_NAME);
        assertThat(this.rover.getPosition()).isEqualTo(new Coordinates(ROVER_INIT_POSITION_X, ROVER_INIT_POSITION_Y));
        assertThat(this.rover.getDirection()).isEqualTo(ROVER_INIT_DIRECTION_ENUM);
    }

    @Test
    void req1_checkPlanetInitialisation() {
        assertThat(this.planet.getName()).isEqualTo(PLANET_NAME);
        assertThat(this.planet.getMaxX()).isEqualTo(PLANET_MAX_X);
        assertThat(this.planet.getMaxY()).isEqualTo(PLANET_MAX_Y);
    }
}
