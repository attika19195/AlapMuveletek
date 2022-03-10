
package alapmuv;

import java.util.Scanner;

public class AlapMuv {
    static String jatekosNev;
    public static void main(String[] args) {
        String pulloldle; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Szia! Hogy hívnak?: ");
        
        jatekosNev = sc.nextLine();
        System.out.println("Üdvözöllek kedves: " + jatekosNev); 
        
        
        System.out.println("Ez a játék segít neked megtanulni a matematika 4 alap műveletét");
        
        System.out.println("Mivel szeretnél kezdeni? [1] összeadás, [2] kivonás, [3] szorzás, [4] osztás: ");
        int jatekszama = sc.nextInt();
        if(jatekszama == 1){
            System.out.println("Kezdődjön az összeadás!");
        }
        else if(jatekszama == 2){
            System.out.println("Indulhat a kivonás!");
        }
        else if(jatekszama == 3){
            System.out.println("Szorzás! Egyszerű mint az egyszer egy!");
        }
        else{
            System.out.println("Indulhat az osztás!");
        }
               
    }
    
}
