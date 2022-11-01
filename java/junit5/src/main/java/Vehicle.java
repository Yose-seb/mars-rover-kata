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
    )
        throws ObstacleEncounteredException {

        // Check
        planet.checkIfCoordinatesIsAvailable(position);

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

    public void setDirection(DirectionEnum direction) {
        this.direction = direction;
    }

    public String getName() {
        return name;
    }

    public Planet getPlanet() {
        return planet;
    }

    public boolean executeCommand(Character[] commands)
        throws ObstacleEncounteredException {

        for (var c : commands) {
            CommandEnum command = CommandEnum.getCommand(c);

            switch (command) {
                case FORWARD -> executeCommandForward();
                case BACKWARD -> executeCommandBackward();
                case LEFT -> executeCommandLeft();
                case RIGHT -> executeCommandRight();
            }
        }

        return true;
    }

    private void executeCommandForward()
        throws ObstacleEncounteredException {
        this.position.forward(this);
    }

    private void executeCommandBackward()
        throws ObstacleEncounteredException {
        this.position.backward(this);
    }

    private void executeCommandRight() {
        this.position.right(this);
    }

    private void executeCommandLeft() {
        this.position.left(this);
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
