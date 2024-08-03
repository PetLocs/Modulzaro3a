
package teszt;

import modell.Vonal;

public class TesztVonal {
    public static void main(String[] args) {
        tesztesetek();
    }

    private static void tesztesetek() {
        hibasHossz();
        hibasEltolas();
    }

    private static void hibasHossz() {
        nullasHossz();
        negativHossz();
    }

    private static void nullasHossz() {
        Vonal v0 = new Vonal(0);
        System.out.println(v0.getMegjelenes());
    }

    private static void negativHossz() {
         Vonal v1 = new Vonal(-1);
         System.out.println(v1.getMegjelenes());
    }

    private static void hibasEltolas() {
        Vonal v2 = new Vonal(1, -1);
        System.out.println(v2.getMegjelenes());
    }
}
