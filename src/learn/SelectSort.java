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
            //j控制比较次数，因为每次循环结束之后最小的数已经放在了最开始的地方
            //所以下一次循环的时候可以跳过这个数，所以j的初始值为i+1，
            for (int j = i + 1; j < len; j++) {
                //比较每一次都需要将较小的下标记录下来
                if (arr[minshort] > arr[j]) {
                    minshort = j;
                }
            }
            //当完成一次循环后，就需要将本次循环选取最小的值移动到本次最开始的地方
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
