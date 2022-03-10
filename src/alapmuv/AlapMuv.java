package alapmuv;

import java.util.Random;
import java.util.Scanner;

public class AlapMuv {

    static int joValasz = 0;
    static int rosszValasz = 0;
    static Random rnd = new Random();
    static Scanner sc = new Scanner(System.in);
    static int a, b, valasz;

    private static void muvelet(int muveletSzam) {
        int a, b, valasz;

        if (muveletSzam == 1) {
            a = rnd.nextInt(100) + 1;
            b = rnd.nextInt(100) + 1;
            System.out.printf("%d + %d = \n", a, b);
            valasz = sc.nextInt();
            if (valasz == a + b) {
                joValasz++;
            } else {
                rosszValasz++;
            }
        }
    }

    public static void main(String[] args) {
        String pulloldle;
    }

}
