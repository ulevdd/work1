package Lesson12;

public class Car {
    int engine;
    int dorCount;

    Car(int engine, int dorCount) {

        this.engine = engine;
        this.dorCount = dorCount;

    }
}
    class CarTest {
        public static void main(String[] args) {

            Car c1 = new Car(1, 2);
            Car c2 = new Car(7, 6);

            if (c1.engine > c2.engine) {
                if (c1.dorCount > c2.dorCount) {
                    System.out.println("1 mashina kruche");
                } else {
                    System.out.println("dveri menshe");
                }
            }
            else{
                    System.out.println("cheto eshe");
                }

            }

        }




