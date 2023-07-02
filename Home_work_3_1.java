// 1. Реализовать алгоритм сортировки слиянием

import java.util.ArrayList;
import java.util.List;

public class Home_work_3_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(3);
        list.add(7);
        list.add(0);
        list.add(55);
        list.add(-3);
        System.out.println(list);
        System.out.println(mergeSort(list));
    }

    public static List<Integer> mergeSort(List<Integer> data) {
        int sizeData = data.size();
        if (sizeData == 1) {
            return data;
        }
        int middle = sizeData / 2;
        List<Integer> leftData = data.subList(0, middle);
        List<Integer> rightData = data.subList(middle, sizeData);
        leftData = mergeSort(leftData);
        rightData = mergeSort(rightData);
        return merge(leftData, rightData);
    }

    public static List<Integer> merge(List<Integer> leftData, List<Integer> rightData) {
        ArrayList<Integer> resultData = new ArrayList<>();
        int sizeLeft = leftData.size();
        int sizeRight = rightData.size();
        int i = 0;
        int j = 0;
        while (i < sizeLeft && j < sizeRight) {
            if (leftData.get(i) < rightData.get(j)) {
                resultData.add(leftData.get(i));
                i++;
            } else {
                resultData.add(rightData.get(j));
                j++;
            }
        }
        resultData.addAll(leftData.subList(i, sizeLeft));
        resultData.addAll(rightData.subList(j, sizeRight));
        return resultData;
    }
}