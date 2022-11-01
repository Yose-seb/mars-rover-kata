import java.util.Objects;

public class Coordinates {

    private int x;

    private int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void forward(
        Vehicle vehicle
    )
        throws ObstacleEncounteredException {

        Coordinates newCoordinates = null;

        switch (vehicle.getDirection()) {
            case EST -> newCoordinates = new Coordinates(x + 1, y);
            case WEST -> newCoordinates = new Coordinates(x - 1, y);
            case SOUTH -> newCoordinates = new Coordinates(x, y + 1);
            case NORTH -> newCoordinates = new Coordinates(x, y - 1);
        }

        newCoordinates.adaptCoordinatesToPlanet(vehicle.getPlanet());

        vehicle.getPlanet().checkIfCoordinatesIsAvailable(newCoordinates);

        x = newCoordinates.x;
        y = newCoordinates.y;
    }

    public void backward(
        Vehicle vehicle
    )
        throws ObstacleEncounteredException {

        Coordinates newCoordinates = null;

        switch (vehicle.getDirection()) {
            case EST -> newCoordinates = new Coordinates(x - 1, y);
            case WEST -> newCoordinates = new Coordinates(x + 1, y);
            case SOUTH -> newCoordinates = new Coordinates(x, y - 1);
            case NORTH -> newCoordinates = new Coordinates(x, y + 1);
        }

        newCoordinates.adaptCoordinatesToPlanet(vehicle.getPlanet());

        vehicle.getPlanet().checkIfCoordinatesIsAvailable(newCoordinates);

        x = newCoordinates.x;
        y = newCoordinates.y;
    }

    public void left(
        Vehicle vehicle
    ) {
        switch (vehicle.getDirection()) {
            case EST -> vehicle.setDirection(DirectionEnum.NORTH);
            case WEST -> vehicle.setDirection(DirectionEnum.SOUTH);
            case SOUTH -> vehicle.setDirection(DirectionEnum.EST);
            case NORTH -> vehicle.setDirection(DirectionEnum.WEST);
        }
    }

    public void right(
        Vehicle vehicle
    ) {
        switch (vehicle.getDirection()) {
            case EST -> vehicle.setDirection(DirectionEnum.SOUTH);
            case WEST -> vehicle.setDirection(DirectionEnum.NORTH);
            case SOUTH -> vehicle.setDirection(DirectionEnum.WEST);
            case NORTH -> vehicle.setDirection(DirectionEnum.EST);
        }
    }

    private void adaptCoordinatesToPlanet(
        Planet planet
    ) {
        if (x <= 0) {
            x = planet.getMaxX();
        } else if (x > planet.getMaxX()) {
            x = 1;
        } else if (y <= 0) {
            y = planet.getMaxY();
        } else if (y > planet.getMaxY()) {
            y = 1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Coordinates that = (Coordinates) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Coordinates{" +
               "x=" + x +
               ", y=" + y +
               '}';
    }
}
