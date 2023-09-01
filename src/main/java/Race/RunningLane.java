package Race;

public class RunningLane extends RaceElements {
    int distance;
    boolean run;

    public RunningLane(String name, int distance) {
        super(name);
        this.distance = distance;
    }

    @Override
    public int getInfo() {
        return distance;
    }

    public String toString() {
        return name + " (" + distance + "м)";
    }

    @Override
    public boolean getTtype() {
        return true;
    }
}
