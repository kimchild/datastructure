package sort;

import java.util.Arrays;

/**
 * BubbleSort
 *
 * @author ckkim on 2018-03-29
 */
public class MergeSort {

    public static void main(String[] args) {

        int[] sortArr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        System.out.println(Arrays.toString(sort(sortArr)));
    }

    private static int[] sort(int[] sortArr) {
        if (sortArr.length <= 1) return sortArr;

        int[] mergeLeft = sort(Arrays.copyOfRange(sortArr, 0, sortArr.length/2));
        int[] mergeRight = sort(Arrays.copyOfRange(sortArr, sortArr.length/2, sortArr.length));

        int[] resultArr = new int[mergeLeft.length+mergeRight.length];
        int lt = 0, rt = 0;
        for(int i = 0; i < resultArr.length; i++) {
            if(lt >= mergeLeft.length) {
                resultArr[i] = mergeRight[rt++];
            } else if(rt >= mergeRight.length
                    || mergeLeft[lt] < mergeRight[rt]) {
                resultArr[i] = mergeLeft[lt++];
            } else {
                resultArr[i] = mergeRight[rt++];
            }
        }


        return resultArr;
    }


}
