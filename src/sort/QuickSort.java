package sort;

import java.util.Arrays;

/**
 * QuickSort
 *
 * @author ckkim on 2018-04-10
 */
public class QuickSort {

    public static void main(String[] args) {

        int[] sortArr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        System.out.println(Arrays.toString(sort(sortArr, 0, sortArr.length-1)));
    }

    /**
     * 이해가 오래걸려서 위키로 소스코드를 짜봄.
     * 코드를 보면서 좀더 이해해보고 직접 짜봐야겠다.
     * @return int[]
     */
    private static int[] sort(int[] arr, int left, int right) {
        int i, j, pivot, tmp;

        if(left < right) {
            i = left;
            j = right;
            pivot = arr[left];
            //분할
            while(i < j) {
                while(arr[j] > pivot) j--;
                while(i < j && arr[i] <= pivot) i++;
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
            arr[left] = arr[i];
            arr[i] = pivot;

            //정렬
            sort(arr, left, i-1);
            sort(arr, i+1, right);
        }

        return arr;
    }


}
