package com.company;

public class mergeSort {
    public static void mergeSort(int[] arr)
    {
        int n = arr.length;
        int[] temp = new int [n];
        mergeSortHelper(arr, 0, n-1, temp);
    }

    public static void mergeSortHelper(int[] arr, int left, int right, int[] temp)
    {
        if (left < right)
        {
            int mid = (left + right) / 2;
            mergeSortHelper(arr, left, mid, temp);
            mergeSortHelper(arr, mid+1, right, temp);
            merge(arr, left, mid, right, temp);
        }
    }

    private static void merge(int[] elements,
                              int from, int mid, int to, int[] temp)
    {
        int i = from;
        int j = mid + 1;
        int k = from;
        while (i <= mid && j <= to)
        {
            if (elements[i] < elements[j])
            {
                temp[k] = elements[i];
                i++;
            }
            else
            {
                temp[k] = elements[j];
                j++;
            }
            k++;
        }

        while (i <= mid)
        {
            temp[k] = elements[i];
            i++;
            k++;
        }
        while (j <= to)
        {
            temp[k] = elements[j];
            j++;
            k++;
        }
        for (k = from; k <= to; k++)
        {
            elements[k] = temp[k];
        }
    }
}
