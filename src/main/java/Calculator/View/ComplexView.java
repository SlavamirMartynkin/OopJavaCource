package Calculator.View;

import Calculator.Controller.ActionForComplex;

public class ComplexView extends ActionForComplex implements View{

    @Override
    public void sendOnConsole(String answer) {
        System.out.println(answer);
    }
}
