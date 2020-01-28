package ru.itsJava.Class;

public class Car {
    private String color;
    private String name;
    private int year;
    // Конструктор
    public Car(String sColor, String sName, int sYear){
        color = sColor;
        name = sName;
        year = sYear;
    }
    public String toString(){
        return "Name: " + name + ", Color: " + color + ", Year: " + year;
    }
}
