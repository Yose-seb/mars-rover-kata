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
        DirectionEnum direction,
        int maxX,
        int maxY
    ) {
        switch (direction) {
            case EST -> x = x + 1;
            case WEST -> x = x - 1;
            case SOUTH -> y = y + 1;
            case NORTH -> y = y - 1;
        }

        cleanValues(maxX, maxY);
    }

    public void backward(
        DirectionEnum direction,
        int maxX,
        int maxY
    ) {
        switch (direction) {
            case EST -> x = x - 1;
            case WEST -> x = x + 1;
            case SOUTH -> y = y - 1;
            case NORTH -> y = y + 1;
        }

        cleanValues(maxX, maxY);
    }

    private void cleanValues(
        int maxX,
        int maxY
    ) {
        if (x <= 0) {
            x = maxX;
        } else if (x > maxX) {
            x = 1;
        } else if (y <= 0) {
            y = maxY;
        } else if (y > maxY) {
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
