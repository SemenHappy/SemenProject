package ru.itsJava.lecture3;

import java.util.Scanner;

public class ArraysMethodPractice {
    public static void main(String[] args) {
        int[] array = createInArray();
        int[] array2 = new int[2];
        System.out.println("Размер массива: " + arrayLength(array));
        System.out.println("Размер массива: " + arrayLength(array2));
    }

    public static int[] createInArray() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = console.nextInt();
        return new int[size];
    }
    public static int arrayLength(int[] array) {
        return array.length;
    }
}
// Написать метод для произведения всех элементов массива
// Печать массва printArray(array);