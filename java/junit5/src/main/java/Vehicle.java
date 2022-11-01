import java.util.Arrays;

public class Vehicle {

    private String name;

    private Coordinates position;

    private DirectionEnum direction;

    private Planet planet;

    public Vehicle(
        String name,
        Coordinates position,
        DirectionEnum direction,
        Planet planet
    ) {
        this.name = name;
        this.position = position;
        this.direction = direction;
        this.planet = planet;
    }

    public Coordinates getPosition() {
        return position;
    }

    public DirectionEnum getDirection() {
        return direction;
    }

    public String getName() {
        return name;
    }

    public boolean executeCommand(Character[] commands) {
        return true;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
               "name='" + name + '\'' +
               ", position=" + position +
               ", direction=" + direction +
               ", planet=" + planet +
               '}';
    }
}
