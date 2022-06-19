
import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("\n\nEnter the number : "); // Введите число
        int a = Scanner.nextInt();
        Scanner.close();
        System.out.println("Triangular number from " + a + " = " + Triangle(a) + "\n"); // Треугольное число от
    }

    public static int Triangle(int num) {
        if (num == 1) {
            return 1;
        }
        return Triangle(num - 1) + num;
    }
}

// Написать программу возвращающее число, которое без остатка делится на сумму цифр этого числа.


public class Exercise_01 {
    public static void main(String[] args) {
        System.out.println("\nIn the range from 10 to 100, these numbers are divided without
         a remainder by the sum of the digits of the number: ");
        for (int i = 10; i < 101; i++) {
            if (i % sum_numbers(i) == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n\n");
    }

    public static int sum_numbers(int n) {
        int sum = 0;
        while (0 != n) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}