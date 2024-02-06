package FinalHomeWork.Servise;

import FinalHomeWork.Models.Animals;

import java.util.List;

public class AddCommand implements AddingCommands{
    @Override
    public void addComand(String name, String command, List<Animals> animals) {
        for (Animals animal : animals) {
            if(animal.toString().contains(name)){
               animal.getCommands().add(command);
                System.out.println(animal.getCommands());
            }
        }

    }
}
