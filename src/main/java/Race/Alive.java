package Race;

public abstract class Alive extends RaceMembers {
    public static int countAlive;
    public int maxDistance;
    public int maxHeight;

    public Alive(String name) {
        super(name);
        countAlive++;
    }

    @Override
    public abstract boolean run(int distance);

    @Override
    public abstract boolean jump(int height);
}
