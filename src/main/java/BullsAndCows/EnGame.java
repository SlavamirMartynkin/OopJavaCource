package BullsAndCows;

import java.util.ArrayList;
import java.util.List;

public class EnGame extends AbstractGame {
    @Override
    List<String> generateCharList() {
        List<String> list = new ArrayList<>();
        for (int i = 'a'; i <= 'z'; i++) {
            list.add(String.valueOf((char) i));
        }
        return list;
    }

    @Override
    public String toString() {
        return "Выбрана игра с английским алфавитом. Загадано: " + word;
    }
}
