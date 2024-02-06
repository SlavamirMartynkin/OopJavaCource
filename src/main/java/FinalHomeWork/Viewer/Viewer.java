package FinalHomeWork.Viewer;

import FinalHomeWork.Models.Animals;
import FinalHomeWork.Models.PackAnimals;
import FinalHomeWork.Models.Pets;
import FinalHomeWork.Servise.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Viewer {
    List<Animals> petsList = new ArrayList<>();
    List<Animals> packAuimalList = new ArrayList<>();
    Count count = new Count();

    public void menu() throws Exception{
        System.out.println(
                "Меню системы учета питомника животных: \n"  +
                "1 - Показать список всех животных \n" +
                "2 - Добавить новое животное \n" +
                "3 - Обучить выбранное животное новой команде \n" +
                "4 - Показать команды выбранного животного \n" +
                "5 - показать количество животных в питомнике \n"

        );
        Scanner number = new Scanner(System.in);
        switch (number.nextLine()) {
            case "2" -> {
                System.out.println(
                        "Это домашнее или вьючное животное?\n" +
                        "1 - домашнее\n" +
                        "2 - вьючное"
                );
                Scanner animalType = new Scanner(System.in);
                switch (animalType.nextLine()) {
                    case "1" -> {
                        Scanner animal = new Scanner(System.in);
                        System.out.println("Введите название животного: \n");
                        String title = animal.nextLine();
                        System.out.println("Введите имя животного: \n");
                        String name = animal.nextLine();
                        System.out.println("Введите дату рождения животного: \n");
                        long date = animal.nextLong();
                        Pets pets = new Pets(title, name, date);
                        AddAnimals addAnimals= new AddAnimals();
                        addAnimals.addNewAnimal(pets, petsList);
                        count.addCount();
                        System.out.println("-----------------------------");
                        menu();
                    }
                    case "2" -> {
                        Scanner animal = new Scanner(System.in);
                        System.out.println("Введите название животного: \n");
                        String title = animal.nextLine();
                        System.out.println("Введите имя животного: \n");
                        String name = animal.nextLine();
                        System.out.println("Введите дату рождения животного: \n");
                        long date = animal.nextLong();
                        PackAnimals packAnimals = new PackAnimals(title, name, date);
                        AddAnimals addAnimals= new AddAnimals();
                        addAnimals.addNewAnimal(packAnimals, packAuimalList);
                        System.out.println("-----------------------------");
                        count.addCount();
                        menu();
                    }
                    default -> {
                        System.out.println("Что-то пошло не так! Попробуйте еще раз.");
                        System.out.println("-----------------------------");
                        menu();
                    }
                }
            }
            case "1" -> {
                AllAnimalsShow allAnimalsShow = new AllAnimalsShow();
                allAnimalsShow.showAnimals(petsList);
                allAnimalsShow.showAnimals(packAuimalList);

                System.out.println("-----------------------------");
                menu();
            }
            case "3" -> {
                Scanner animalCommands = new Scanner(System.in);
                System.out.println("Введите имя животного, которого хотите обучить");
                String aniName = animalCommands.nextLine();
                System.out.println("Введите команду, которой хотите обучить");
                String aniComm = animalCommands.nextLine();

                AddCommand addCommand = new AddCommand();
                int flag = 0;
                for (Animals packAni : packAuimalList) {
                    if (packAni.toString().contains(aniName)){
                        addCommand.addComand(aniName, aniComm, packAuimalList);
                        flag = 1;
                    }
                }
                for (Animals petAni : petsList) {
                    if (petAni.toString().contains(aniName)){
                        addCommand.addComand(aniName, aniComm, petsList);
                        flag = 1;
                    }
                }
                if (flag == 0){
                    System.out.println("такого животного нет в питомнике");
                }
                System.out.println("-----------------------------");
                menu();
            }
            case "4" -> {
                Scanner aniName = new Scanner(System.in);
                System.out.println("Выберите животное");
                String name = aniName.nextLine();
                CommandsShow commandsShow = new CommandsShow();
                commandsShow.showAnimalCommands(name, packAuimalList);
                commandsShow.showAnimalCommands(name, petsList);

                System.out.println("-----------------------------");
                menu();
            }
            case "5" -> {
                System.out.println(count);

                System.out.println("-----------------------------");
                menu();
            }
            default -> {
                System.out.println("Что-то пошло не так! Попробуйте еще раз.");
                System.out.println("-----------------------------");
                menu();
            }
        }
    }
}
