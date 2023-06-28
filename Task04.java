// Задание №4
// Напишите метод, который составит строку, состоящую из 100 повторений
// слова TEST и метод, который запишет эту строку в простой текстовый файл,
// обработайте исключения

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Task04 {
    public static void main(String[] args) {
        String str = "TEST";
        int count = 100;
        writingFile(repeatStr(str, count));
    }

    public static String repeatStr(String st, int n) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            res.append(st);
        }
        return res.toString();
    }

    public static void writingFile(String text) {
        try (BufferedWriter f = new BufferedWriter(new FileWriter("output.txt"))) {
            f.write(text);
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
}
