package EX.Less2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        printNumber();
    }

    private static void printNumber() {
        System.out.println("Введите дробное число: ");
        Scanner scanner = new Scanner(System.in);
        Float number = null;
        try {
            number = Float.valueOf(scanner.nextLine());
            System.out.println(number);

        } catch (NumberFormatException e) {
            System.out.println("Введите число, а не текст!!!");
            printNumber();
        }
    }
}