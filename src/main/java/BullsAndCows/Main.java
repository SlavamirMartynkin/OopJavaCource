package BullsAndCows;

import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        gameType();
    }
    public static void gameType() throws IOException {

        System.out.println("В какую игру будем играть?");
        System.out.println("1 - игра с числами");
        System.out.println("2 - игра с русским алфавитом");
        System.out.println("3 - игра с английским алфавитом");
        System.out.println("4 - история пердыдущих игр");
        System.out.println("если хотите перезапустить игру наберите в поле ответа - '+RESTART+' ");

        Scanner scanner1 = new Scanner(System.in);
        String numberOfGame = scanner1.nextLine();

        switch (numberOfGame) {
            case "1":
                System.out.println("Выбрана игра с числами!");
                Game game1 = new GameNumber();
                game1.start(5, 3);
                runGame(game1);
                break;
            case "2":
                System.out.println("Выбрана игра с русским алфавитом!");
                Game game2 = new RuGame();
                game2.start(5, 3);
                runGame(game2);
                break;
            case "3":
                System.out.println("Выбрана игра с английским алфавитом!");
                Game game3 = new EnGame();
                game3.start(5, 3);
                runGame(game3);
                break;
            case "4":
                File logFile = new File("C:\\Users\\SlavaMar\\Desktop\\ДЗ GB\\JAVACource" +
                        "\\OopJavaCource\\src\\main\\java\\BullsAndCows", "logFile.txt");
                FileReader fr = new FileReader(logFile);
                BufferedReader br = new BufferedReader(fr);
                br.lines().forEach(System.out::println);
        }
    }

    private static void runGame(Game game) throws IOException {

        Scanner scanner = new Scanner(System.in);

        File logFile = new File("C:\\Users\\SlavaMar\\Desktop\\ДЗ GB\\JAVACource" +
                "\\OopJavaCource\\src\\main\\java\\BullsAndCows", "logFile.txt");
        FileWriter fw = new FileWriter(logFile, true);
        fw.append(new Date().toString() + "; ");
        fw.append('\n');
        fw.append(game.getGameStatus().toString() + "; ");
        fw.append(game.toString() + "; ");
        fw.append('\n');

        while (!game.getGameStatus().equals(GameStatus.WINNER)
                && !game.getGameStatus().equals(GameStatus.LOSE)) {
            String scannerWord = scanner.nextLine();
            if(!scannerWord.equals("+RESTART+")){
                Answer answer = game.inputValue(scannerWord);
                System.out.println("Ответ: " + answer);
                fw.append("Ответ: " + answer + "; ");

            }else {
                fw.append("+RESTART+ ");
                break;
            }
        }
        System.out.println(game.getGameStatus());
        fw.append(game.getGameStatus().toString());
        fw.append('\n');
        if(!game.getGameStatus().equals(GameStatus.WINNER)
                && !game.getGameStatus().equals(GameStatus.LOSE)) {
            gameType();
        }
        fw.append('\n');
        fw.flush();
    }

}
