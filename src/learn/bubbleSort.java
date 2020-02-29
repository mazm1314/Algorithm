package learn;

public class bubbleSort {

    public static void main(String[] agrs) {
        int[] arr = {2, 9, 2, 6, 10, 1, 0, 21};
        int[] data = Sort(arr);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ", ");
        }
    }

    /**
     * 冒泡算法
     */
    public static int[] Sort(int[] arr) {
        if (arr == null)
            return arr;
        int len = arr.length;
        //i控制循环次数，长度为len数据只循环len-1次  i的起始值为0所以是len-1次
        for (int i = 0; i < len - 1; i++) {
            //由于是两个数比较，所以为了[j+1]不越界，j<len-i-1
            for (int j = 0; j < len - i - 1; j++) {
                //如果前一个数比后一个大，则交换位置
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
