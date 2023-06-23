import java.util.Scanner;

public class input_name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Cp866");
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        System.out.println("Привет," + name + "!");
        scanner.close();
    }
}
