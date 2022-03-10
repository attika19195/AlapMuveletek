package alapmuv;

import java.util.Random;
import java.util.Scanner;

public class AlapMuv {
    static int joValasz = 0;
    static int rosszValasz = 0;
    static Random rnd = new Random();
    static Scanner sc = new Scanner(System.in);
    static int a, b, valasz;
    
    public static void statisztika(){
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
        statisztika();
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
     
