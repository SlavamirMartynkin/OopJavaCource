package Race;

public abstract class RaceElements {
    String name;
    int elementCount;

    public RaceElements(String name) {
        this.name = name;
        elementCount++;
    }
    public abstract int getInfo();
    public abstract boolean getTtype();

}
