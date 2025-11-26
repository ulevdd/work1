package Lesson3;

public class Car {





    String color;
    String eng;
    int speed;

    int gaz(int skorost){
        speed+=skorost;
        return  speed;
    }

    int tor(int skorost){
        speed-=skorost;
        return speed;
    }

    void showInfo() {

        System.out.println("Цвет: "+color + " Мотор: " + eng + " Скорость: " + speed);


    }

}

class Car2test {

    public static void main(String[] args) {

        Car c1= new Car();
        c1.color= "Whiite";
        c1.eng= "V6";
        c1.speed= 60;

        c1.showInfo();
        c1.gaz(50);
        c1.showInfo();
        c1.tor(14);
        c1.showInfo();
    }

}
