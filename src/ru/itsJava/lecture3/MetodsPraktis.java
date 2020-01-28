package ru.itsJava.lecture3;

public class MetodsPraktis {
    public static void main(String[] args) {
        int max45 = maxValue(5, 4);
        System.out.println(max45);

        int max57 = maxValue(5, 7);
        System.out.println(max57);
        System.out.println("Максимум из 10 и 7 :" + maxValue(10, 7));
        System.out.println("Минимум из 10 и 7 :" + minValue(10, 7));
        printValue(5);

    }

    public static int maxValue(int num1, int num2) {
//        int max;
//        if (num1 > num2) {
//            max = num1;
//        } else {
//            max = num2;
//        }
//        return max;
        if (num1 > num2) {
            return num1;
        }
        return num2;
    }

    // public static int minValue(int num1, int num2){
//        if (num1 < num2) {
//            return num1;
//        }
//        return num2;
    //   }
    public static int minValue(int num1, int num2) {
        return Math.min(num1, num2);
    }

    public static void printValue(int value) {
        System.out.println(value);
    }
    }
