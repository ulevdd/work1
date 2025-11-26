package Lesson12.Home;

public class Student {

    String name;
    String city;
    int let;

    public Student(String name, String city, int let) {

        this.name = name;
        this.city = city;
        this.let = let;
    }

    public static void srav() {

        Student st1 = new Student("Ivan", "Moscow", 25);
        Student st2 = new Student("Dmitry", "Tambov", 30);

        if (st1.equals(st2)) {
            System.out.println("Студенты равны: " + st1.name + " и " + st2.name);
        }
        else {
            System.out.println("LOX");
        }
    }
}
        class StudentTest {

            public static void main(String[] args) {

                Student.srav();
            }


        }




