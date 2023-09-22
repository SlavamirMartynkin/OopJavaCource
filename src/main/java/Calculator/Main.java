package Calculator;

import Calculator.Controller.LogWriter;
import Calculator.Controller.StartMenu;

import java.io.IOException;

//Создать калькулятор для работы с рациональными и комплексными числами,
// организовать меню, добавив в неё систему логирования.
// a+bi - копплексное
public class Main {
    public static void main(String[] args) throws IOException {
        StartMenu start = new StartMenu();
        start.startCalculator();
    }
}
