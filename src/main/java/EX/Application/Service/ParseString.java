package EX.Application.Service;

import java.util.*;

public class ParseString implements Parseable {
    String input;

    public ParseString(String input) {
        this.input = input;
    }

    public ParseString() {
    }

    @Override
    public String[] stringParse(String input) {

        Map<String, String> numbers = new HashMap<>();
        numbers.put("0", null);
        numbers.put("1", null);
        numbers.put("2", null);
        numbers.put("3", null);
        numbers.put("4", null);
        numbers.put("5", null);
        numbers.put("6", null);
        numbers.put("7", null);
        numbers.put("8", null);
        numbers.put("9", null);

        Map<String, String> alphabet = new HashMap<>();
        alphabet.put("й", null);
        alphabet.put("ф", null);
        alphabet.put("я", null);
        alphabet.put("ц", null);
        alphabet.put("ы", null);
        alphabet.put("ч", null);
        alphabet.put("у", null);
        alphabet.put("в", null);
        alphabet.put("с", null);
        alphabet.put("к", null);
        alphabet.put("а", null);
        alphabet.put("м", null);
        alphabet.put("е", null);
        alphabet.put("п", null);
        alphabet.put("и", null);
        alphabet.put("н", null);
        alphabet.put("р", null);
        alphabet.put("т", null);
        alphabet.put("г", null);
        alphabet.put("о", null);
        alphabet.put("ь", null);
        alphabet.put("ш", null);
        alphabet.put("л", null);
        alphabet.put("б", null);
        alphabet.put("щ", null);
        alphabet.put("д", null);
        alphabet.put("ю", null);
        alphabet.put("з", null);
        alphabet.put("ж", null);
        alphabet.put("х", null);
        alphabet.put("э", null);
        alphabet.put("ъ", null);
        alphabet.put("ё", null);

        Map<String, String> symbol = new HashMap<>();
        symbol.put("!", null);
        symbol.put(":", null);
        symbol.put(";", null);
        symbol.put("?", null);
        symbol.put("*", null);
        symbol.put("(", null);
        symbol.put(")", null);
        symbol.put("-", null);
        symbol.put("+", null);
        symbol.put("=", null);
        symbol.put("/", null);
        symbol.put(",", null);

        String[] data = new String[6];
        String[] splitInput = input.split(" ");
        if (splitInput.length == 6) {
            for (String element : splitInput) {
                for (int i = 0; i < element.length(); i++) {
                    if (element.equals("m") || element.equals("f")) {
                        data[5] = element;
                    }
                    String letter = String.valueOf(element.toLowerCase().charAt(i));
                    if (numbers.containsKey(letter) && !element.contains(".") && !alphabet.containsKey(letter) &&
                            !symbol.containsKey(letter) && element.length() <= 10 && element.length() >= 7) {
                        data[4] = element;
                    }
                    if (numbers.containsKey(letter) && element.contains(".") && !alphabet.containsKey(letter) &&
                            !symbol.containsKey(letter)) {
                        char[] points = new char[10];
                        element.getChars(0, 9, points, 0);
                        if (element.length() == 10 && ".".equals(String.valueOf(points[2])) &&
                                ".".equals(String.valueOf(points[5])) && !".".equals(String.valueOf(points[0])) &&
                                !".".equals(String.valueOf(points[1])) && !".".equals(String.valueOf(points[3])) &&
                                !".".equals(String.valueOf(points[4])) && !".".equals(String.valueOf(points[6])) &&
                                !".".equals(String.valueOf(points[7])) && !".".equals(String.valueOf(points[8])) &&
                                !".".equals(String.valueOf(points[9]))) {
                            data[3] = element;
                        }
                    }
                    if (alphabet.containsKey(letter) && !numbers.containsKey(letter) && !symbol.containsKey(letter)
                            && element.contains(",")) {
                        if (data[0] == null) {
                            StringBuilder sb = new StringBuilder(element);
                            sb.deleteCharAt(sb.length() - 1);
                            data[0] = sb.toString();
                        } else {
                            StringBuilder sb = new StringBuilder(element);
                            sb.deleteCharAt(sb.length() - 1);
                            data[1] = sb.toString();
                        }
                    }
                    if (alphabet.containsKey(letter) && !numbers.containsKey(letter) && !symbol.containsKey(letter)) {
                        data[2] = element;
                    }
                }
            }
        }
        return data;
    }
}
