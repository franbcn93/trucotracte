/*
 * Classe que defineix una casa. Una casa es defineix pel seu número d'inscripció i adreça.
 */
package participants;

import java.util.Scanner;

/**
 *
 * @author Francisco París Albero
 */
public class Casa {

    private int numInscripcio;
    private static int properNumInscripcio = 0;
    private String adreca;
    private boolean assignat; //A un barri

    /*
     TODO
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe menys el número d'inscripció
     i assignat.
     Accions:
     - Assignar als atributs corresponents els valors passats com a paràmetres
     - Assignar a l'atribut numInscripcio el valor de l'atribut properNumInscripcio i actualitzar
     properNumInscripcio amb el següent número d'inscripció a assignar.
     - Com quan creem una casa encara no està assignada a un barri, assignat l'inicialitzarem
     a false.
     */
    public Casa(String adreca) {
        this.numInscripcio = properNumInscripcio;
        properNumInscripcio++;
        this.adreca = adreca;
        this.assignat = false;

    }

    /*
     TODO Mètodes accessors    
     */
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
        Casa.properNumInscripcio = properNumInscripcio;
    }

    public String getAdreca() {
        return adreca;
    }

    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }

    public boolean isAssignat() {
        return assignat;
    }

    public void setAssignat(boolean assignat) {
        this.assignat = assignat;
    }

    @Override
    public String toString() {
        return "Casa{" + "numInscripcio=" + numInscripcio + ", adreca=" + adreca + ", assignat=" + assignat + '}';
    }

    /*
    TODO
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari les dades per consola per crear una nova casa. Les dades
     a demanar són les que necessita el constructor.
     - Heu de tenir en compte que l'adreça pot ser una frase, per exemple, C/Dofí, 13
     Retorn: La nova casa creada
     */
    public static Casa addCasa() {
        Scanner DADES = new Scanner(System.in);
        System.out.println("\nEscriu l'adreça de la casa: ");
        String adreca = DADES.nextLine();
        return new Casa(adreca);
    }

    /*
    TODO
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'objecte actual
     i modificar els atributs corresponents d'aquest objecte. En aquest cas no és
     pot modificar si està assignada o no a un barri, i evidentment, no es pot modificar 
     el número d'inscripció.
     - Li heu de mostrar a l'usuari el valor actual dels atributs de l'objecte
     actual, abans de modificar-los.
     Retorn: cap
     */
    public void updateCasa() {
        this.showCasa();
        Scanner DADES = new Scanner(System.in);
        System.out.println("\nEscriu l'adreça de la casa: ");
        this.adreca = DADES.nextLine();
    }

    public void showCasa() {
        this.toString();
    }

}
