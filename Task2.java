import java.util.Scanner;

public class Task2 {

    // Дано трехзначное число. Найти:
    //	1.	число единиц в нем;
    //	2.	число десятков в нем;
    //	3.	сумму его цифр;
    //	4.	произведение его цифр.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите трехзначное число: ");

        int a = sc.nextInt();
        int units = a % 10;
        int decs = (a / 10) % 10;
        int hundreds = (a / 100);
        int x = units + decs + hundreds;
        int y = units * decs * hundreds;

        // System.out.println("число единиц = " + a % 10);
        System.out.printf("число единиц = %d \n", units);
        System.out.println("число десятков = " + decs);
        System.out.println(x);
        System.out.println(y);
    }
}
