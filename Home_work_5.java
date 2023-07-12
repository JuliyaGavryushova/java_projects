// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре 
// будут повторяющиеся имена с разными телефонами, их необходимо считать,
//  как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Home_work_5 {
    public static void main(String[] args) {
        HashMap<String, List<String>> phoneBook = new HashMap<>();
        addContact(phoneBook, "Иванов", "8900055555");
        addContact(phoneBook, "Петров", "8900055554");
        addContact(phoneBook, "Иванов", "8900055553");
        addContact(phoneBook, "Сидоров", "8900055552");
        addContact(phoneBook, "Васильев", "8900055551");
        addContact(phoneBook, "Васильев", "8900055550");
        addContact(phoneBook, "Иванов", "8900055558");

        sortedPhoneBook(phoneBook);
    }

    public static void addContact(HashMap<String, List<String>> phoneBook, String name, String number) {
        if (phoneBook.containsKey(name)) {
            List<String> numbers = phoneBook.get(name);
            numbers.add(number);
        } else {
            List<String> numbers = new ArrayList<>();
            numbers.add(number);
            phoneBook.put(name, numbers);
        }
    }

    public static void sortedPhoneBook(HashMap<String, List<String>> phoneBook) {
        List<Map.Entry<String, List<String>>> list = new ArrayList<>(phoneBook.entrySet());
        list.sort((entry1, entry2) -> entry2.getValue().size() - entry1.getValue().size());

        for (Map.Entry<String, List<String>> entry : list) {
            String name = entry.getKey();
            List<String> numbers = entry.getValue();
            String listNumbers = numbers.toString();
            listNumbers = listNumbers.substring(1, listNumbers.length() - 1);
            System.out.println("Имя: " + name + ", Телефоны: " + listNumbers);
        }
    }
}
