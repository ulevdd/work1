package Lesson3;

public class Employe {
    //Конструктор
    Employe (int id, String name, int age, double salary) {
        id1=id;
        name1=name;
        age1= age;
        salary1=salary;
    }
    //Переменные
    int id1;
    String name1;
    int age1;
    double salary1;

    //Умножить ЗП
    void plusSalary() {
        salary1=salary1*2;

    }

}

    class EmployeeTest {
            public static void main(String[] args) {
            Employe h = new Employe(1, "Dmitriy", 29, 359.44);
            h.plusSalary();
            Employe h1 = new Employe(3, "Vasya", 33, 1994.33);
            h1.plusSalary();
            System.out.println(h.id1+  " " + " " +h.name1 + " "+   h.age1 + " "+ h.salary1);
            System.out.println(h1.id1+  " " + " " +h1.name1 + " "+   h1.age1 + " "+ h1.salary1);
        }



    }




