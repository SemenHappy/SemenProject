package ru.itsmine.sort;

import java.util.Arrays;
import java.util.Random;

public class insertionSort {
    public static void main(String[] args) {
        Random rand = new Random(); // создаем новый массив
        int[] array = new int[10]; // определяем длину массива
        for (int i = 0; i < 10; i++) { // пробегаемся по всему массиву
            array[i] = rand.nextInt(20); // определяем диапазон случайных чисел
            System.out.println(Arrays.toString(array));}
//            int[] array = {1, 6, 3, 4, 9, 8, 2, 7, 22};
//            System.out.println(Arrays.toString(array));


            for (int left = 0; left < array.length; left++) {
                int value = array[left];
                int i = left - 1;
                for (; i >= 0; i--) {
                    if (value < array[i]) {
                        array[i + 1] = array[i];
                    } else {
                        break;
                    }

                }
                array[i + 1] = value;
            }
            System.out.println(Arrays.toString(array));
        }
    }

