
package main;
import java.util.Scanner;
import modell.MindentTudoGep;

public class OOProgram {    
    
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        MindentTudoGep gep0 = new MindentTudoGep();
        System.out.println("Kérem válasszon módot!\nLottószelvény (1)\nTotószelvény (2)\nZenecím (3)");
        int mod = sc.nextInt();
        switch (mod) {
            case 1:
                System.out.println(gep0.getLotto());
                break;
            case 2:
                System.out.println(gep0.getToto());
                break;
            case 3:
                System.out.println(gep0.getZeneCim());
                break;
            default:
                System.out.println("Nem megfelelő menüpont!");
                break;
        }
    }
}
