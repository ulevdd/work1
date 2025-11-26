package Lesson3;

public class Car5 {

    Car5 (String cvet, String motor) {
        System.out.println("BMW");
        color=cvet;
        eng= motor;

    }

    String color;
    String eng;

}

class Car5Test {

    public static void main(String[] args) {
        Car5 car1= new Car5("White", "V6");

        System.out.println("Цвет: "+ car1.color);
        System.out.println("Мотор: "+ car1.eng);


    }

}