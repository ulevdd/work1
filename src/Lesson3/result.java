package Lesson3;

public class result {

    int summaT(int a, int b) {

        int result = a + b;
        return result;
    }

    int srAr(int a1, int b1){
        int result2 = summaT(a1, b1)/2;
        return result2;

    }

}
    class summat1 {
        public static void main(String[] args) {

            result R = new result();
            int sumT= R.summaT(3, 2);
            System.out.println(sumT);
            System.out.println(R.summaT(1,14));
            System.out.println(R.srAr(4,6));
        }
    }





