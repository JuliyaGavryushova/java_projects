// 3. Дана json-строка (можно сохранить в файл и читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
// {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, 
// создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

public class Home_work_2_3 {
    public static void main(String[] args) {
        String students = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        String[] arrStudents = gettingArray(students);
        System.out.println(infoStudents(arrStudents));
    }

    public static String[] gettingArray(String str) {
        String str1 = str.replace("[", "");
        String str2 = str1.replace("]", "");
        String str3 = str2.replace("{", "");
        String str4 = str3.replace("}", "");
        String str5 = str4.replace("\"", "");
        String[] array = str5.split(",");
        return array;
    }

    public static StringBuilder infoStudents(String[] data) {
        StringBuilder result = new StringBuilder();
        for (int index = 0; index < data.length; index++) {
            if (index % 3 == 0) {
                result.append("\n");
            }
            String[] arrData = data[index].split(":");
            result.append(arrData[1]);
            result.append(" ");
        }
        return result;
    }
}
