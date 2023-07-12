// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
//  отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, 
//  соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев
// - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Notebook {
    String brand; // бренд ноутбука
    String model; // модель ноутбука
    int serialNumber; // серийный номер ноутбука
    String color; // цвет ноутбука
    int ram; // оперативная память ноутбука
    int hdd; // объем ЖД
    String os; // операционная система

    public Notebook(String brand, String model, int serialNumber, String color, int ram, int hdd, String os) {
        this.brand = brand;
        this.model = model;
        this.serialNumber = serialNumber;
        this.color = color;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
    }

    public String getBrandNotebook() {
        return brand;
    }

    public String getModelNotebook() {
        return model;
    }

    public int getSerialNumberNotebook() {
        return serialNumber;
    }

    public String getColorNotebook() {
        return color;
    }

    public int getRamNotebook() {
        return ram;
    }

    public int getHddNotebook() {
        return hdd;
    }

    public String getOsNotebook() {
        return os;
    }

    @Override
    public String toString() {
        return "Бренд: " + brand + ", модель: " + model;
    }
}

public class HardwareStore {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("Acer", "Nitro 5 AN515-57", 3455, "черный", 16, 512, "Windows");
        Notebook notebook2 = new Notebook("Apple", "MacBook Air 13", 1234, "серый", 8, 256, "macOS");
        Notebook notebook3 = new Notebook("ASUS", "M1502IA-BQ093", 5561, "черный", 16, 512, "Windows");
        Notebook notebook4 = new Notebook("ASUS", "M1503IA-BQ", 5561, "белый", 8, 256, "Windows");

        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);

        Map<Integer, Object> parameters = getCriteria();
        Set<Notebook> filterNotebook = getNotebook(parameters, notebooks);
        for (Notebook notebook : filterNotebook) {
            System.out.println(notebook);
        }
    }

    public static Map<Integer, Object> getCriteria() {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, Object> criteria = new HashMap<>();

        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - бренд ноутбука");
        System.out.println("2 - модель ноутбука");
        System.out.println("3 - серийный номер ноутбука");
        System.out.println("4 - цвет ноутбука");
        System.out.println("5 - оперативная память ноутбука");
        System.out.println("6 - объем жесткого диска");
        System.out.println("7 - операционная система");
        System.out.println("Сколько критериев будете вводить?");

        // int count = scanner.nextInt();
        try {
            int count = scanner.nextInt();
            if (count >= 1 && count < 8) {
                for (int i = 0; i < count; i++) {
                    System.out.println("Введите цифру, соответствующую необходимому критерию:");
                    int num = scanner.nextInt();

                    switch (num) {
                        case 1:
                            System.out.println("Введите бренд ноутбука:");
                            String brnd = scanner.next();
                            criteria.put(num, brnd);
                            break;
                        case 2:
                            System.out.println("Введите модель ноутбука:");
                            String mdl = scanner.next();
                            criteria.put(num, mdl);
                            break;
                        case 3:
                            System.out.println("Введите серийный номер ноутбука:");
                            int srlNum = scanner.nextInt();
                            criteria.put(num, srlNum);
                            break;
                        case 4:
                            System.out.println("Введите цвет ноутбука:");
                            String clr = scanner.next();
                            criteria.put(num, clr);
                            break;
                        case 5:
                            System.out.println("Введите минимальную оперативную память:");
                            int rm = scanner.nextInt();
                            criteria.put(num, rm);
                            break;
                        case 6:
                            System.out.println("Введите минимальный объем жесткого диска:");
                            int hd = scanner.nextInt();
                            criteria.put(num, hd);
                            break;
                        case 7:
                            System.out.println("Введите операционную систему:");
                            String sys = scanner.next();
                            criteria.put(num, sys);
                            break;
                        default:
                            System.out.println("Вы ввели некорректный критерий!");
                            break;
                    }
                }
            } else {
                System.out.println("Вы не можете ввести больше 7-ми критериев!");
            }
        } catch (Exception e) {
            System.out.println("Вы ввели некорректные данные!");
        }
        scanner.close();
        return criteria;
    }

    public static Set<Notebook> getNotebook(Map<Integer, Object> criteria, Set<Notebook> notebooks) {
        Set<Notebook> filter = new HashSet<>();

        for (Notebook notebook : notebooks) {
            boolean pass = true;

            for (Map.Entry<Integer, Object> entry : criteria.entrySet()) {
                int keyCriteria = entry.getKey();
                Object valueCriteria = entry.getValue();

                switch (keyCriteria) {
                    case 1:
                        if (!notebook.getBrandNotebook().equalsIgnoreCase((String) valueCriteria)) {
                            pass = false;
                        }
                        break;
                    case 2:
                        if (!notebook.getModelNotebook().equalsIgnoreCase((String) valueCriteria)) {
                            pass = false;
                        }
                        break;
                    case 3:
                        if (notebook.getSerialNumberNotebook() != (int) valueCriteria) {
                            pass = false;
                        }
                        break;
                    case 4:
                        if (!notebook.getColorNotebook().equalsIgnoreCase((String) valueCriteria)) {
                            pass = false;
                        }
                        break;
                    case 5:
                        if (notebook.getRamNotebook() < (int) valueCriteria) {
                            pass = false;
                        }
                        break;
                    case 6:
                        if (notebook.getHddNotebook() < (int) valueCriteria) {
                            pass = false;
                        }
                        break;
                    case 7:
                        if (!notebook.getOsNotebook().equalsIgnoreCase((String) valueCriteria)) {
                            pass = false;
                        }
                        break;
                }

                if (pass) {
                    filter.add(notebook);
                } else {
                    break;
                }
            }
        }
        if (filter.isEmpty()) {
            System.out.println("Подходящего ноутбука нет");
        }
        return filter;
    }
}
