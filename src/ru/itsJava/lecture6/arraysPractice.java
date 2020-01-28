package ru.itsJava.lecture6;

import java.util.Arrays;

public class arraysPractice {
    public static void main(String[] args) {
        int[] array = new int[]{10, 5, 8, 6, 4, 2};
        System.out.println(Arrays.toString(array));
        for (int j = 1; j < array.length; j++) {

            for (int i = 0; i < array.length -j; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(array));
//        System.out.println();
//        for (int i = 0; i < array.length ; i++) {
//            System.out.println(array[i] + "");
        System.out.println(factorial(5));

    }

    public static int factorial(int n){
        if ((n==1)||(n==0)){
            return 1;
        }
        return n * factorial(n-1);
    }
    int[] homeArray = new int[]{5,8,99,44,56,2,4,7};

}

