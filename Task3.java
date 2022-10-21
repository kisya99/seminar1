//Вам даны две строки word1 и word2. Объедините строки, добавляя буквы в чередующемся порядке, начиная с word1.
// Если строка длиннее другой, добавьте дополнительные буквы в конец объединенной строки.
//
//Вернуть объединенную строку.

package seminar1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое слово: ");
        String word1 = scanner.nextLine();
        System.out.print("Введите второе слово: ");
        String word2 = scanner.nextLine();
        String result = mergeString(word1, word2);
        System.out.print("Ответ: ");
        System.out.println(result);}

    public static String mergeString(String word1, String word2) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                sb.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                sb.append(word2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
}
