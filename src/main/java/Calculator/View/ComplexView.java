package Calculator.View;

import Calculator.Controller.ActionForComplex;
import Calculator.Controller.ActionForRational;

public class ComplexView extends ActionForComplex implements View{

    @Override
    public void sendOnConsole(Number answer) {
        System.out.println(answer);
    }
}
