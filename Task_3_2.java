// Задание 2.1: Заполнить список названиями планет Солнечной
// системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его
// повторений в списке.
// Задание состоит из двух блоков
// Задание 2.2: (если выполнено первое задание)
// Пройти по списку из предыдущего задания и удалить
// повторяющиеся элементы.

import java.util.ArrayList;
import java.util.Collections;

public class Task_3_2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Венера");
        list.add("Земля");
        list.add("Уран");
        list.add("Марс");
        list.add("Меркурий");
        list.add("Венера");
        list.add("Сатурн");
        list.add("Венера");
        list.add("Нептун");
        list.add("Земля");

        Collections.sort(list);
        String planet = list.get(0);
        int count = 1;
        for (int i = 0; i < list.size(); i++) {
            String n = list.get(i);
            if (n.equals(planet)) {
                count++;
            } else {
                System.out.println(planet + " - " + count);
                count = 1;
                planet = n;
            }
        }
        System.out.println(planet + " - " + count);

        planet = list.get(0);
        for (int i = 0; i < list.size();) {
            String curentPlanet = list.get(i);
            if (curentPlanet.equals(planet)) {
                list.remove(i);
            } else {
                planet = curentPlanet;
                i++;
            }
        }

        System.out.println(list);
    }
}
