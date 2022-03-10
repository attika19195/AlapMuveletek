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

    public static void main(String[] args) {
        statisztika();
    }

    public static void statisztika() {
        String jatekosNev = "Marikanéni";
        int osszesValasz = joValasz + rosszValasz;
        double szazalek = (rosszValasz / joValasz) * 100;
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

    private static void muvelet(int muveletSzam) {
        int a, b, valasz;

        switch (muveletSzam) {
            case 1:
                //összeadás
                a = rnd.nextInt(100) + 1;
                b = rnd.nextInt(100) + 1;
                int c;
                if (a < b) {
                    c = a;
                    a = b;
                    b = c;
                }
                System.out.printf("%d + %d = \n", a, b);
                valasz = sc.nextInt();
                if (valasz == a + b) {
                    joValasz++;
                } else {
                    rosszValasz++;
                }
                break;
            case 2:
                //kivonás
                a = rnd.nextInt(100) + 1;
                b = rnd.nextInt(100) + 1;
                System.out.printf("%d - %d = \n", a, b);
                valasz = sc.nextInt();
                if (valasz == a - b) {
                    joValasz++;
                } else {
                    rosszValasz++;
                }
                break;
            case 3:
                //szorzás
                do {
                    a = rnd.nextInt(100) + 1;
                    b = rnd.nextInt(100) + 1;

                } while (!Nagyobb_E_Mint_100_Szorzasnal(a, b));

                System.out.printf("%d * %d = \n", a, b);
                valasz = sc.nextInt();
                if (valasz == a * b) {
                    joValasz++;
                } else {
                    rosszValasz++;
                }
                break;

            case 4:
                //osztás
                do {
                    a = rnd.nextInt(100) + 1;
                    b = rnd.nextInt(100) + 1;
                } while (!Oszhato_E_Nem_Maradekosan_Osztasnal(a, b));

                System.out.printf("%d : %d = \n", a, b);
                valasz = sc.nextInt();
                if (valasz == a / b) {
                    joValasz++;
                } else {
                    rosszValasz++;
                }

        }

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

<<<<<<< HEAD
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
=======
    public static boolean Nagyobb_E_Mint_100_Szorzasnal(int a, int b) {
        if (100 < a * b) {
            return false;
        }
        return true;
>>>>>>> 66cd8baf6881d3f7b7bf3527f76df0b622d71996

    }
}
