package Lesson8;

public class Student {

    String name;
    int course;
    static int count;
    int a;

    public Student (String name1, int course1){
        count++;
        name= name1;
        course=course1;
        System.out.println("Student №" + count + " Создан");
    }

    public static void showCount ()
    {
        System.out.println("Всего студентов: " + count);
    }

    public void showInfo (){
        System.out.println("Welcome to the student class!!!");
    }




    void abc (){
        a++;
        count++;


    }

   static void abcd (){

        Student st2 = new Student ("petr", 1);
        st2.a++;


   }

    public static void main(String[] args) {

    }


}

class StudentTest {



}