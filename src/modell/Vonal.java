package modell;

public class Vonal {

   private int hossz;
   private int eltolas;
   private String szin;
   private String stilus;
   private enum Szinek {PIROS, KEK, ZOLD};
   private enum Stilusok {SZIMPLA, DUPLA, PONT};
    
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
        this.hossz = hossz;
        this.eltolas = eltolas;
        this.szin = szin.name();
        this.stilus = stilus.name();
    }

    
    
}
