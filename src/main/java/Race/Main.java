package Race;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception{
        ArrayList<RaceElements> raceElements = new ArrayList<>();
        raceElements.add(new RunningLane("дистанция1", 100));
        raceElements.add(new Wall("стена1", 1));
        raceElements.add(new RunningLane("дистанция2", 200));
        raceElements.add(new Wall("стена2", 2));
        raceElements.add(new RunningLane("дистанция3", 300));
        raceElements.add(new Wall("стена3", 3));
        System.out.println("Полоса препятствий состоит из: " + raceElements);

        ArrayList<RaceMembers> raceMembers = new ArrayList<>();
        raceMembers.add(new Robot("robo1"));
        raceMembers.add(new Robot("robo2"));
        raceMembers.add(new Cat("Барсик", 200, 1));
        raceMembers.add(new Cat("Мурзик", 250, 3));
        raceMembers.add(new Human("Bob", 150, 2));
        raceMembers.add(new Human("John", 300, 3));
        raceMembers.add(new Human("Bill", 350, 4));
        System.out.println("В забеге участвуют: " + raceMembers);

        for (int j = 0; j < raceMembers.size(); j++) {
            for (int i = 0; i < raceElements.size(); i++) {
                if(raceElements.get(i).getTtype()){
                    if(!raceMembers.get(j).run(raceElements.get(i).getInfo())){
                        raceMembers.remove(raceMembers.get(j));
                        j--;
                    }
                }
                if(!raceElements.get(i).getTtype()){
                    if(!raceMembers.get(j).jump(raceElements.get(i).getInfo())){
                        raceMembers.remove(raceMembers.get(j));
                        j--;
                    }
                }
            }
        }
        System.out.println("до финиша дошли: " + raceMembers);
    }
}
