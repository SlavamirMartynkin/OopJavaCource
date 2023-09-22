package Calculator.Controller;
/**
 * @apiNote принцип разделения интерфейса
 *
 */
public interface ArithmeticAction<T> {
    Double sum (String firstNumber, String secondNumber);
    Double dif (String firstNumber, String secondNumber);
    Double mult (String firstNumber, String secondNumber);
    Double div (String firstNumber, String secondNumber);

}
