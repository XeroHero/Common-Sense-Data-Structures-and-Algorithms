package dev.xerohero;

public class SortArray {

    public static void main(String[] args) {
        int[] unsorted = {7, 3, 75, 22, 18, 50, 97};
        sortcorrect(unsorted);
//        int[] sorted = sort(unsorted);

//        for (int n : sorted) {
//            System.out.println(n);
        }

    private static void sortcorrect(int[] unsorted) {

        for (int i = 1; i < unsorted.length; i++) {
            for (int j = i; j > 0; j--) {
                if (unsorted[j] < unsorted[j - 1]) {
                    sort(unsorted, j);
                }
            }
        }
        printArray(unsorted);
    }

    private static void printArray(int[] array) {
        for (int j : array) {
            System.out.println(j);
        }
    }

    private static void sort(int[] array, int j) {
        int temp;
        temp = array[j];
        array[j] = array[j - 1];
        array[j - 1] = temp;
    }

    private static int[] sort(int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            int currentElem;
            currentElem = array[i];
            int nextElement = array[i + 1];

            if (nextElement < currentElem) {
                swapElements(array, i);
            }

        }
        return array;
    }

    private static void swapElements(int[] array, int i) {
        int tmp = array[i];
        array[i] = array[i + 1];
        array[i + 1] = tmp;
    }


}