// 3. Реализовать простой калькулятор

import java.util.Scanner;

public class Home_work_1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Калькулятор готов к использованию");
        String num1 = scanner.nextLine();
        String operator = scanner.nextLine();
        String num2 = scanner.nextLine();
        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);
        int result = Calculator(number1, number2, operator);
        System.out.println(number1 + " " + operator + " " + number2 + " = " + result);
        scanner.close();
    }

    static Integer Calculator(Integer n1, Integer n2, String oper) {
        int res = 0;
        switch (oper) {
            case "+":
                res = n1 + n2;
                break;
            case "-":
                res = n1 - n2;
                break;
            case "*":
                res = n1 * n2;
                break;
            case "/":
                res = n1 / n2;
                break;
            default:
                System.out.println("Вы ввели некорректную операцию!");
                break;
        }
        return res;
    }
}
