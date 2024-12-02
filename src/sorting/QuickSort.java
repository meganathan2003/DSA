package sorting;

import java.nio.file.ClosedWatchServiceException;
import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {

            int pivot = partition(arr, start, end);

            // call the quicksort method twice for two divide two partition
            quickSort(arr, start, pivot - 1);
            quickSort(arr, pivot + 1, end);


        }

    }

    // Create a another method called
    private static int partition(int[] arr, int start, int end) {

        int pivot = arr[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {

            if (arr[j] < pivot) {
                i++;

                // Swap two values
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // if nothing value lesser than pivot
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        int[] arr = {8, 10, 1, 2, 54, 21, 22};

        quickSort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }


    }
}
