package EX.Less2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        printStr();
    }
    private static void printStr() {
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("")){
            throw new RuntimeException("Пустые строки вводить нельзя!!!");
        }
    }
}
