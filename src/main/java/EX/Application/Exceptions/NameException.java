package EX.Application.Exceptions;

public class NameException extends RuntimeException{
    public NameException(){
        super("Фамилия, Имя, Отчество введены в неверном формате!"+ '\n' +
                "Запись данных не завершена!");
    }
}
