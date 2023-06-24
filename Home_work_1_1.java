// 1. Вычислить n-ое треугольное число(сумма чисел от 1 до n), n!
// (произведение чисел от 1 до n)

import java.util.Scanner;

public class Home_work_1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n");
        Integer number = scanner.nextInt();
        scanner.close();
        if (number > 0) {
            System.out.println("Сумма чисел от 1 до " + number + " -> " + SumNumber(number));
            System.out.println("Произведение чисел от 1 до " + number + " -> " + FactorialNum(number));
        } else {
            System.out.println("Error");
        }
    }

    static Integer SumNumber(Integer num) {
        int sum = 0;
        for (int index = 1; index <= num; index++) {
            sum += index;
        }
        return sum;
    }

    static Integer FactorialNum(Integer num) {
        int product = 1;
        for (int index = 1; index <= num; index++) {
            product *= index;
        }
        return product;
    }
}
