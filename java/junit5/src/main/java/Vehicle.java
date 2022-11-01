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
        Arrays.asList(commands).forEach(c -> {
            CommandEnum command = CommandEnum.getCommand(c);

            switch (command) {
                case FORWARD -> executeCommandForward();
                case BACKWARD -> executeCommandBackward();
            }
        });
        return true;
    }

    private void executeCommandForward() {
        this.position.forward(direction, planet.getMaxX(), planet.getMaxY());
    }

    private void executeCommandBackward() {
        this.position.backward(direction, planet.getMaxX(), planet.getMaxY());
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
