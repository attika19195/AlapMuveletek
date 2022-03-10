package alapmuv;

import java.util.Random;
import java.util.Scanner;

public class AlapMuv {
    static int joValasz = 0;
    static int rosszValasz = 0;
    static Random rnd = new Random();
    static Scanner sc = new Scanner(System.in);
    static int a, b, valasz;

    public static void statisztika(int a) {

    }

    private static void muvelet(int muveletSzam) {
        int a, b, valasz;

        if (muveletSzam == 1) { //összeadás
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
        if (muveletSzam == 3) { //szorzás
            a = rnd.nextInt(100) + 1;
            b = rnd.nextInt(100) + 1;
            System.out.printf("%d * %d = \n", a, b);
            valasz = sc.nextInt();
            if (valasz == a * b) {
                joValasz++;
            } else {
                rosszValasz++;
            }
        }
    }

    public static void main(String[] args) {
        statisztika(1);
    }
    private static void Ertek_Felcsereles_Kivonasnal(int a, int b) {
        int c;
        if (a < b) {
            c = a;
            a = b;
            b = c;
        }

    }
    
    
    private static boolean Oszhato_E_Nem_Maradekosan_Osztasnal(int a, int b) {
        int c;
        if (a < b) {
            c = a;
            a = b;
            b = c;
        }else{
            if(a%b==0){
                return true;
            }    
        }
        return false;

    }
}
     
