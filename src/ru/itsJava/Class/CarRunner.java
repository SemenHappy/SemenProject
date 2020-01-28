package ru.itsJava.Class;

public class CarRunner {
    public static void main(String[] args) {
        Car semenCar = new Car ("black", "BMW",  2009);
        System.out.println("Semen's Car" +  semenCar.toString());

        Car vitalikCar = new Car ("null", "null",  2009);
        System.out.println("Semen's Car" +  vitalikCar.toString());

        Car sedanCar = new Car ("null", "null",  2009);
        System.out.println("Semen's Car" +  sedanCar.toString());

        Car hetchbackCar = new Car ("null", "null",  2009);
        System.out.println("Semen's Car" +  hetchbackCar.toString());
        
        Car cabrioletCar = new Car ("null", "null",  2009);
        System.out.println("Semen's Car" +  cabrioletCar.toString());

        Car busCar = new Car ("null", "null",  2009);
        System.out.println("Semen's Car" +  busCar.toString());
    }
}
