package sort;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * QuickSort
 *
 * @author ckkim on 2018-04-10
 */
public class QuickSort {

    public static void main(String[] args) {

        int[] sortArr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        LinkedList<Integer> resultArr = new LinkedList<>();
        for(int sort : sortArr)
            resultArr.add(sort);
        System.out.println(    sort(resultArr)    );
        int i = 0;
    }

    private static List<Integer> sort(List<Integer> sortArr) {
        if(sortArr.size() <= 1) return sortArr;

        int pivot = sortArr.size()-1;
        int left = 0;
        int right = pivot-1;

        while(left < right) {

            if(sortArr.get(left) > sortArr.get(pivot)) {
                int temp = sortArr.get(left);
                sortArr.add(pivot+1, temp);
                sortArr.remove(left--);
                pivot--;
            }
            if(sortArr.get(right) > sortArr.get(pivot)) {
                int temp = sortArr.get(right);
                sortArr.remove(right++);
                sortArr.add(pivot, temp);
                pivot--;
            }
            left++;
            right--;

            if(left >= right
                    && sortArr.get(left) > sortArr.get(pivot)) {
                int temp = sortArr.get(left);
                sortArr.set(left, sortArr.get(pivot));
                sortArr.set(pivot, temp);
            }

        }


        sort(sortArr.subList(0, pivot));
        sort(sortArr.subList(pivot+1, sortArr.size()));

        return sortArr;
    }


}
