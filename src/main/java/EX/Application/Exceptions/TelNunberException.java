package EX.Application.Exceptions;

public class TelNunberException extends NumberFormatException{
    public TelNunberException(){
        super("Номер телефона введен некорректно!"+ '\n' +
                "Запись данных не завершена!");
    }
}
