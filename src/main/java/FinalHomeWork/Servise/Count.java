package FinalHomeWork.Servise;

public class Count {
    private int count;

    public Count() {
        this.count = 0;
    }
    public void addCount() {
        count++;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Count{" +
                "count=" + count +
                '}';
    }
}
