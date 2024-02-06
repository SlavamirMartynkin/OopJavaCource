package FinalHomeWork.Servise;

import FinalHomeWork.Models.Animals;

import java.util.List;

public class AllAnimalsShow implements AllAnimalsShowing{
    @Override
    public void showAnimals(List<Animals> animalsList) {
        for (Animals animals: animalsList) {
            System.out.println(animals.toString());
        }
    }
}
