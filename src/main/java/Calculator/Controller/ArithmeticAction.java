package Calculator.Controller;

public interface ArithmeticAction<T> {
    Double sum (String firstNumber, String secondNumber);
    Double dif (String firstNumber, String secondNumber);
    Double mult (String firstNumber, String secondNumber);
    Double div (String firstNumber, String secondNumber);

}
