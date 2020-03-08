import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Transfer T = new Transfer();
        System.out.println("Разрешены числа от 1 до 10 или от I до X. Вводить строго через пробел. ");
        System.out.print("Введите выражение: ");
        Scanner str = new Scanner(System.in);
        T.tr(str.nextLine());
    }
}
