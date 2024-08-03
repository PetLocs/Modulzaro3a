
package modell;

public class MindentTudoGep {
    
    private String lotto = "";
    private String toto = "";
    private String zeneCim = "";
    private static final int L = 5;
    private static final int T = 13;
    
    public MindentTudoGep(int mod){
        lotto();
        toto();
        zene();
    }

    private void lotto() {
        for (int i = 0; i < L; i++) {
            if (i < L - 1) {
                lotto += (Math.random() * 90 + 1) + ", ";
            }else{
                lotto += (Math.random() * 90 + 1) + ".";
            }
        }
    }
}
