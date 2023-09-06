package BullsAndCows;

import java.util.ArrayList;
import java.util.List;

public class RuGame extends AbstractGame{
    @Override
    List<String> generateCharList() {
        List<String> list = new ArrayList<>();
        for (int i = 'а'; i <= 'я'; i++) {
            list.add(String.valueOf((char)i));
        }
        list.add("ё");
        return list;
    }
    @Override
    public String toString() {
        return "Выбрана игра с русским алфавитом. Загадано: " + word ;
    }
}