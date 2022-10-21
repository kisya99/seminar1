// Задача: 1281 . Вычесть произведение и сумму цифр целого числа

package seminar1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scanner.nextInt();
        System.out.print("Ответ: ");
        calculation(a);

    }

    public static void calculation(int n) {
        int prod = 1;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            prod  *= digit;
            sum += digit;
            n /= 10;
        }
        System.out.println(prod - sum);
    }



}
