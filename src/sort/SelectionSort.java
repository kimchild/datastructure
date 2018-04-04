package sort;

import java.util.Arrays;

/**
 * BubbleSort
 *
 * @author ckkim on 2018-03-29
 */
public class SelectionSort {

    public static void main(String[] args) {

        int[] sortArr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        System.out.println(Arrays.toString(sort(sortArr)));
    }

    public static int[] sort(int[] sortArr) {

        int selectIdx;
        int temp;
        for(int i = 0; i < sortArr.length; i++) {
            temp = sortArr[i];
            selectIdx = i;
            for(int j = 1+i; j < sortArr.length; j++) {
                if(temp > sortArr[j]) {
                    selectIdx = j;
                    temp = sortArr[j];
                }
            }
            sortArr[selectIdx] = sortArr[i];
            sortArr[i] = temp;
        }
        return sortArr;
    }
}
