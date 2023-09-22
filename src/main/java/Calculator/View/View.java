package Calculator.View;

import java.util.List;
/**
 * @apiNote принцип разделения интерфейса
 *
 */
public interface View <T extends  Number>{
    void sendOnConsole(String answer);
}
