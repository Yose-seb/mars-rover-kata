public class ObstacleEncounteredException extends Exception {

    private Obstacle obstacle;

    ObstacleEncounteredException(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    @Override
    public String getMessage() {
        return "Obstacle " + obstacle.toString() + " avoided";
    }
}
