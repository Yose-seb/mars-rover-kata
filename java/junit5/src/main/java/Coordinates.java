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
    ) {
        switch (vehicle.getDirection()) {
            case EST -> x = x + 1;
            case WEST -> x = x - 1;
            case SOUTH -> y = y + 1;
            case NORTH -> y = y - 1;
        }

        cleanValues(vehicle.getPlanet());
    }

    public void backward(
        Vehicle vehicle
    ) {
        switch (vehicle.getDirection()) {
            case EST -> x = x - 1;
            case WEST -> x = x + 1;
            case SOUTH -> y = y - 1;
            case NORTH -> y = y + 1;
        }

        cleanValues(vehicle.getPlanet());
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

    private void cleanValues(
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
