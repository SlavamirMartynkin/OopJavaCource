package Race;

public class Wall extends RaceElements {
    int height;

    @Override
    public int getInfo() {
        return height;
    }

    @Override
    public boolean getTtype() {
        return false;
    }


    public Wall(String name, int height) {
        super(name);
        this.height = height;
    }

    @Override
    public String toString() {
        return name + " (" + height + "м)";
    }
}

