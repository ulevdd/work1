package HomeWork1;

public class Student {

    int numS;
    String fName;
    String lName;
    int year;
    double m;
    double ec;
    double eng;
    double srO;


}
        class StudentTest {
            public static void main(String[] args) {


                Student st1 = new Student();
                Student st2 = new Student();
                Student st3 = new Student();


                st1.numS = 1;
                st1.fName = "Dmitriy";
                st1.lName = "Ulyev";
                st1.year= 2017;
                st1.m= 9.0;
                st1.ec= 6.3;
                st1.eng= 3.1;


                System.out.println("Номер: "+ st1.numS);
                System.out.println("Имя: "+ st1.fName);
                System.out.println("Фамиля: " + st1.lName);
                System.out.println("Год: "+ st1.year);
                System.out.println("Ср. Балл: "+ (st1.m+st1.ec+st1.eng)/3);


            }





        }