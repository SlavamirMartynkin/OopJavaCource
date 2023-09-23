package ComplexCalculatorHW7.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AdapterToInt {
    String input;
    String a1;
    String a2;
    String b1;
    String b2;
    String action;

    protected AdapterToInt(String input) {
        this.input = input;
    }

    public String getAction() {
        String[] splitExample = input.split(" ");
        String action = splitExample[1].replace("i", "");
        return action;
    }

    public String getA1() {
        String[] splitExample = input.split(" ");
        String a = splitExample[0].replace("i", "");

        AdapterToInt adapter1 = new AdapterToInt(a);
        a1 = adapter1.parseComplex(a).get(0).toString();
        return a1;
    }

    public String getA2() {
        String[] splitExample = input.split(" ");
        String a = splitExample[0].replace("i", "");

        AdapterToInt adapter1 = new AdapterToInt(a);
        a2 = adapter1.parseComplex(a).get(1).toString();
        return a2;
    }

    public String getB1() {
        String[] splitExample = input.split(" ");
        String b = splitExample[2].replace("i", "");

        AdapterToInt adapter1 = new AdapterToInt(b);
        b1 = adapter1.parseComplex(b).get(0).toString();
        return b1;
    }

    public String getB2() {
        String[] splitExample = input.split(" ");
        String b = splitExample[2].replace("i", "");

        AdapterToInt adapter1 = new AdapterToInt(b);
        b2 = adapter1.parseComplex(b).get(1).toString();
        return b2;
    }

    protected ArrayList<StringBuilder> parseComplex(String x){

        StringBuilder x1 = new StringBuilder("");
        StringBuilder x2 = new StringBuilder("");
        ArrayList<StringBuilder> x1x2 = new ArrayList<>();
        x1x2.add(x1);
        x1x2.add(x2);
        ArrayList<String> xList = new ArrayList<>();

        for (int j = 0; j < x.length(); j++) {
            xList.add(String.valueOf((x.charAt(j))));
        }

        Map<String, String> key = new HashMap<>();
        int count = 0;
        for (int j = 0; j < xList.size(); j++) {
            if (!key.containsKey("-") || !key.containsKey("+")) {
                if (xList.get(j).equals("+") || xList.get(j).equals("-")) {
                    key.put("-", null);
                    key.put("+", null);
                }
                x1x2.get(0).append(xList.get(j));
                count++;
            } else break;
        }
        x1.deleteCharAt(x1.length() - 1);

        for (int i = count - 1; i < xList.size(); i++) {
            if (xList.get(i).equals("+")) {
                xList.remove(i);
            }
            x1x2.get(1).append(xList.get(i));
        }
        return x1x2;
    }
}
