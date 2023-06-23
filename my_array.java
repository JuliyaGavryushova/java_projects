// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
// максимальное количество подряд идущих 1.

public class my_array {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0 };
        System.out.println(getMax(array));
    }
    static int getMax(int[] array) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count++;
            } else {
                if (maxCount < count)
                    maxCount = count;
                count = 0;
            }
        }
        if (maxCount < count)
            maxCount = count;
        return maxCount;
    }
}