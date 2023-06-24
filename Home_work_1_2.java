// 2. Вывести все простые числа от 1 до 1000

public class Home_work_1_2 {
    public static void main(String[] args) {
        PrimeNumbers(1000);
    }

    static void PrimeNumbers(Integer num) {
        int count = 0;
        for (int i = 2; i <= num; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count += 1;
                }
            }
            if (count == 0) {
                System.out.printf(i + " ");
            }
            count = 0;
        }
    }
}
