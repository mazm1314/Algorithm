package learn;

import java.util.Arrays;

/**
 * 选择排序
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] data = {2, 1, 4, 6, 4, 3, 8, 0, 65, 23};
        int[] arr = Select(data);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    public static int[] Select(int[] arr) {
        if (arr == null) {
            return arr;
        }
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            int minshort = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[minshort] > arr[j]) {
                    minshort = j;
                }
            }
            if (minshort != i) {
                int temp = arr[i];
                arr[i] = arr[minshort];
                arr[minshort] = temp;
            }
            System.out.println("第"+(i+1)+"次循环之后的效果"+ Arrays.toString(arr));
        }
        return arr;
    }
}
