package ComplexCalculatorHW7.View;

import ComplexCalculatorHW7.Service.AdapterToInt;
import ComplexCalculatorHW7.Service.Calculate;
import ComplexCalculatorHW7.Service.LogWriter;

import java.io.IOException;
import java.util.Scanner;

public class StartCalculator extends AdapterToInt implements Startable{
    Calculate calculate;
    AdapterToInt adapter;

    public StartCalculator(String input, Calculate calculate) {
        super(input);
        this.calculate = calculate;
    }

    public StartCalculator(String input) {
        super(input);
    }

    @Override
    public void start() throws IOException {
        LogWriter logWriter = new LogWriter();
        System.out.println("Калькулятор комплексных чисел запущен.");
        logWriter.writeLog("Калькулятор комплексных чисел запущен.");
        System.out.println("Для продолжения наберите пробел (' ')");
        System.out.println("Для выхода из приложения наберите стоп ('stop')");
        System.out.println("Внимание! Для расчетов с комплексными числами воспользуйтесь " +
                "следующим форматом записи выражений: a1+b1i + a2+b2i");

        Scanner scanner = new Scanner(System.in);
        String stop = scanner.nextLine();
        switch (stop) {
            case "stop":
                System.out.println("Калькулятор комплексных чисел выключен.");
                logWriter.writeLog("Калькулятор комплексных чисел выключен.");
                break;
            case " ":
                System.out.println("Введите выражение:");
                String input = scanner.nextLine();
                Calculate calculate = new Calculate();
                StartCalculator startCalculator = new StartCalculator(input, calculate);

                Integer a1 = Integer.valueOf(startCalculator.getA1());
                Integer a2 = Integer.valueOf(startCalculator.getA2());
                Integer b1 = Integer.valueOf(startCalculator.getB1());
                Integer b2 = Integer.valueOf(startCalculator.getB2());

                if (startCalculator.getAction().equals("+")){
                    startCalculator.calculate.summ(a1, a2, b1,b2);
                    System.out.println(startCalculator.calculate.summ(a1, a2, b1,b2));
                    LogWriter.writeLog(input + " = " +  startCalculator.calculate.summ(a1, a2, b1,b2));
                }
                if (startCalculator.getAction().equals("-")){
                    startCalculator.calculate.dif(a1, a2, b1,b2);
                    System.out.println(startCalculator.calculate.dif(a1, a2, b1,b2));
                    LogWriter.writeLog(input + " = " + startCalculator.calculate.dif(a1, a2, b1,b2));
                }
                if (startCalculator.getAction().equals("*")){
                    startCalculator.calculate.mult(a1, a2, b1,b2);
                    System.out.println(startCalculator.calculate.mult(a1, a2, b1,b2));
                    LogWriter.writeLog(input + " = " + startCalculator.calculate.mult(a1, a2, b1,b2));
                }
                if (startCalculator.getAction().equals("/")){
                    startCalculator.calculate.dev(a1, a2, b1,b2);
                    System.out.println(startCalculator.calculate.dev(a1, a2, b1,b2));
                    LogWriter.writeLog(input + " = " + startCalculator.calculate.dev(a1, a2, b1,b2));
                }
                startCalculator.start();
        }
    }
}
