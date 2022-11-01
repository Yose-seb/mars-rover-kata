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
}
