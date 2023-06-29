// 1. Дана строка sql-запроса "select * from students where ". 
// Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

public class Home_work_2_1 {
    public static void main(String[] args) {
        String user = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String[] arrUser = gettingArray(user);
        System.out.println(sqlQuery(arrUser));
    }

    public static String[] gettingArray(String str) {
        String str1 = str.replace("{", "");
        String str2 = str1.replace("}", "");
        String str3 = str2.replace("\"", "");
        String[] array = str3.split(", ");
        return array;
    }

    public static StringBuilder sqlQuery(String[] data) {
        StringBuilder result = new StringBuilder("SELECT * FROM students WHERE ");
        for (int index = 0; index < data.length; index++) {
            String[] arrData = data[index].split(":");
            if (arrData[1].equals("null") == false) {
                if (index == 0) {
                    result.append(arrData[0]);
                    result.append(" = ");
                    result.append("'" + arrData[1] + "'");
                } else {
                    result.append(" AND ");
                    result.append(arrData[0]);
                    result.append(" = ");
                    result.append("'" + arrData[1] + "'");
                }
            }
        }
        return result;
    }
}
