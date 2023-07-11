// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Task_5_2 {
    public static void main(String[] args) {
        String str1 = "a+(d*3)";
        String str2 = "[a+(1*3)";
        String str3 = "[6+(3*3)]";
        String str4 = "{a}[+]{(d*3)}";
        String str5 = "<{a}+{(d*3)}>";
        String str6 = "{a+]}{(d*3)}";
        System.out.println(str1);
        System.out.println(checkBrackets(str1));
        System.out.println(str2);
        System.out.println(checkBrackets(str2));
        System.out.println(str3);
        System.out.println(checkBrackets(str3));
        System.out.println(str4);
        System.out.println(checkBrackets(str4));
        System.out.println(str5);
        System.out.println(checkBrackets(str5));
        System.out.println(str6);
        System.out.println(checkBrackets(str6));

    }

    public static boolean checkBrackets(String str) {
        Map<Character, Character> data = new HashMap<>();
        data.put(')', '(');
        data.put(']', '[');
        data.put('}', '{');
        data.put('>', '<');

        Stack<Character> stack = new Stack<>();
        for (Character ch : str.toCharArray()) {
            System.out.println(ch);
            if (data.containsValue(ch)) {
                System.out.println("Добавили в стек" + " " + ch);
                stack.push(ch);
            } else if (data.containsKey(ch)) {
                char c = stack.peek();
                if (stack.isEmpty() || stack.pop() != data.get(ch)) {
                    System.out.println("Удалили из стека" + " " + c);
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
