package Race;

public class Robot extends RaceMembers {
    public static int countRobot;
    public static final int  maxDistance = 1000;
    public static final int  maxHeight = 4;

    public Robot(String name) {
        super(name);
        countRobot++;
    }

    @Override
    public boolean run(int distance) {
        if (distance < maxDistance) {
            System.out.println("Робот " + name + " пробежал дистанцию " + distance + " м");
            return true;
        } else {
            System.out.println("Робот " +name + " выбыл из соревнований");
            return false;
        }
    }
    @Override
    public boolean jump(int height) {
        if(height < maxHeight) {
            System.out.println("Робот " +name + " перепрыгнул препятствие в " + height + " м");
            return true;
        }else{
            System.out.println("Робот " +name + " выбыл из соревнований");
            return false;
        }

    }
}
