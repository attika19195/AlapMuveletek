package alapmuv;

import java.util.Scanner;
import java.util.Random;

public class AlapMuv {

    static String jatekosNev;
    static int joValasz;
    static int rosszValasz;
    static Random rnd = new Random();
    static Scanner sc = new Scanner(System.in);
    static int valasz;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner isc = new Scanner(System.in);
        System.out.print("Szia! Hogy hívnak? ");

        jatekosNev = sc.nextLine();
        System.out.println("Üdvözöllek kedves " + jatekosNev);

        System.out.println("Ez a játék segít neked megtanulni a matematika 4 alap műveletét");
        boolean ujKor = true;

        while (ujKor) {
            int jatekszama;
            do {
                System.out.print("Milyen műveletet szeretnél gyakorolni? [1] összeadás, [2] kivonás, [3] szorzás, [4] osztás: ");
                jatekszama = isc.nextInt();
            } while (jatekszama < 1 || 4 < jatekszama);

            if (jatekszama == 1) {
                System.out.println("Kezdődjön az összeadás!");
            } else if (jatekszama == 2) {
                System.out.println("Indulhat a kivonás!");
            } else if (jatekszama == 3) {
                System.out.println("Szorzás! Egyszerű mint az egyszer egy!");
            } else if (jatekszama == 4) {
                System.out.println("Indulhat az osztás!");
            }
            muvelet(jatekszama);

            System.out.print("Szeretnél még egy kört? (I/N): ");
            String valasz = sc.nextLine();
            valasz = valasz.toUpperCase();

            while (!valasz.equals("N") && !valasz.equals("I")) {
                System.out.print("Nem jót írtál be, újra: (I/N): ");
                valasz = sc.nextLine();
                valasz = valasz.toUpperCase();
            }

            ujKor = !valasz.equals("N");

        }
        statisztika();
    }

    public static void statisztika() {
        double szazalek = 0.0;
        int osszesValasz = joValasz + rosszValasz;
        if (joValasz != 0) {
            szazalek = ((double) joValasz / osszesValasz) * 100.0;
        }

        String atment = "Gratulálok elértél egy eléggé jó százalékot, szerintem nem szükséges további gyakorlás";
        if (szazalek < 80.0) {
            atment = "Sajnos ez még nem lesz elég, gyakorolj még egy picit.";
        }
        System.out.println("------------------------------------------------------------");
        System.out.printf("%s játékos statisztikái:\n", jatekosNev);
        System.out.printf("Az összes kérdés amit megpróbáltál megválaszolni:\t%d\n", osszesValasz);
        System.out.printf("\t Ebből jó válaszok száma:\t%d\n", joValasz);
        System.out.printf("\t Ebből rossz válaszok száma:\t%d\n", rosszValasz);
        System.out.printf("\t\t És az elért százalékod:\t%.1f\n", szazalek);
        System.out.printf("%s\n", atment);
        System.out.println("------------------------------------------------------------");
    }

    public static void muvelet(int muveletSzam) {
        int a, b;
        a = rnd.nextInt(100) + 1;
        b = rnd.nextInt(100) + 1;

        if (muveletSzam == 1) {
            Osszeadas(a, b);
        } else if (muveletSzam == 2) {
            Kivonas(a, b);
        } else if (muveletSzam == 3) {
            while (!Nagyobb_E_Mint_100_Szorzasnal(a, b)) {
                a = rnd.nextInt(100) + 1;
                b = rnd.nextInt(100) + 1;
            }
            Szorzas(a, b);
        } else {
            while (!Oszhato_E_Nem_Maradekosan_Osztasnal(a, b)) {
                a = rnd.nextInt(100) + 1;
                b = rnd.nextInt(100) + 1;
            }
            Osztas(a, b);
        }
    }

    public static void Osszeadas(int a, int b) {
        do {
            a = rnd.nextInt(100) + 1;
            b = rnd.nextInt(100) + 1;

        } while (!Nagyobb_E_Mint_100_Osszeadasnal(a, b));
        System.out.printf("%d + %d = \n", a, b);
        valasz = sc.nextInt();
        int muvelet = a + b;
        Helyes_E_A_Valasz(a, b, valasz, muvelet);
    }

    public static void Kivonas(int a, int b) {
        /*Értékek megcserélése ha kell*/
        if (a < b) {
            int c;
            c = a;
            a = b;
            b = c;
        }
        System.out.printf("%d - %d = \n", a, b);
        valasz = sc.nextInt();
        int muvelet = a - b;
        Helyes_E_A_Valasz(a, b, valasz, muvelet);
    }

    public static void Szorzas(int a, int b) {
        System.out.printf("%d * %d = \n", a, b);
        valasz = sc.nextInt();
        int muvelet = a * b;
        Helyes_E_A_Valasz(a, b, valasz, muvelet);
    }

    public static void Osztas(int a, int b) {
        System.out.printf("%d : %d = \n", a, b);
        valasz = sc.nextInt();
        int muvelet = a / b;
        Helyes_E_A_Valasz(a, b, valasz, muvelet);
    }

    public static boolean Oszhato_E_Nem_Maradekosan_Osztasnal(int a, int b) {
        int c;
        if (a < b) {
            c = a;
            a = b;
            b = c;
        } else {
            if (a % b == 0) {
                return true;
            }
        }
        return false;

    }

    public static boolean Nagyobb_E_Mint_100_Szorzasnal(int a, int b) {
        return 100 >= a * b;
    }

    public static boolean Nagyobb_E_Mint_100_Osszeadasnal(int a, int b) {
        return 100 >= a + b;
    }

    public static void Helyes_E_A_Valasz(int a, int b, int valasz, int muvelet) {
        if (valasz == muvelet) {
            joValasz++;
        } else {
            rosszValasz++;
        }
    }
}
