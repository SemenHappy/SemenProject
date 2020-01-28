package ru.itsJava.lecture8;

public class CatHouse {
    public static void main(String[] args) {
//        Cat barsik = new Cat();
//        Lion nala = new Lion();
//        Puma addidas = new Puma();
//
//        barsik.sayMeow();
//        nala.sayMeow();
//        addidas.sayMeow();


        Cat barsik = new Cat();
        Cat nala = new Lion();
        Cat addidas = new Puma();
        Puma famousPuma = new Puma();
        Cat black = new BlackCat();

        barsik.sayMeow();
        nala.sayMeow();
        addidas.sayMeow();
        // addidas.sayPuma() <- ошибка компеляции
        famousPuma.sayPuma();
        black.sayMeow();
    }
}
