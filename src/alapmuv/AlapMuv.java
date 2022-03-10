
package alapmuv;

public class AlapMuv {
    static int joValasz=10;
    static int rosszValasz=4;
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
        System.out.printf("\t\t És az elért százalékod: %.1f\n", szazalek);
        System.out.println("------------------------------------------------------------");
    }
    private static void muvelet(int muveletSzam) {
        
    }
    
    public static void main(String[] args) {
        statisztika();
    } 
}
