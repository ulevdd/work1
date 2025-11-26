package HomeWork2;

public class HomeOver {

    int a;
    int b;
    int c;
    int d;

    int summ () {
        int result = 0;
        System.out.println("Сумма: "  + result);
        return result;
    }

int summ (int a){

        int result1= a;
    System.out.println("Сумма: "  + result1);
        return result1;
}

int summ (int a, int b){

        int result2= a+b;
    System.out.println("Сумма: "  + result2);
        return  result2;
    }

    int summ (int a, int b, int c){
        int result3= a+ b+ c;
        System.out.println("Сумма: "  + result3);
        return result3;
    }

    }

 class HomeOverTest {

     public static void main(String[] args) {

         HomeOver summaTr =new HomeOver();
         summaTr.summ();
         summaTr.summ(3);
         summaTr.summ(1,3);
         summaTr.summ(5,6,7);



     }

 }






