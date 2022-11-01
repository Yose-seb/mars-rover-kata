public class Planet {
    private String name;

    private int maxX;

    private int maxY;

    Planet(
        String name,
        int maxX,
        int maxY
    ) {
        this.name = name;
        this.maxX = maxX;
        this.maxY = maxY;
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

    @Override
    public String toString() {
        return "Planet{" +
               "name='" + name + '\'' +
               ", maxX=" + maxX +
               ", maxY=" + maxY +
               '}';
    }
}
