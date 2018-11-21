package com.company;

public class Runner {

    public static void main(String[] args) {
        int[] randIntArr = randomIntArr(100);
        String stringArr = "";
        for (int i = 0; i < randIntArr.length; i++)
        {
            stringArr = stringArr + randIntArr[i] + ", ";
        }
        System.out.println("Random Integer Array: " + stringArr);

        long time = System.nanoTime();
        mergeSort.mergeSort(randIntArr);
        System.out.println();
        System.out.print("Merge Sort: ");
        for (int i = 0; i < randIntArr.length; i++)
        {
            System.out.print(randIntArr[i] + " ");
        }
        System.out.println();
        time = System.nanoTime() - time;
        System.out.println("Merge Sort Time Taken: " + time + " nanoseconds");
    }

    public static int[] randomIntArr(int num)
    {
        int [] arr = new int [num];
        for (int i = 0; i < num; i++)
        {
            int rand = (int)((Math.random() * 1000) );
            arr[i] = rand;
        }
        return arr;
    }
}
