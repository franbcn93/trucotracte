/*
 * Classe que defineix l'opció de joc truc. Un truc es defineix per l'infant
 * i la casa que formaran part del truc, i el nom i la dsecripció del truc.
 */
package principal;

import java.util.Scanner;
import participants.Casa;
import participants.Infant;

/**
 *
 * @author Francisco París Albero
 */
public class Truc {

    private String nom;
    private String descripcio;
    private Infant infant;
    private Casa casa;

    /*
     TODO
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe menys l'infant i la casa.
     Accions:
     - Assignar als atributs corresponents els valors passats com a paràmetres.
     - Com l'infant i la casa els afegirem un cop creat el tracte, els inicialitzarem a null.
     */
   public Truc(String nom, String descripcio){
       this.nom = nom;
       this.descripcio = descripcio;
       this.infant = null;
       this.casa = null;
   }

    /*
    TODO Mètodes accessors    
     */

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
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
    - Heu de tenir en compte que el nom o descripció pot ser una frase, per exemple,
    Donar un ensurt.
    Retorn: El nou truc creat
     */
    public static Truc addTruc() {
        Scanner DADES = new Scanner(System.in);
        System.out.println("\nEscriu el teu nom: ");
        String nom = DADES.nextLine();
        System.out.println("\nEscriu la descripció de l'acció: ");
        String descripcio = DADES.nextLine();
        return new Truc(nom, descripcio);
    }

    public void showTruc() {
        System.out.println("\nLes dades del truc són:");
        System.out.println("\nNom: " + nom);
        System.out.println("\nDescripció: " + descripcio);
        infant.showInfant();
        casa.showCasa();
    }
}
