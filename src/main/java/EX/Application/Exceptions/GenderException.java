package EX.Application.Exceptions;

public class GenderException extends RuntimeException{
    public GenderException(){
        super("Вы уверены, что правильно указали пол?" + '\n' +
                "Запись данных не завершена!");
    }
}
