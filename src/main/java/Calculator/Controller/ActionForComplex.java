package Calculator.Controller;

import Calculator.Models.ComplexNumber;
import Calculator.View.ComplexView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @apiNote принцмп единой ответственности
 * класс отвечает за действия с комплексными числами
 */
public class ActionForComplex implements ArithmeticAction<ComplexNumber> {
    private double res;

    @Override
    public Double sum(String firstNumber, String secondNumber) {
        return res = Double.valueOf(firstNumber) + Double.valueOf(secondNumber);
    }

    @Override
    public Double dif(String firstNumber, String secondNumber) {
        return res = Double.valueOf(firstNumber) - Double.valueOf(secondNumber);
    }

    @Override
    public Double mult(String firstNumber, String secondNumber) {
        return res = Double.valueOf(firstNumber) * Double.valueOf(secondNumber);
    }

    @Override
    public Double div(String firstNumber, String secondNumber) {
        return res = Double.valueOf(firstNumber) * Double.valueOf(secondNumber);
    }

    @Override
    public String toString() {
        return String.valueOf(res);
    }

    public ArrayList<StringBuilder> parseComplex(String x) throws IOException {

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

    public void selectionComplex() throws IOException {

        ActionForComplex complexCalc = new ActionForComplex();
        System.out.println("Введите выражение: ");
        Scanner scanner = new Scanner(System.in);
        String example = scanner.nextLine();
        ComplexView view = new ComplexView();
        LogWriter logWriter = new LogWriter();

        if (example.contains("change")) {
            StartMenu start = new StartMenu();
            start.startCalculator();
        }
        if (example.contains("stop")) {
            System.out.println("Калькулятор выключен!");
            logWriter.writeLog("Калькулятор выключен");
        }else {
            String[] splitExample = example.split(" ");
            String a = splitExample[0].replace("i", "");
            String b = splitExample[2].replace("i", "");

            String a1 = String.valueOf(parseComplex(a).get(0));
            String a2 = String.valueOf(parseComplex(a).get(1));
            String b1 = String.valueOf(parseComplex(b).get(0));
            String b2 = String.valueOf(parseComplex(b).get(1));

            if (splitExample[1].equals("+")) {
                String x = String.valueOf(complexCalc.sum(a1, b1));
                String y = String.valueOf(complexCalc.sum(a2, b2));
                view.sendOnConsole(a1 + "+" + a2 + "i " + splitExample[1] + " " + b1 + "+" + b2 + "i" + " = "
                        + x + "+" + y + "i");
                logWriter.writeLog(a1 + "+" + a2 + "i " + splitExample[1] + " " + b1 + "+" + b2 + "i" + " = "
                        + x + "+" + y + "i");
            }
            if (splitExample[1].equals("-")) {
                String x = String.valueOf(complexCalc.dif(a1, b1));
                String y = String.valueOf(complexCalc.dif(a2, b2));
                view.sendOnConsole(a1 + "+" + a2 + "i " + splitExample[1] + " " + b1 + "+" + b2 + "i" + " = "
                        + x + "+" + y + "i");
                logWriter.writeLog(a1 + "+" + a2 + "i " + splitExample[1] + " " + b1 + "+" + b2 + "i" + " = "
                        + x + "+" + y + "i");
            }
            if (splitExample[1].equals("*")) {
//          x = a1*b1 - a2*b2
                String x = String.valueOf(complexCalc.mult(a1, b1) - complexCalc.mult(a2, b2));
//          y = a1*b2 + a2*b1
                String y = String.valueOf(complexCalc.mult(a1, b2) + complexCalc.mult(a2, b1));
                view.sendOnConsole(a1 + "+" + a2 + "i " + splitExample[1] + " " + b1 + "+" + b2 + "i" + " = "
                        + x + "+" + y + "i");
                logWriter.writeLog(a1 + "+" + a2 + "i " + splitExample[1] + " " + b1 + "+" + b2 + "i" + " = "
                        + x + "+" + y + "i");
            }
            if (splitExample[1].equals("/")) {
//            x = (a1*b1 + a2*b2) / (b1*b1 + b2*b2)
                String x = String.valueOf((complexCalc.mult(a1, b1) + complexCalc.mult(a2, b2)) /
                        (complexCalc.mult(b1, b1) + complexCalc.mult(b2, b2)));
//            y = (b1+a2 - a1*b2) / (b1*b1 + b2*b2)
                String y = String.valueOf((complexCalc.mult(b1, a2) - complexCalc.mult(a1, b2)) /
                        (complexCalc.mult(b1, b1) + complexCalc.mult(b2, b2)));
                view.sendOnConsole(a1 + "+" + a2 + "i " + splitExample[1] + " " + b1 + "+" + b2 + "i" + " = "
                        + x + "+" + y + "i");
                logWriter.writeLog(a1 + "+" + a2 + "i " + splitExample[1] + " " + b1 + "+" + b2 + "i" + " = "
                        + x + "+" + y + "i");
            } else {
                selectionComplex();
            }
            selectionComplex();
        }
    }
}
