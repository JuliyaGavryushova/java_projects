// 4. К калькулятору из предыдущего ДЗ добавить логирование.

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Home_work_2_4 {
    static Logger logger = Logger.getLogger(Home_work_2_4.class.getName());

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

    public static void logFile(){
        try {
        FileHandler fh = new FileHandler("log_2_4.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.log(Level.WARNING, "Тестовое логирование");
        } catch (IOException e) {
        logger.log(Level.WARNING, e.getMessage());
        }
    }

    static Integer Calculator(Integer n1, Integer n2, String oper) {
        logFile();
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
