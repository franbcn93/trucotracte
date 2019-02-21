/*
 * Classe que defineix l'opció de joc tracte. Un tracte es defineix per l'infant
 * i la casa que formaran part del tracte, i el total de caramels que la casa li
 * donarà a l'infant.
 */
package principal;

import java.util.Scanner;
import participants.Casa;
import participants.Infant;

/**
 *
 * @author Francisco París Albero
 */
public class Tracte {

    private int caramels;
    private Infant infant;
    private Casa casa;

    /*
     TODO
     CONSTRUCTOR
     Paràmetres: valor pels caramels
     Accions:
     - Assignar a l'atribut corresponent els valor passat com a paràmetre.
     - Com l'infant i la casa els afegirem un cop creat el tracte, els inicialitzarem a null.
     */
   public Tracte(int caramels){
       this.caramels = caramels;
       this.infant = null;
       this.casa = null;
   }

    /*
    TODO Mètodes accessors    
     */

    public int getCaramels() {
        return caramels;
    }

    public void setCaramels(int caramels) {
        this.caramels = caramels;
    }

    public Infant getInfant() {
        return infant;
    }

    public void setInfant(Infant infant) {
        this.infant = infant;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }
  

    /*
    TODO
    Paràmetres: cap
    Accions:
    - Demanar a l'usuari les dades per consola per crear un nou tracte. Les dades
    a demanar són les que necessita el constructor.
    Retorn: El nou tracte creat
     */
    public static Tracte addTracte() {
        Scanner DADES = new Scanner(System.in);
        System.out.println("\nEscriu les dades per nou tracte: ");
        int caramels = DADES.nextInt();
        return new Tracte(caramels);
    }

    public void showTracte() {
        System.out.println("\nLes dades del tracte són:");
        System.out.println("\nTotal de caramels: " + caramels);
        infant.showInfant();
        casa.showCasa();
    }
}
