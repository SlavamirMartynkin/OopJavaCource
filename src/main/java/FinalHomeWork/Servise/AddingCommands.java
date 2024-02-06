package FinalHomeWork.Servise;

import FinalHomeWork.Models.Animals;

import java.util.List;

public interface AddingCommands {
    void addComand(String name, String command, List<Animals> animals);
}
