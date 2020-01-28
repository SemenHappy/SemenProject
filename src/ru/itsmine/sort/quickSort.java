package ru.itsmine.sort;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] array = new int[]{5, 6, 4, 8, 9, 2, 1, 3, 7, 55, 66, 44, 22};
        System.out.println(Arrays.toString(array));
                quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] arr, int from, int to) {
        if (from < to) {
            int divideIndex = partition(arr, from, to);
            quickSort(arr, from, divideIndex - 1);
            quickSort(arr, divideIndex, to);


            }
        }


    private static int partition(int[] arr, int from, int to) {
        // создаем две переменных индекса
        int rightIndex = to; //конец массива
        int leftIndex = from; // начало массива
        // переменная начала массива (может быть любой) в данном случае идем с начало массива
        // для того что бы взять с середины массива пишем arr [from + (from-to)/2]
        int pivot = arr[from + (to - from)/2];
        while (arr[leftIndex] <= rightIndex) {
            while (arr[leftIndex] < pivot){   // до тех пор пока не найдем элемент pivot болше опорного leftIndex
                leftIndex++;
        }
        while (arr[rightIndex] > pivot) { // ищем элем в правой части который будет меньше опорного
            rightIndex--;
        }
        if (leftIndex <= rightIndex) {
            swap(arr, rightIndex, leftIndex);
            leftIndex++;
            rightIndex--;
        }
    }
        return leftIndex;
}

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array [index1] = array [index2];
        array [index2] = temp;
    }

}