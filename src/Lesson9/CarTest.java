package Lesson9;

class CarTest {

        public static void main(String[] args) {
            Car car= new Car("White", "V6");
            System.out.println(Car.count);
            car.showColor();
            car.changeColor("Red");

            Car car1= new Car("Black", "V7");
            System.out.println("");
            System.out.println(Car.count);
            car1.showColor();
            car1.changeColor("Yellow");


        }


    }
