// 4. (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. 
// Предложить хотя бы одно решение или сообщить, что его нет.

public class Home_work_1_4 {
    public static void main(String[] args) {
        String equation = "2? + ?5 = 69";
        String[] data = equation.split(" ");
        String[] ch1 = data[0].split("");
        String[] ch2 = data[2].split("");
        String ch3 = data[4];
        int digit1 = Integer.parseInt(ch1[0]);
        int digit2 = Integer.parseInt(ch2[1]);
        int digit3 = Integer.parseInt(ch3);
        RestoreEquation(digit1, digit2, digit3);
    }

    static void RestoreEquation(int dig1, int dig2, int dig3) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j < 9; j++) {
                if ((dig1 * 10 + i) + (j * 10 + dig2) == dig3) {
                    System.out.println((dig1 * 10 + i) + " + " + (j * 10 + dig2) + " = " + dig3);
                }
            }
        }

    }
}
