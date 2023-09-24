package EX.Less2;

public class Task2 {
    public static void main(String[] args) {
        int[] intArray = new int[9];   // инициализировал массив из 9 чисел
                                        // чтобы в 9-й строке можно было использовать его 8-й элемент
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
