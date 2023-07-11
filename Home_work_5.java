// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре 
// будут повторяющиеся имена с разными телефонами, их необходимо считать,
//  как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Home_work_5 {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("8900055555", "Иванов");
        phoneBook.put("8900055554", "Петров");
        phoneBook.put("8900055553", "Иванов");
        phoneBook.put("8900055552", "Сидоров");
        phoneBook.put("8900055551", "Васильев");
        phoneBook.put("8900055550", "Васильев");
        phoneBook.put("8900055558", "Иванов");

        List<String> values = new ArrayList<>(phoneBook.values());
        Collections.sort(values);

        LinkedHashMap<String, String> sortedMap = new LinkedHashMap<>();

        for (String value : values) {
            for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                if (entry.getValue().equals(value)) {
                    sortedMap.put(entry.getKey(), entry.getValue());
                }
            }
        }

        for (Map.Entry<String, String> entry : sortedMap.entrySet()) {
            System.out.println("Номер телефона: " + entry.getKey() + ", Фамилия: " +
                    entry.getValue());
        }

    }
}
