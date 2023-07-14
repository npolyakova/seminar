package second;

import java.util.Scanner;

public class Sphinx {

    // Я сфинкс и я загадаю тебе 3 загадки, у тебя ровно одна попытка для каждой из них.
    // Готов(а) отгадывать загадки (да/нет)?
    // 1. Висит груша, нельзя скушать. Что это?
    // 2. На раскрашенных страницах
    //    Много праздников хранится. Что это?
    // 3. Ах, не трогайте меня:
    //    Обожгу и без огня! Что это?


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Я сфинкс и я загадаю тебе 3 загадки, у тебя ровно одна попытка для каждой из них." +
                " \nГотов(а) отгадывать загадки (да/нет)?");
        String answer1 = sc.nextLine();
        switch (answer1.toLowerCase()) {
            case "да": {
                System.out.println("Висит груша, нельзя скушать. Что это?");
                String answer2 = sc.nextLine();
                if (answer2.equalsIgnoreCase("лампочка") || answer2.equalsIgnoreCase("лампа")) {
                    System.out.println("Верно!\nНа раскрашенных страницах\n" +
                            "Много праздников хранится. Что это?");
                    String answer3 = sc.nextLine();
                    if (answer3.equalsIgnoreCase("календарь")) {
                        System.out.println("Верно!\nАх, не трогайте меня:\n" +
                                "Обожгу и без огня! Что это?");
                        String answer4 = sc.nextLine();
                        if (answer4.equalsIgnoreCase("крапива")) {
                            System.out.println("Верно!\nУра победа!");
                        } else {
                            System.out.println("Неверно! Начни заново");
                            return;
                        }
                    } else {
                        System.out.println("Неверно! Начни заново");
                        return;
                    }
                } else {
                    System.out.println("Неверно! Начни заново");
                    return;
                }
                break;
            }
            case "нет": {
                System.out.println("Пока!");
                break;
            }
            default: {
                System.out.println("Я тебя не понимаю, ответь да или нет");
                break;
            }
        }
    }
}