package _00_common_grammar;

import java.util.Arrays;

public class _09_ArraySort {
    public static void main(String[] args) {
        /**
         * 冒泡排序
         */
        int[] array1 = new int[]{4, 1, 7, 2, 9, 3, 5, 8, 6};
        for (int i = 0; i < array1.length - 1; i++) {
            for (int j = 0; j < array1.length - i - 1; j++) {
                if (array1[j] > array1[j + 1]) {
                    int tem = array1[j];
                    array1[j] = array1[j + 1];
                    array1[j + 1] = tem;
                }
            }
        }
        System.out.println("冒泡排序：" + Arrays.toString(array1));

        /**
         * 选择排序
         */
        int[] array2 = new int[]{4, 1, 7, 2, 9, 3, 5, 8, 6};
        for (int i = 0; i < array2.length; i++) {
            for (int j = i + 1; j < array2.length; j++) {
                if (array2[i] > array2[j]) {
                    int tem = array2[i];
                    array2[i] = array2[j];
                    array2[j] = tem;
                }
            }
        }
        System.out.println("选择排序：" + Arrays.toString(array1));
    }
}
