package EX.Application.View;

import EX.Application.Exceptions.BirthDayException;
import EX.Application.Exceptions.GenderException;
import EX.Application.Exceptions.NameException;
import EX.Application.Exceptions.TelNunberException;
import EX.Application.Service.LogWriter;
import EX.Application.Service.ParseString;
import java.util.Date;
import java.io.IOException;
import java.util.Scanner;

public class StartApplication implements Startable {

    Boolean name1 = false;
    Boolean dateOfBirth = false;
    Boolean telNum = false;
    Boolean gender = false;

    @Override
    public void start() throws IOException {
        System.out.println("Форматы данных: ");
        System.out.println("    Фамилия, Имя, Отчество");
        System.out.println("    Дата рождения - dd.mm.yyyy");
        System.out.println("    Номер телефона - 1234567890");
        System.out.println("    Пол - f или m");
        System.out.println(" ");
        System.out.println("Введите данные пользователя через пробел: ");
        Scanner scanner = new Scanner(System.in);
        String dataInput = scanner.nextLine();

        ParseString data = new ParseString();
        String[] dataList = data.stringParse(dataInput);

        if (dataList[0] != null && dataList[1] != null && dataList[2] != null) {
            System.out.println(" ");
            System.out.println("Фамилия, Имя, Отчество введены корректно...");
            name1 = true;
        } if (dataList[0] == null || dataList[1] == null || dataList[2] == null){
            throw new NameException();
        }

        if (dataList[3] != null) {
            System.out.println("Дата рождения введена корректно...");
            dateOfBirth = true;

        } else {
            throw new BirthDayException();
        }

        if (dataList[4] != null) {
            System.out.println("Номер телефона введен корректно...");
            telNum = true;
        } else {
            throw new TelNunberException();
        }

        if (dataList[5] != null) {
            System.out.println("Пол введен корректно...");
            System.out.println(" ");
            gender = true;
        } else {
            throw new GenderException();
        }

        if (name1 == true && dateOfBirth == true && telNum == true && gender == true) {
            System.out.println("<" + dataList[0] + ">" + "<" + dataList[1] + ">" + "<" + dataList[2] + ">" +
                    "<" + dataList[3] + ">" + "<" + dataList[4] + ">" + "<" + dataList[5] + ">");

            LogWriter fileCreator = new LogWriter(dataList[0]);
            fileCreator.writeLog("<" + dataList[0] + ">" + "<" + dataList[1] + ">" + "<" + dataList[2] + ">" +
                    "<" + dataList[3] + ">" + "<" + dataList[4] + ">" + "<" + dataList[5] + ">");

            System.out.println(new Date() + " " + dataList[0] + " записан в файл ");
        }
    }
}
