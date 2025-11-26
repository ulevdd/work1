package bank;

public class BankTest {

    int id;
    String name;
    double balance;

    public static void main(String[] args) {

        BankTest bA = new BankTest();
        BankTest bB = new BankTest();
        BankTest bC = new BankTest();

        bA.id= 1;
        bA.name= "Dmitriy";
        bA.balance = 14.33;
        System.out.println("ID:" + " " +  bA.id);
        System.out.println("Имя:" + " " + bA.name);
        System.out.println("Сумма:" + " " + bA.balance);

 }

}

class  Test {

    public static void main(String[] args) {

        //Переменные = вызов функции
        BankTest bA = new BankTest();
        BankTest bB = new BankTest();
        BankTest bC = new BankTest();

        //Первый юзер
        bA.id=1;
        bA.name= "Dmitriy";
        bA.balance = 14.33;


        //Вывод на экран
        System.out.println("ID:" + " " +  bA.id);
        System.out.println("Имя:" + " " + bA.name);
        System.out.println("Сумма:" + " " + bA.balance);



    }

}