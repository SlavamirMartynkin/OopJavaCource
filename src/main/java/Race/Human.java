package Race;

public class Human extends Alive{
    int humanCount;
    int maxDistance;
    int maxHeight;

    public Human(String name, int maxDistance, int maxHeight) {
        super(name);
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
        humanCount++;
    }
    @Override
    public boolean run(int distance) {
        if (distance < maxDistance) {
            System.out.println("Человек " + name + " пробежал дистанцию" + distance + " м");
            return true;
        } else {
            System.out.println("Человек " + name + " выбыл из соревнований");
        }
        return false;
    }

    @Override
    public boolean jump(int height) {
        if (height < maxHeight) {
            System.out.println("Человек " + name + " перепрыгнул препятствие в " + height + " м");
            return true;
        } else {
            System.out.println("Человек " + name + " выбыл из соревнований");
        }
        return false;
    }
}
