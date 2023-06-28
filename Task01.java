// Задание №1
// Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает boolean значения)

public class Task01 {
    public static void main(String[] args) {
        String str = "Abcdedcba";
        System.out.println(isItPalindrom(str));
    }

    public static boolean isItPalindrom(String st) {
        st = st.toUpperCase();
        for (int index = 0; index < st.length() / 2; index++) {
            if (st.charAt(index) != st.charAt(st.length() - 1 - index)) {
                return false;
            }
        }
        return true;
    }
}
