// 2. Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Home_work_2_2 {
    static Logger logger = Logger.getLogger(Home_work_2_2.class.getName());

    public static void main(String[] args) {
        try {
            FileHandler fh = new FileHandler("log_file.txt");
            logger.addHandler(fh);
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);
            logger.log(Level.WARNING, "Тестовое логирование");
        } catch (IOException e) {
            logger.log(Level.WARNING, e.getMessage());
        }
        int[] array = { 43, 3, 7, 0, 21, 444, 55 };
        int[] result = bubbleSorting(array);
        printArray(result);
    }

    public static int[] bubbleSorting(int[] arr) {
        int temp = 0;
        boolean finish;
        do {
            finish = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    finish = false;
                }
            }
        } while (!finish);
        return arr;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
