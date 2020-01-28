package ru.itsJava.lecture6;

public class StringPractice {
    public static void main(String[] args) {
        String str = "Я строка, я учу джава";
        System.out.println(str.length());
        System.out.println("Первый символ строки" + str.charAt(0));
        String[] stringArray = str.split(" ");
        System.out.println("Вывод массива строк построчно");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(i + ": " + stringArray[i]); // ctrl + Q документация на метод


        }
        System.out.println("For each");
        for (String string : stringArray) {
            System.out.println(string);

        }

    }
}
