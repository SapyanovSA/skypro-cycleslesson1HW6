import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        //Task 2
        System.out.println("Task 2");

        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        //Task 3
        System.out.println("Task 3");

        for (int i = 0; i <= 17; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();

        //Task 4
        System.out.println("Task 4");

        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        //Task 5
        System.out.println("Task 5");

        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }

        //Task 6
        System.out.println("Task 6");

        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }

        System.out.println();

        //Task 7
        System.out.println("Task 7");

        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }

        System.out.println();

        //Task 8
        System.out.println("Task 8");

        double salary = 29_000;
        double totalSalary = 0;

        for (int month = 1; month <= 12; month++) {
            totalSalary += salary;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSalary + " рублей");
        }

        //Task 9
        System.out.println("Task 9");

        salary = 29_000;
        totalSalary = 0;

        for (int i = 1; i <= 12; i++) {
            totalSalary += salary;
            totalSalary += totalSalary / 100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + String.format("%.2f", totalSalary) + " рублей");
        }

        //Task 10
        System.out.println("Task 10");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d%n", 2, i, 2 * i);
        }
    }
}