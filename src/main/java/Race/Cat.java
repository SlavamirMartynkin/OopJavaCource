package Race;

public class Cat extends Alive {
    int catCount;
    int maxDistance;
    int maxHeight;
    public Cat(String name, int maxDistance, int maxHeight) {
        super(name);
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
        catCount++;
    }

    @Override
    public boolean run(int distance) {
        if (distance < maxDistance) {
            System.out.println("Кот " + name + " пробежал дистанцию" + distance + " м");
            return true;
        } else {
            System.out.println("Кот " + name + " выбыл из соревнований");
        }
        return false;
    }

    @Override
    public boolean jump(int height) {
        if (height < maxHeight) {
            System.out.println("Кот " + name + " перепрыгнул препятствие в " + height + " м");
            return true;
        } else {
            System.out.println("Кот " + name + " выбыл из соревнований");
        }
        return false;
    }
}
