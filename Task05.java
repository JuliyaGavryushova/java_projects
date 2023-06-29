// Задание №5
// Напишите метод, который вернет содержимое текущей папки в виде
// массива строк.
// Напишите метод, который запишет массив, возвращенный предыдущим
// методом в файл.
// Обработайте ошибки с помощью try-catch конструкции. В случае
// возникновения исключения, оно должно записаться в лог-файл.

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task05 {
    static Logger logger = Logger.getLogger(Task05.class.getName());

    public static void main(String[] args) {
        try {
            FileHandler fh = new FileHandler("log.txt");
            logger.addHandler(fh);
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);
            logger.log(Level.WARNING, "Тестовое логирование");
        } catch (IOException e) {
            logger.log(Level.WARNING, e.getMessage());
        }

        String file = "."; // "." означает текущую директорию
        String[] allFiles = contentsFolderArray(file);
        writingFile(allFiles);
    }

    public static String[] contentsFolderArray(String fileName) {
        File f = new File(".");
        String[] strPath = f.list();
        return strPath;
    }

    public static void writingFile(String[] text) {
        try (BufferedWriter f = new BufferedWriter(new FileWriter("array.txt"))) {
            for (String str : text) {
                f.write(str + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
            logger.log(Level.WARNING, e.getMessage());
        }
    }
}
