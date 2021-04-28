import java.util.Scanner;

public class TenNumbersInLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое целое число (от 0 до 100):");
        int firstNumber = scanner.nextInt();

        System.out.println("Введите второе целое число (от 0 до 100), больше первого:");
        int secondNumber = scanner.nextInt();

        System.out.println("Введите количество чисел в строке: (от 1 до 100):");
        int amountNumbersInLine = scanner.nextInt();

        if (secondNumber - firstNumber < amountNumbersInLine) { //The number of numbers in a line must not exceed the total number of numbers
            amountNumbersInLine = secondNumber - firstNumber + 1;
        }

        int fullLinesAmount = (secondNumber - firstNumber) / amountNumbersInLine;
        int param = (secondNumber - firstNumber) - (fullLinesAmount * amountNumbersInLine) + 1; //Determine the number of numbers in the first line
        int currentNumber = firstNumber;
        int consoleLineLength = 4 * amountNumbersInLine; //for each number reserves four places to console output;

        do {
            String s = "";
            for (int i = 0; i <= param - 1; i++) {

                s = String.format("%s%4s", s, currentNumber);
                currentNumber += 1;
            }

            s = String.format("%" + consoleLineLength + "s", s);
            System.out.println(s);
            param = amountNumbersInLine;
        } while (currentNumber < secondNumber);
    }
}