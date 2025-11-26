package Lesson8;

public class Car {

    String color = "Blue";
    String eng = "V8";


}


class  Humman {

    String name= "Ivan";
    Car c = new Car();

    public static void main(String[] args) {

        Humman h1 = new Humman();
        h1.c = new Car();
        h1.c = new Car();
        h1.c.eng = "V6";



    }



}