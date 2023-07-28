package cycles;

import java.util.Random;
import java.util.Scanner;

public class EducationApp {

    // Вам нужно написать обучающую программу для ребенка,
    // который изучает таблицу умножения.
    // Программа должна включать в себя:
    // 1. Раздел "Вывести таблицу". При выборе этого раздела нужно вывести всю таблицу умножения (в табличном виде)
    // 2. Раздел "Вывести таблицу для числа". Выводит таблицу умножения на конкретное число, например, на 3,
    // как 1*3=3 2*3=6... 9*3=27 в столбец
    // 3. Раздел "Проверить себя", где ребенок может отвечать на вопросы по таблице умножения.
    // Программа задает вопросы бесконечно, но из этого режима можно в любой момент выйти.
    // Для ответа у ребенка есть три попытки.
    // 4. Возможность выйти из программы, не выбрав ни одного действия или после завершения любого действия.
    // После каждого шага программа сообщает: "Выбери действие или введи 'завершить', чтобы выйти из программы"
    // 5. Напоминание списка действий (вывод) "Введите ..., чтобы ... и т.д"

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("A. Таблица умножения.\n" +
                "B. Таблица для числа.\nC. Проверить себя." +
                "\nD. Выход из программы\nE. Помощь");

        String input;
        do {
            input = sc.nextLine();

            switch (input.toLowerCase()) {
                case "a" -> {
                    for (int i = 1; i <= 9; i++) {
                        for (int j = 1; j <= 9; j++) {
                            System.out.print(j + " * " + i + " = " + i * j); // 1*1 2*2 3*3
                            if (i * j / 10 >= 1) {
                                System.out.print("  ");
                            } else {
                                System.out.print("   ");
                            }
                        }
                        System.out.println();
                    }
                }
                case "b" -> {
                    System.out.println("Введите число от 1 до 9");
                    int num = sc.nextInt();
                    for (int i = 1; i <= 9; i++) {
                        System.out.printf("%d * %d = %d\n", num, i, num * i);
                    }
                }
                case "c" -> {
                    System.out.println("Давай поиграем! Если надоест, напиши 'хватит'");
                    Scanner sc2 = new Scanner(System.in);
                    String res;
                    do {
                        Random r = new Random();
                        int number1 = r.nextInt(1, 10);
                        int number2 = r.nextInt(1, 10);

                        System.out.println("Сколько будет " + number1 + " * " + number2);
                        res = sc2.nextLine();
                        if (Integer.parseInt(res) == number1 * number2) {
                            System.out.println("Верно!");
                        } else {
                            int counter = 0;
                            do {
                                System.out.println("Неверно, попробуй ещё раз");
                                counter++;
                                res = sc2.nextLine();
                            } while (Integer.parseInt(res) != number1 * number2 && counter != 3);
                        }
                    } while (!res.equalsIgnoreCase("хватит"));
                    sc2.close();
                }
                case "e" -> System.out.println("Введите 1, чтобы вывести таблицу умножения.\n" +
                        "Введите 2, чтобы вывести таблицу для числа.\nВведите 3, чтобы проверить себя." +
                        "\nВведите 4 для выхода из программы");
                default -> {
                    System.out.println("Вы ввели белиберду, попробуйте ещё раз");
                }
            }
        } while (input != "d");
    }
}
