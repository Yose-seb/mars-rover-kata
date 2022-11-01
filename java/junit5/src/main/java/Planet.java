import java.util.Set;

public class Planet {
    private String name;

    private int maxX;

    private int maxY;

    private Set<Obstacle> obstacles;

    Planet(
        String name,
        int maxX,
        int maxY,
        Set<Obstacle> obstacles
    ) {
        this.name = name;
        this.maxX = maxX;
        this.maxY = maxY;
        this.obstacles = obstacles;
    }

    public String getName() {
        return name;
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMaxY() {
        return maxY;
    }

    public Set<Obstacle> getObstacles() {
        return obstacles;
    }

    public void checkIfCoordinatesIsAvailable(Coordinates coordinates)
        throws ObstacleEncounteredException {

        var obstacle = getObstacles()
            .stream()
            .filter(o -> o.getPosition().equals(coordinates))
            .findFirst()
            .orElse(null);

        if (obstacle != null) {
            throw new ObstacleEncounteredException(obstacle);
        }
    }

    @Override
    public String toString() {
        return "Planet{" +
               "name='" + name + '\'' +
               ", maxX=" + maxX +
               ", maxY=" + maxY +
               ", obstacles=" + obstacles +
               '}';
    }
}
