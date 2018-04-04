package sort;

import java.util.Arrays;

/**
 * BubbleSort
 *
 * @author ckkim on 2018-03-29
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] sortArr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        System.out.println(Arrays.toString(sort(sortArr)));
    }

    public static int[] sort(int[] sortArr) {

        int temp = 0;
        for(int i = 0; i < sortArr.length; i++) {
            for(int j = 1; j < sortArr.length-i; j++) {
                if(sortArr[j] < sortArr[j-1]) {
                    temp = sortArr[j-1];
                    sortArr[j-1] = sortArr[j];
                    sortArr[j] = temp;
                }
            }
        }
        return sortArr;
    }
}
