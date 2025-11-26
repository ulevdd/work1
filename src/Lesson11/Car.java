package Lesson11;

public class Car {
    public String color;
    public String engine;
    public int dver;


    public Car(String color, String engine, int dver) {

        this.color = color;
        this.engine = engine;
        this.dver = dver;
    }

}
     class CarTest {

         void newDver(Car dver1, int d1) {
             dver1.dver=d1;
         }
        public static void main(String[] args) {
                CarTest ct = new CarTest();
             Car car1 = new Car("red", "v3", 2);
            ct.newDver (car1, 4);
            System.out.println(car1.dver);
        }
    }


