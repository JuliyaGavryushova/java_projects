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

// Сортировка слиянием

// public class Home_work_3_1 {
// public static void main(String[] args) {
// int[] array = { 9, 3, 7, 0, 2, 4, 55, 11, 1 };
// mergeSort(array);
// printArray(array);
// }

// public static void mergeSort(int[] arr) {
// int n = arr.length;
// if (n == 1) {
// return;
// }
// int mid = n / 2;
// int[] leftArr = new int[mid];
// int[] rightArr = new int[n - mid];

// for (int i = 0; i < mid; i++) {
// leftArr[i] = arr[i];
// }

// for (int j = mid; j < n; j++) {
// rightArr[j - mid] = arr[j];
// }

// mergeSort(leftArr);
// mergeSort(rightArr);
// merge(arr, leftArr, rightArr);
// }

// public static void merge(int[] arr, int[] leftArr, int[] rightArr) {
// int left = leftArr.length;
// int right = rightArr.length;
// int i = 0;
// int j = 0;
// int idx = 0;

// while (i < left && j < right) {
// if (leftArr[i] <= rightArr[j]) {
// arr[idx] = leftArr[i];
// i++;
// idx++;
// } else {
// arr[idx] = rightArr[j];
// j++;
// idx++;
// }
// }

// while (i < left) {
// arr[idx] = leftArr[i];
// i++;
// idx++;
// }

// while (j < right) {
// arr[idx] = rightArr[j];
// j++;
// idx++;
// }
// }

// public static void printArray(int arr[]) {
// System.out.print("[");
// for (int i = 0; i < arr.length; i++) {
// if (i == arr.length - 1) {
// System.out.print(arr[i] + "]");
// } else {
// System.out.print(arr[i] + ", ");
// }
// }
// }
// }