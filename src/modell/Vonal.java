package modell;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Vonal {

   private int hossz = 1;
   private int eltolas;
   private String szin;
   private String stilus;
   private enum Szinek {PIROS, KEK, ZOLD};
   private enum Stilusok {SZIMPLA, DUPLA, PONT};
   private final String RED_ANSI = "\\u001b[31m";
   private final String GREEN_ANSI = "\\u001b[32m";
   private final String BLUE_ANSI = "\\u001b[34m";
   private final char SZIMPLA = '-';
   private final char DUPLA = '=';
   private final char PONT = '.';
   private final String EXP1 = "Egy vonal nem jött létre, mert nem létező a hossz!";
   private final String EXP2 = "Egy vonal nem jött létre, mert nem létező az eltolás!";
   private final String EXP3 = "Egy vonal nem jött létre, mert nem létező a szín!";
   private final String EXP4 = "Egy vonal nem jött létre, mert nem létező a stílus!";
   private String megjelenes = "";
    
    public Vonal(int hossz) {        
        this(hossz, 0, Szinek.KEK, Stilusok.SZIMPLA);        
    }
    public Vonal(int hossz, int eltolas) {
        this(hossz, eltolas, Szinek.KEK, Stilusok.SZIMPLA);
    }
    public Vonal(int hossz, int eltolas, Szinek szin) {
        this(hossz, eltolas, szin, Stilusok.SZIMPLA);
    }
    public Vonal(int hossz, int eltolas, Stilusok stilus) {
        this(hossz, eltolas, Szinek.KEK, stilus);
    }
    public Vonal(int hossz, int eltolas, Szinek szin, Stilusok stilus) {
        setHossz(hossz);
        setEltolas(eltolas);
        setSzin(szin);
        setStilus(stilus);
    }
    
    private void setHossz(int hossz){
        if (hossz < 1) {
            try {
                throw new Exception(EXP1);
            } catch (Exception ex) {
                Logger.getLogger(Vonal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.hossz = hossz;
    }
    
    public int getEltolas(){
        return this.eltolas;
    }
    
    public void setEltolas(int eltolas){
        if (eltolas < 0) {
            try {
                throw new Exception(EXP2);
            } catch (Exception ex) {
                Logger.getLogger(Vonal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.eltolas = eltolas;
    }
    
    public String getSzin(){
        return this.szin;
    }
    
    public void setSzin(Szinek szin){
        switch (szin) {
            case PIROS:
                megjelenes += RED_ANSI;
                break;
            case KEK:
                megjelenes += BLUE_ANSI;
                break;
            case ZOLD:
                megjelenes += GREEN_ANSI;
                break;
            default:
            {
                try {
                    throw new Exception(EXP3);
                } catch (Exception ex) {
                    Logger.getLogger(Vonal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }
    
    public String getStilus(){
        return this.stilus;
    }
    
    public void setStilus(Stilusok stilus){
        switch (stilus) {
            case SZIMPLA:
                for (int i = 0; i < this.hossz; i++) {
                    megjelenes += SZIMPLA;
                }
                break;
            case DUPLA:
                for (int i = 0; i < this.hossz; i++) {
                    megjelenes += DUPLA;
                }
                break;
            case PONT:
                for (int i = 0; i < this.hossz; i++) {
                    megjelenes += PONT;
                }
                break;
            default:
                {
                try {
                    throw new Exception(EXP4);
                } catch (Exception ex) {
                    Logger.getLogger(Vonal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
