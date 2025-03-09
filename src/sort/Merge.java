package sort;

import java.util.Arrays;

class MergeSortSolution {
    public int[] mergeSort(int[] arr, int l, int r) {
        //Base case: empty array or one-element array
        if (l == r)
            return arr;

        //Get middle
        int m = (l+r)/2;

        mergeSort(arr, l, m);
        mergeSort(arr, m+1, r);
        merge(arr, l, m, r);

        return arr;
    }

    private void merge(int[] arr, int L, int M, int R) {
        //Take left & right half of the array
        var left = Arrays.stream(arr, L, M+1).toArray();
        var right = Arrays.stream(arr, M+1, R+1).toArray();

        //iPointer corresponds to the start of the arr
        //jPointer & kPointer corresponds to the start of both sub arrays
        int iPointer = L;
        int jPointer = 0, kPointer = 0;

        while (jPointer < left.length && kPointer < right.length) {
            if (left[jPointer] <= right[kPointer]) {
                arr[iPointer] = left[jPointer];
                jPointer += 1;
            } else {
                arr[iPointer] = right[kPointer];
                kPointer += 1;
            }
            iPointer += 1;
        }

        while (jPointer < left.length) {
            arr[iPointer] = left[jPointer];
            jPointer += 1;
            iPointer += 1;
        }

        while (kPointer < right.length) {
            arr[iPointer] = right[kPointer];
            kPointer += 1;
            iPointer += 1;
        }
    }
}

public class Merge {
    public static void main(String[] args) {
        var solution = new MergeSortSolution();
        var arr = new int[] {8, 3, 2, 9};

        solution.mergeSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.printf("%d", i);
        }
    }
}
