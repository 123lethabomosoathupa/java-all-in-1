/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quicksortapp;

/**
 *
 * @author letha
 */
public class QuickSortApp {

    public static void main(String[] args) {
        int LEN = 100;
        int[] unsorted = new int[LEN];
        for (int i = 0; i < LEN; i++) {                         //This for loop gives the array 100 random values.
            unsorted[i]
                    = (int) (Math.random() * 100) + 1;
        }
        System.out.println("Unsorted array:");
        printArray(unsorted);                                   //To print the unsorted array, the printArray method is used.

        int[] sorted = sort(unsorted);                          //The array is sorted by calling the sort function.

        System.out.println("\n\nSorted array:");
        printArray(sorted);

    }

    private static void printArray(int[] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 10) {
                System.out.print(" ");
            }
            System.out.print(array[i] + " ");
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
    }
    private static int[] a;                                     // A static variable named a is used to hold the array while it is being sorted.

    public static int[] sort(int[] array) {
        a = array;
        sort(0, a.length - 1);
        return a;
    }

    public static void sort(int low, int high) {
        if (low >= high) {
            return;
        }
        int p = partition(low, high);
        sort(low, p);
        sort(p + 1, high);
    }

    public static int partition(int low, int high) {            //The partition method is explained in detail in the preceding section.
        int pivot = a[low];
        int i = low - 1;
        int j = high + 1;
        while (i < j) {
            for (i++; a[i] < pivot; i++);
            for (j--; a[j] > pivot; j--);
            if (i < j) {
                swap(i, j);
            }
        }
        return j;
    }

    public static void swap(int i, int j) {                     //The swap method simply exchanges the two indicated values.
        a[i] ^= a[j];
        a[j] ^= a[i];
        a[i] ^= a[j];
    }
}
