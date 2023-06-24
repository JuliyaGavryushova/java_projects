// Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
// Если общего префикса нет, вернуть пустую строку

public class longest_str {
    public static void main(String[] args) {
        String[] str = { "flower", "flow", "floight" };
        System.out.println(prefix(str));
    }

    static String prefix(String[] data) {
        String result = "";
        Character ch;
        int index = 0;
        while (true) {
            if (index == data[0].length()) {
                return result;
            }
            ch = data[0].charAt(index);
            for (String str : data) {
                if (index == str.length()) {
                    return result;
                }
                if (ch != str.charAt(index)) {
                    return result;
                }
            }
            result += ch;
            index++;
        }
    }
}
