package ru.itsJava.lecture5;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 4, 5, 6};
        System.out.println("Исходный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        switchIntArray(0, 1, array);

        System.out.println("\nМассив после смены индексов: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        switchIntoNewArray(0, 1, array);
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void switchIntArray(int index1, int index2, int[] array) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static void switchIntoNewArray(int index1, int index2, int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i == index1) {
                newArray[i] = array[index2];
            } else if (i == index2) {
                newArray[i] = array[index2];
            } else {
                newArray[i] = array[i];
            }
            array = newArray;
        }

        }

}
