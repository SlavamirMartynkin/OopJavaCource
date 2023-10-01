package EX.Application.Exceptions;

public class BirthDayException extends NumberFormatException{
    public BirthDayException(){
        super("Дата рождения введена некорректно!" + '\n' +
        "Запись данных не завершена!");
    }
}
