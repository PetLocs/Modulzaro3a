
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
    
    public MindentTudoGep(int mod){
        getLotto();
        //getToto();
        //zene();
    }

    public String getLotto() {
        lottoTombFeltoltes();
        duplikacioEllenorzes();
        rendezes();
        for (int i = 0; i < lottoTomb.length; i++) {
            this.lotto += lottoTomb[i] + ", ";
        }
        return this.lotto;
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

    public void getToto() {
        toto += "mérkőzések: ";
        for (int i = 0; i < T; i++) {
            toto+= i+1 + " ";
        }
        toto += "13+1";
    }
}
