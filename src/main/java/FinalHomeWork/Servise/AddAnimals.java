package FinalHomeWork.Servise;

import FinalHomeWork.Models.Animals;

import java.util.List;

public class AddAnimals implements AddingAnimals{
    @Override
    public void addNewAnimal(Animals newAnimal, List<Animals> list) {
        list.add(newAnimal);
        for (Animals animals: list){
            System.out.println(animals);
        }
    }
}
