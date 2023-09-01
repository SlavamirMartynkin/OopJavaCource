package Race;

public abstract class RaceMembers {
    String name;
    public static int count;

    public RaceMembers(String name) {
        this.name = name;
        count++;
    }

    protected RaceMembers() {
    }

    public abstract boolean run(int distance);

    public abstract boolean jump(int height);
    @Override
    public String toString() {
        return name;
    }
}
