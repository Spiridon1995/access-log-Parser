import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int number2 = new Scanner(System.in).nextInt();
        int firstNuber = 5;
        int secondNumber = 10;
        double quorient = (double) firstNuber / secondNumber;
        System.out.println("Сумма: " + (firstNuber + secondNumber));
        System.out.println("Разность: " + (firstNuber - secondNumber));
        System.out.println("Произведение: " + (firstNuber * secondNumber));
        System.out.println("Частное: " + ((double) firstNuber / secondNumber));
    }
}
