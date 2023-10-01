package EX.Application.App;

import EX.Application.Service.ParseString;
import EX.Application.View.StartApplication;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        StartApplication newData = new StartApplication();
        try {
            newData.start();
        } catch (IOException e) {
            throw new RuntimeException("Файл не создан! ");
        }
    }
}
