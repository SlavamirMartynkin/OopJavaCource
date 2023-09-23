package ComplexCalculatorHW7.App;

import ComplexCalculatorHW7.View.StartCalculator;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StartCalculator startCalculator = new StartCalculator("start");
        startCalculator.start();
    }
}

