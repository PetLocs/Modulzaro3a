
package modell;

import java.util.Arrays;

public class MindentTudoGep {
    
    private String lotto = "";
    private String toto = "";
    private String zeneCim = "";
    private static final int L = 5;
    private int[] lottoTomb = new int[L];
    private static final int T = 14;
    private int[] totoTomb = new int[T];
    private String[] zenek = new String[] {"Deep Purple - Smoke On The Water", "Celine Dion - My Hearth Will Go On", "Sub Bass Monster - Négyütem", "Tom Jones - It's Not Unusual", "Új..."};
    
    public MindentTudoGep(){
        
    }

    public String getLotto() {
        lottoTombFeltoltes();
        duplikacioEllenorzes();
        rendezes();
        lottoStringbefuzes();
        return this.lotto;
    }

    private void lottoStringbefuzes() {
        for (int i = 0; i < lottoTomb.length; i++) {
            if (i == lottoTomb.length - 1) {
                this.lotto += lottoTomb[i] + ".";
            } else {
                this.lotto += lottoTomb[i] + ", ";
            }
        }
    }

    private void rendezes() {
        Arrays.sort(lottoTomb, 0, lottoTomb.length);
    }

    private void duplikacioEllenorzes() {
        for (int i : lottoTomb) {
            for (int j : lottoTomb) {
                if (i == j) {
                    j = rnd(1, 90);
                }
            }
        }
    }

    private void lottoTombFeltoltes() {
        for (int i = 0; i < lottoTomb.length; i++) {
            lottoTomb[i] = rnd(1, 90);
        }
    }

    private int rnd(int min, int max) {
        return (int)(Math.random()*max + min);
    }

    public String getToto() {
        fejlec();
        totoTombFeltoltes();
        lablec();
        return this.toto;
    }

    private void lablec() {
        this.toto += "eredmények: ";
        for (int i = 0; i < totoTomb.length; i++) {            
            if (i == totoTomb.length - 1) {
                this.toto += "   " + xreModosit(totoTomb[i]) + " ";
            }else if (i > 8 && i < totoTomb.length - 1) {
                this.toto += " " + xreModosit(totoTomb[i]) + " ";
            }else{
                this.toto += xreModosit(totoTomb[i]) + " ";
            }
        }
    }

    private void totoTombFeltoltes() {
        for (int i = 0; i < totoTomb.length; i++) {
            totoTomb[i] = rnd(1, 3);
        }
    }

    private void fejlec() {
        this.toto += "mérkőzések: ";
        for (int i = 0; i < T-1; i++) {
            this.toto+= i+1 + " ";
        }
        this.toto += "13+1\n";
    }
    
    private String xreModosit(int szam){
        if (szam == 3) {
            return "X";
        }else{
            return String.valueOf(szam);
        }
    }

    public String getZeneCim() {
        for (int i = 0; i < zenek.length; i++) {
            zeneCim += zenek[i] + "\n";
        }
        return this.zeneCim;
    }
    
    
}
