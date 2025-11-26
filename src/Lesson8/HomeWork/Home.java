package Lesson8.HomeWork;

public class Home {

    static int umn (int a, int b, int c){
         return a*b*c;
    }

    static void del (int a, int b){
        System.out.println(a/b +"," + a % b);

    }

        }
class HomeTest {

    public static void main (String[] args) {

        System.out.println(Home.umn(1,3,5));
        Home.del(6,4);
    }

    }