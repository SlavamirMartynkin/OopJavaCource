package FinalHomeWork.Servise;

import FinalHomeWork.Models.Animals;

import java.util.List;

public class CommandsShow implements CommandsShowing{
    @Override
    public void showAnimalCommands(String name, List<Animals> animals) {
        for (Animals animal : animals){
            if (animal.toString().contains(name)) {
                System.out.println(animal.getCommands());
            }
        }
    }
}
