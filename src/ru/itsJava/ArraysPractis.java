package ru.itsJava;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractis {
    public static void main(String[] args) {
//        int n = 5;
//        if (n >= 0) {
//            int factorial = 1;
//            for (int i = n; i > 1; i--) {
//                factorial = factorial * i;
//            }
//            System.out.println("Факториал числа: " + n + " = " + factorial);
//        } else {
//            System.out.println("Факториал не определен");
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число: ");
//        int numIn = scanner.nextInt();
//
//        System.out.println("Наше число: " + numIn);
//
//        int numForWhile = scanner.nextInt();
//        while (numForWhile > 0) {
//            System.out.println("Я люблю Java: ");
//            numForWhile--;
//        }

        //       int num1 = scanner.nextInt();
//        while (num1 )
        // Задача на факториал цикд while
        // Найти сумму цифр числа: 538 = 5+ 3+ 8=16
        // Пользователь вводит числа до тех пор пока не введет 7

        // задаем размер массива
        System.out.println("Введите размер массива: ");
        Scanner console = new Scanner(System.in);
        int arraySize = console.nextInt();
        // создаем массив целых чисел
        int[] array = new int[arraySize];
        // считываем каждое значение с клавиатыры
        System.out.println("Введите элементы массива :");
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Введите" + i + " элемент:");
            array[i] = console.nextInt();
        }
        // вывод массива
        // System.out.println(array); //на самомо деле вызов метода toString()
        System.out.println("Печать массива :");
        for (int i = 0; i < arraySize; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
        // сумма всех элементов массива
        System.out.println("Сумма всех элементов :");
        int elementsSum = array[0];
        for (int i = 1; i < arraySize; i++) {
            elementsSum += array[i];
        }
        System.out.println(elementsSum);
        System.out.println("Сумма четных элементов: ");
        int evenElemntsSum = array[0];
        for (int i = 0; i < arraySize; i += 2) {
            evenElemntsSum += array[i];
        }
        System.out.println(evenElemntsSum);

        System.out.println("Произведение нечетных элементов: ");
        int oddElemntsMult = array[0];
        for (int i = 1; i < arraySize; i += 2) {
            oddElemntsMult *= array[i];
        }
        System.out.println(oddElemntsMult);

        // Найти максимальный элемент массива
        System.out.println("Максимальный элемент массива :");
        int maxElement = array[0];
        int maxElement1 = array[0];
        for (int i = 1; i < arraySize; i++) {
            int elem = array[i];
            int elem1 = array[i];
            if (elem > maxElement) {
                maxElement1 = maxElement;
                maxElement = elem;
            } else if (elem1 != elem && elem1 > maxElement) {
                maxElement1 = elem1;
            }
        }
        System.out.println("Первый макс. элемент: " + maxElement + " " + "Второй макс. элемент: " + maxElement1);
        System.out.println("Сумма двух макс. элементов: " + (maxElement + maxElement1));


        System.out.println("Минимальный элемен массива :");
        int minElement = array[0];
        int minIndex = 0;
        for (int i = 1; i > arraySize; i--) {
            int elem1 = array[i];
            if (elem1 < minElement) {
                minElement = elem1;
                minIndex = i;
            }
        }
        System.out.println(minElement);
        System.out.println("Идекс min: " + minIndex);
        // Сумма четных элементов массива


    }
}

