package alapmuv;

import java.util.Scanner;
import java.util.Random;

public class AlapMuv {

    static String jatekosNev;
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
        if (muveletSzam == 2) { //kivonás
            a = rnd.nextInt(100) + 1;
            b = rnd.nextInt(100) + 1;
            System.out.printf("%d - %d = \n", a, b);
            valasz = sc.nextInt();
            if (valasz == a - b) {
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

        String pulloldle;
        Scanner sc = new Scanner(System.in);
        System.out.print("Szia! Hogy hívnak? ");

        jatekosNev = sc.nextLine();
        System.out.println("Üdvözöllek kedves " + jatekosNev);

        System.out.println("Ez a játék segít neked megtanulni a matematika 4 alap műveletét");
        boolean ujKor = true;

        do {
            System.out.print("Milyen műveletet szeretnél gyakorolni? [1] összeadás, [2] kivonás, [3] szorzás, [4] osztás: ");
            int jatekszama = sc.nextInt();
            if (jatekszama == 1) {
                System.out.println("Kezdődjön az összeadás!");
            } else if (jatekszama == 2) {
                System.out.println("Indulhat a kivonás!");
            } else if (jatekszama == 3) {
                System.out.println("Szorzás! Egyszerű mint az egyszer egy!");
            } else {
                System.out.println("Indulhat az osztás!");
            }
            muvelet(jatekszama);
            
            System.out.print("Szeretnél még egy kört? (I/N): ");
            String valasz = sc.nextLine();
            if(valasz == "N"){
                ujKor = false;
            }
        } while (ujKor);

    }
}
