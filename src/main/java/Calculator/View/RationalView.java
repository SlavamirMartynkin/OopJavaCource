package Calculator.View;

import Calculator.Controller.ActionForRational;

public class RationalView  extends ActionForRational implements View {
    @Override
    public void sendOnConsole(String answer) {
        System.out.println(answer);
    }
}
