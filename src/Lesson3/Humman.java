package Lesson3;

public class Humman {

    String name;
    Car3 car;
    BankAccount bA;



    void info() {

        System.out.println("Imya: " + name + " Cvet auto: " + car.color + " Balance: "+ bA.balance);
        System.out.println("Зарплата уменьшена : "+ bA.balance);

    }
}
    class HummanTest {


        public static void main(String[] args) {

            Humman n = new Humman();
            n.name= "Dmitriy";
            n.car = new Car3 ("red", "v4");
            n.bA = new BankAccount(13, 50);

            n.info();
        }


    }


class Car3 {

    Car3 (String cvet, String motor){

        color=cvet;
        eng= motor;
    }

    String color;
    String eng;
}

class BankAccount {

    //Инфо
    int id;
    double balance;

    BankAccount(int id2, double balance2) {

        id = id2;
        balance = balance2;
    }
    //+balance
    void plusB (double plus){
        balance+=plus;
    }

    //-balance
    void minusB (double minus){
        balance-=minus;
    }
}


