package sort;

import java.util.Arrays;

/**
 * InsertionSort
 *
 * @author ckkim on 2018-04-02
 */
public class InsertionSort {

    public static void main(String[] args) {

        int[] sortArr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        System.out.println(Arrays.toString(sort(sortArr)));
    }

    private static int[] sort(int[] sortArr) {

        for(int i = 1; i < sortArr.length; i++) {
            int insertTemp = sortArr[i];
            int idx = i-1;
            while(idx >= 0 && sortArr[idx] > insertTemp) {
                sortArr[idx+1] = sortArr[idx];
                idx--;
            }
            sortArr[idx+1] = insertTemp;
        }
        return sortArr;
    }
}
