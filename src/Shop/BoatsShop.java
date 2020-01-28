package Shop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BoatsShop {
    public static void main(String[] args) {
        String[] boatsArray = new String[]{"WB360", "WB375", "WB430", "WB440", "WB485"};
        double[] priceArray = new double[]{82_500.0, 87_500.0, 94_000.0, 105_000.0, 185_000, 0};
        printShopMenu(); // 1 Напечататьтовар, 2 Добавить товар, 3 Купить товар, 4 Отсортировать, 5 , 6 сами , 0 Выход
        menuShop(boatsArray, priceArray);
        insertionSortAddPrice(boatsArray);


    }

    private static void insertionSortAddPrice(String[] boatsArray) {

    }

    private static void printShopMenu() {
        System.out.println("1. Вывести все Лодки в магазине. \n" + "2. Добавить Лодки. \n" + "3. Купить лодку. \n" +
                "4. Отсортировать по модели. \n" + "5. \n" + "6. \n" + "0. Убежать из магазина. \n");
    }

    private static void menuShop(String[] boats, double[] prices) {
        System.out.println("Выберите пункт меню: ");
        Scanner clientChoice = new Scanner(System.in);
        int menuNum = clientChoice.nextInt();

        while (menuNum != 0) {
            switch (menuNum) {
                case 1:
                    printAllBoats(boats, prices);
                    break;
                case 2:
                    boats = addBoatsName(boats, clientChoice);
                    break;
                case 3:
                    prices = addPrice(prices, clientChoice);
                    break;
                case 4:
                    boats = buyBoats(boats, clientChoice);
                    break;
//                case 5:
//                    holdOverBoats();
//                    break;
//                case 6:
//                    checkBoats();
//                    break;
//                case 7:
//                    goOut();
//                    break;
                default:
                    System.out.println("Введите число от 0 до 6.");
            }
            printShopMenu();
            menuNum = clientChoice.nextInt();
        }
    }

    private static String[] buyBoats(String[] boats, Scanner clientChoice) {
        String[] resBoatsArray = new String[boats.length - 1];
        System.out.println("Введите имя Лодки, для покупки");
        String productsName = clientChoice.next();
         int j = 0;
        for (int i = 0; i < boats.length; i++) {
            if (j == boats.length - 1){
                System.out.println("Такой модели лодки нет");
                return boats;
            }else if (!boats[i].equalsIgnoreCase(productsName)) {// исключая регистр букв
                resBoatsArray[j] = boats[i];
                j++;
            }

        }
        return resBoatsArray;
    }

    private static double[] addPrice(double[] pricesNewBoats, Scanner scanner) {
        int sizePrices = pricesNewBoats.length;
        double[] resPrices = new double[sizePrices + 1];
        System.out.println("Введите новую цену");
        double prices = scanner.nextDouble();
        for (int i = 0; i < sizePrices; i++) {
            resPrices[i] = pricesNewBoats[i];
        }
        resPrices[sizePrices] = prices;
        return resPrices;
    }


    private static String[] addBoatsName(String[] boatsNames, Scanner scanner) {
        int sizeBoatsName = boatsNames.length;
        String[] resBoatsName = new String[sizeBoatsName + 1];
        System.out.println("Ввыдите модель новой лодки");
        String name = scanner.next();
        for (int i = 0; i < sizeBoatsName; i++) {
            resBoatsName[i] = boatsNames[i];
        }
        resBoatsName[sizeBoatsName] = name;
        return resBoatsName;
    }

    private static void printAllBoats(String[] boats, double[] prices) {
        for (int i = 0; i < boats.length; i++) {
            System.out.println("Модель лодки: " + boats[i] + "цена: " + prices[i]);
        }
    }
}