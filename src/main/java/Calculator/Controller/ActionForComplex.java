package Calculator.Controller;

import Calculator.Models.ComplexNumber;
import Calculator.View.RationalView;

import java.io.IOException;
import java.util.Scanner;

public class ActionForComplex implements ArithmeticAction<ComplexNumber>{
    private double res;
    @Override
    public Double sum(String firstNumber, String secondNumber) {
        System.out.println("вычисляем сумму");
        return null;
    }

    @Override
    public Double dif(String firstNumber, String secondNumber) {
        System.out.println("вычисляем разность");
        return null;
    }

    @Override
    public Double mult(String firstNumber, String secondNumber) {
        System.out.println("вычисляем произведение");
        return null;
    }

    @Override
    public Double div(String firstNumber, String secondNumber) {
        System.out.println("вычисляем деление");
        return null;
    }
    @Override
    public String toString() {
        return String.valueOf(res);
    }

    public void selectionComplex() throws IOException {
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
            view.sendOnConsole(racCalc.sum(a, b));
            logWriter.writeLog(a + " + " + b + "i = " + racCalc.sum(a, b));
        }
        if (example.contains("-")) {
            String[] splitExample = example.split("\\-");
            String a = splitExample[0];
            String b = splitExample[1];
            view.sendOnConsole(racCalc.dif(a, b));
            logWriter.writeLog(a + " - " + b + "i = " + racCalc.dif(a, b));
        }
        if (example.contains("*")) {
            String[] splitExample = example.split("\\*");
            String a = splitExample[0];
            String b = splitExample[1];
            view.sendOnConsole(racCalc.mult(a, b));
            logWriter.writeLog(a + " * " + b + "i = " + racCalc.mult(a, b));
        }
        if (example.contains("/")) {
            String[] splitExample = example.split("\\/");
            String a = splitExample[0];
            String b = splitExample[1];
            view.sendOnConsole(racCalc.div(a, b));
            logWriter.writeLog(a + " / " + b + "i = " + racCalc.div(a, b));
        }
        if (example.contains("change")) {
            StartMenu start = new StartMenu();
            start.startCalculator();
        }
        if (example.contains("stop")) {
            System.out.println("Калькулятор выключен!");
            logWriter.writeLog("Калькулятор выключен");
        } else {
            selectionComplex();
        }
    }
}
