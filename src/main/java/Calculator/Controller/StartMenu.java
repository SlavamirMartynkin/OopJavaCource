package Calculator.Controller;

import java.io.IOException;
import java.util.Scanner;

public class StartMenu {
    public StartMenu() {
    }

    public void startCalculator() throws IOException {
        System.out.println("Выберите тип калькулятора...");
        System.out.println("Рациональные числа - 1");
        System.out.println("Комплексные числа - 2");
        System.out.println("Изменение типа калькулятора - change");
        System.out.println("Выключение - stop");

        Scanner scanner = new Scanner(System.in);
        String calcType = scanner.nextLine();
        LogWriter logWriter = new LogWriter();

        Boolean type;
        switch (calcType) {
            case "1":
                System.out.println("Выбран калькулятор рациональных чисел!");
                logWriter.writeLog("Запущен калькулятор рациональных чисел");
                ActionForRational racCalc = new ActionForRational();
                type = true;
                if (type == true) {
                    racCalc.selectionRational();
                }
                break;
            case "2":
                System.out.println("Выбран калькулятор комплексных чисел!");
                System.out.println("Внимание! Для расчетов с комплексными числами воспользуйтесь " +
                        "следующим форматом записи выражений: a1+b1i + a2+b2i");
                logWriter.writeLog("Запущен калькулятор комплексных чисел");
                ActionForComplex complCalc = new ActionForComplex();
                type = false;
                if (type == false) {
                    complCalc.selectionComplex();
                    break;
                }
            default:
                startCalculator();
        }
    }
}
