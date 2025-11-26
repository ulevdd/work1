package Lesson9;

public class Car {


    String color;
    String eng;
    static int count;

    public Car(String color1, String eng1) {


        count++;
        color = color1;
        eng = eng1;

    }

    public void showColor() {

        System.out.println("Цвет машины: " + color);
    }


    public void changeColor(String color3) {

        int price = 5000;
        color = color3;
        price += 1000;
        System.out.println("Цвет машины изменился: " + color);
        System.out.println("Новая цена: " + price);

    }
}


