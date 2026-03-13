package Exceptions.Finally;

import java.io.ByteArrayInputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Practicum {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(new ByteArrayInputStream("hello\nworld".getBytes()));
        try {
            System.out.println("Первая линия: " + scanner.nextLine());
            System.out.println("Вторая линия: " + scanner.nextLine());
            // создано только две линии, следующее получение сгенерирует ошибку
            System.out.println("Третья линия: " + scanner.nextLine());
        } catch (NoSuchElementException exception) {
            System.out.println("Ошибка: линии закончились");
        } finally {
            System.out.println("Закрываем сканер");
            scanner.close();
        }
    }
}
