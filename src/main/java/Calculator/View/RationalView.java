package Calculator.View;

import Calculator.Controller.ActionForRational;

public class RationalView  extends ActionForRational implements View {
    @Override
    public void sendOnConsole(Number answer) {
        System.out.println(answer);
    }
}
