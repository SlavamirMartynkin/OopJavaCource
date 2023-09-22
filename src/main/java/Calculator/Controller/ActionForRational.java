package Calculator.Controller;

import Calculator.Models.RationalNumber;
import Calculator.View.RationalView;

import java.io.IOException;
import java.util.Scanner;
/**
 * @apiNote принцмп единой ответственности
 * класс отвечает за действия с рациональными числами
 */
public class ActionForRational implements ArithmeticAction<RationalNumber> {
    private double res;

    @Override
    public Double sum(String a, String b) {
        return res = Double.valueOf(a) + Double.valueOf(b);
    }

    @Override
    public Double dif(String a, String b) {
        return res = Double.valueOf(a) - Double.valueOf(b);
    }

    @Override
    public Double mult(String a, String b) {
        return res = Double.valueOf(a) * Double.valueOf(b);
    }

    @Override
    public Double div(String a, String b) {
        return res = Double.parseDouble(a) / Double.parseDouble(b);
    }

    @Override
    public String toString() {
        return String.valueOf(res);
    }

    public void selectionRational() throws IOException {
        ActionForRational racCalc = new ActionForRational();
        System.out.println("Введите выражение: ");
        Scanner scanner = new Scanner(System.in);
        String example = scanner.nextLine();
        RationalView view = new RationalView();
        LogWriter logWriter = new LogWriter();

        if (example.contains("+")) {
            String[] splitExample = example.split("\\+");
            String a = splitExample[0];
            String b = splitExample[1];
            view.sendOnConsole(String.valueOf(racCalc.sum(a, b)));
            logWriter.writeLog(a + " + " + b + " = " + racCalc.sum(a, b));
        }
        if (example.contains("-")) {
            String[] splitExample = example.split("\\-");
            String a = splitExample[0];
            String b = splitExample[1];
            view.sendOnConsole(String.valueOf(racCalc.dif(a, b)));
            logWriter.writeLog(a + " - " + b + " = " + racCalc.dif(a, b));
        }
        if (example.contains("*")) {
            String[] splitExample = example.split("\\*");
            String a = splitExample[0];
            String b = splitExample[1];
            view.sendOnConsole(String.valueOf(racCalc.mult(a, b)));
            logWriter.writeLog(a + " * " + b + " = " + racCalc.mult(a, b));
        }
        if (example.contains("/")) {
            String[] splitExample = example.split("\\/");
            String a = splitExample[0];
            String b = splitExample[1];
            view.sendOnConsole(String.valueOf(racCalc.div(a, b)));
            logWriter.writeLog(a + " / " + b + " = " + racCalc.div(a, b));
        }
        if (example.contains("change")) {
            StartMenu start = new StartMenu();
            start.startCalculator();
        }
        if (example.contains("stop")) {
            System.out.println("Калькулятор выключен!");
            logWriter.writeLog("Калькулятор выключен");
        } else {
            selectionRational();
        }
    }
}
