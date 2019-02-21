/*
 * Classe que defineix un infant. Un infant es defineix pel seu número d'inscripció, nom, 
 * adreça, cisteli si està assignat o no a un barri. El cistell representa le quantitat de caramels que va recollint l'infant al
 * llarg de la nit. Hem de tenir en compte que el cistell té una capacitat de 100 caramels.
 */
package participants;

import java.util.Scanner;

/**
 *
 * @author Francisco París Albero
 */
public class Infant {

    private int numInscripcio;
    private static int properNumInscripcio = 0;
    private boolean assignat; //A un barri
    private String nom;
    private String adreca;
    private int cistell;

    /*
     TODO
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe menys el número d'inscripció,
     el cistell i assignat.
     Accions:
     - Assignar als atributs corresponents els valors passats com a paràmetres
     - Assignar a l'atribut numInscripcio el valor de l'atribut properNumInscripcio i actualitzar
     properNumInscripcio amb el següent número d'inscripció a assignar.
     - Com quan inscrivim a un infant, el cistell està buit, l'inicialitzarem a 0.
     - Com quan creem un infant encara no està assignat a un barri, assignat l'inicialitzarem
     a false.
     */
    public Infant(String nom, String adreca) {
        this.nom = nom;
        this.adreca = adreca;
        this.numInscripcio = properNumInscripcio;
        properNumInscripcio++;
        this.cistell = 0;
        this.assignat = false;
    }

    public int getNumInscripcio() {
        return numInscripcio;

    }

    public void setNumInscripcio(int numInscripcio) {
        this.numInscripcio = numInscripcio;
    }

    public static int getProperNumInscripcio() {
        return properNumInscripcio;
    }

    public static void setProperNumInscripcio(int properNumInscripcio) {
        Infant.properNumInscripcio = properNumInscripcio;
    }

    public boolean isAssignat() {
        return assignat;
    }

    public void setAssignat(boolean assignat) {
        this.assignat = assignat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdreca() {
        return adreca;
    }

    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }

    public int getCistell() {
        return cistell;
    }

    /*
    TODO Mètodes accessors    
     */
    public void setCistell(int cistell) {
        this.cistell = cistell;
    }

    @Override
    public String toString() {
        return "Infant{" + "numInscripcio=" + numInscripcio + ", assignat=" + assignat + ", nom=" + nom + 
                ", adreca=" + adreca + ", cistell=" + cistell + '}';
    }

    /*
    TODO
    Paràmetres: cap
    Accions:
    - Demanar a l'usuari les dades per consola per crear un nou infant. Les dades
    a demanar són les que necessita el constructor.
    - Heu de tenir en compte que el nom i/o l'adreça poden ser una frase, per exemple,
    Paula Gómez o C/Dofí, 13
    Retorn: El nou infant creat
     */
    public static Infant addInfant() {
        Scanner lector = new Scanner(System.in);
        System.out.println("\nEscriu el nom de l'infant: ");
        String nom = lector.nextLine();
        System.out.println("\nEscriu l'adreça de l'infant: ");
        String adreca = lector.nextLine();
        return new Infant(nom, adreca);
    }

    /*
    TODO
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'objecte actual
     i modificar els atributs corresponents d'aquest objecte. En aquest cas no es pot
     modificar el cistell, ni si està assignat o no a un barri i evidentment, tampoc el número d'inscripció.
     - Li heu de mostrar a l'usuari el valor actual dels atributs de l'objecte
     actual, abans de modificar-los.
     Retorn: cap
     */
    public void updateInfant() {
        this.showInfant();
        Scanner DADES = new Scanner(System.in);
        System.out.println("\nEscriu el nou nom de l'infant: ");
        this.nom = DADES.nextLine();
        System.out.println("\nEscriu la nova adreça de l'infant: ");
        this.adreca = DADES.nextLine();
    }

    /*
    TODO
     Paràmetres: quantitat de caramels a afegir al cistell
     Accions:
     - Afegirà la quantitat de caramels passada per paràmetre al cistell, si la 
     quantitat de caramels que hi ha al cistell més la quantitat de caramels passada
     per paràmetre és menor o igual a la capacitat màxima del cistell (100 caramels).
     En cas contrari, no els afegirem i avisarem a l'usuari amb el missatge "Cistell ple".
     - Hem de tenir en compte que la quantitat de caramels ha de ser positiva.
     Retorn: cap
     */
    public void addCaramelCistell(int caramels) {
        if (caramels > 0) {
            if ((this.cistell + caramels) <= 100) {
                this.cistell += caramels;
            } else {
                System.out.println("Cistell ple");
            }
        }else{
            System.out.println("La quantitat no pot ser negativa.");
        }

    }

    public void showInfant() {
        this.toString();
    }
}
