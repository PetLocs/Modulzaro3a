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
   private final String EXP = "Egy vonal nem jött létre, mert nem létező a hossz!";   
    
    public Vonal(int hossz) {        
        this(hossz, 0, Szinek.KEK, Stilusok.SZIMPLA);        
    }
    public Vonal(int hossz, int eltolas) {
        this(hossz, eltolas, Szinek.KEK, Stilusok.SZIMPLA);
    }
    public Vonal(int hossz, int eltolas, Szinek szin) {
        this(hossz, eltolas, szin, Stilusok.SZIMPLA);
    }
    public Vonal(int hossz, int eltolas, Szinek szin, Stilusok stilus) {
        setHossz(hossz);
        setEltolas(eltolas);
        this.szin = szin.name();
        this.stilus = stilus.name();
    }
    
    private void setHossz(int hossz){
        if (hossz < 1) {
            try {
                throw new Exception(EXP);
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
            eltolas = 0;
        }
        this.eltolas = eltolas;
    }
    
    public String getSzin(){
        return this.szin;
    }
    
    public String getStilus(){
        return this.stilus;
    }
}
