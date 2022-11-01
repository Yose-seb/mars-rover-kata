import java.util.Objects;

public class Obstacle {

    private Coordinates position;

    Obstacle(Coordinates position) {
        this.position = position;
    }

    public Coordinates getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Obstacle obstacle = (Obstacle) o;
        return Objects.equals(position, obstacle.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

    @Override
    public String toString() {
        return "Obstacle{" +
               "position=" + position +
               '}';
    }
}
