package Calculator;

import Calculator.Controller.LogWriter;
import Calculator.Controller.StartMenu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

//Создать калькулятор для работы с рациональными и комплексными числами,
// организовать меню, добавив в неё систему логирования.
// a+bi - копплексное
public class Main {
    public static void main(String[] args) throws IOException {
        StartMenu start = new StartMenu();
        start.startCalculator();
    }
}
