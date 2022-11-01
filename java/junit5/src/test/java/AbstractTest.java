import org.junit.jupiter.api.BeforeEach;

import java.util.HashSet;

public abstract class AbstractTest {

    protected final String PLANET_NAME = "March";

    protected final int PLANET_MAX_X = 4;

    protected final int PLANET_MAX_Y = 4;

    protected final int ROVER_INIT_POSITION_X = 2;

    protected final int ROVER_INIT_POSITION_Y = 3;

    protected final String ROVER_NAME = "Rover";

    protected final DirectionEnum ROVER_INIT_DIRECTION_ENUM = DirectionEnum.EST;

    protected final Obstacle OBSTACLE_1 = new Obstacle(new Coordinates(2, 2));

    protected final Obstacle OBSTACLE_2 = new Obstacle(new Coordinates(4, 4));

    protected Vehicle rover;

    protected Planet planet;

    @BeforeEach
    void init()
        throws ObstacleEncounteredException {
        var obstacles = new HashSet<Obstacle>();
        obstacles.add(OBSTACLE_1);
        obstacles.add(OBSTACLE_2);

        this.planet = new Planet(
            PLANET_NAME,
            PLANET_MAX_X,
            PLANET_MAX_Y,
            obstacles
        );

        this.rover = new Vehicle(
            ROVER_NAME,
            new Coordinates(ROVER_INIT_POSITION_X, ROVER_INIT_POSITION_Y),
            ROVER_INIT_DIRECTION_ENUM,
            planet
        );
    }
}
