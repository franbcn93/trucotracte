/*
 * Classe que defineix un barri. Un barri es defineix pel seu número d'inscripció, nom, 
 * vectors de cases i infants del barri inscrits a la nit de Halloween.
 */
package participants;

import java.util.Scanner;


/**
 *
 * @author Francisco París Albero
 */
public class Barri {
    
    private int numInscripcio;
    private static int properNumInscripcio = 0;
    private String nom;
    private Casa[] cases = new Casa[200];
    private static int posicioCases = 0; //Primera posició buida del vector cases
    private Infant[] infants = new Infant[200];
    private static int posicioInfants = 0; //Primera posició buida del vector infants    
    
    /*
     TODO
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe menys el número d'inscripció,
     els vectors i primera posició buida dels vectors.
     Accions:
     - Assignar als atributs corresponents els valors passats com a paràmetres
     - Assignar a l'atribut numInscripcio el valor de l'atribut properNumInscripcio i actualitzar
     properNumInscripcio amb el següent número d'inscripció a assignar.
     */
     public Barri(String nom){
         this.numInscripcio = properNumInscripcio;
         properNumInscripcio++;
         this.nom = nom;
         this.cases = cases;
         this.infants = infants;
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
        Barri.properNumInscripcio = properNumInscripcio;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Casa[] getCases() {
        return cases;
    }

    public void setCases(Casa[] cases) {
        this.cases = cases;
    }

    public static int getPosicioCases() {
        return posicioCases;
    }

    public static void setPosicioCases(int posicioCases) {
        Barri.posicioCases = posicioCases;
    }

    public Infant[] getInfants() {
        return infants;
    }

    public void setInfants(Infant[] infants) {
        this.infants = infants;
    }

    public static int getPosicioInfants() {
        return posicioInfants;
    }

    public static void setPosicioInfants(int posicioInfants) {
        Barri.posicioInfants = posicioInfants;
    }
    

    /*
    TODO
    Paràmetres: cap
    Accions:
    - Demanar a l'usuari les dades per consola per crear un nou barri. Les dades
    a demanar són les que necessita el constructor.
    - Heu de tenir en compte que el nom pot ser una frase, per exemple, Can Aurell
    Retorn: El nou barri creat
     */
    public static Barri addBarri() {
        Scanner DADES = new Scanner(System.in);
        System.out.println("\nEscriu el nom del barri: ");
        String nom = DADES.nextLine();
        return new Barri(nom);
    }

    /*
    TODO
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'objecte actual
     i modificar els atributs corresponents d'aquest objecte. En aquest cas no es poden
     modificar els vectors, ni la primera posició buida dels vectors i evidentment, 
     tampoc el número d'inscripció.
     - Li heu de mostrar a l'usuari el valor actual dels atributs de l'objecte
     actual, abans de modificar-los.
     Retorn: cap
     */
    public void updateBarri() {
        this.showBarri();
        Scanner DADES = new Scanner(System.in);
        System.out.println("\nEscriu les noves dades del barri: ");
        this.nom = DADES.nextLine();
    }

    /*
     TODO
     Paràmetres: infant a afegir
     Accions:
     - afegeix al vector d'infants del barri actual l'infant passat per paràmetre .
     - actualitza la posició del vector d'infants.
     Retorn: cap
     */
    public void addInfantBarri(Infant infant) {
    	//selectInfant();
    	this.numInscripcio = numInscripcio + 1;
        Scanner DADES = new Scanner(System.in);
        System.out.println("\nEscriu el nom del nou infant: ");
        //infant.setNom(DADES.nextLine());
        this.infants[numInscripcio] = DADES.nextLine();
        infants[numInscripcio].set
    }

    /*
     TODO
     Paràmetres: casa a afegir
     Accions:
     - afegeix al vector de cases del barri actual la casa passada per paràmetre .
     - actualitza la posició del vector de cases.
     Retorn: cap
     */
    public void addCasaBarri(Casa casa) {
    	this.numInscripcio = numInscripcio + 1;
    	Scanner DADES = new Scanner(System.in);
        System.out.println("\nEscriu la casa passada per paràmetre: ");
        this.cases[numInscripcio] = DADES.nextLine();
    }
    
    public int selectInfant() {
        Scanner DADES = new Scanner(System.in);
        System.out.println("\nNúmero d'inscripció de l'infant?:");
        int num = DADES.nextInt();

        boolean trobat = false;
        int pos = -1;

        for (int i = 0; i < posicioInfants && !trobat; i++) {
            if (infants[i].getNumInscripcio() == num) {
                pos = i;
                trobat = true;
            }
        }

        return pos;
    }
    
    public int selectCasa() {
        Scanner DADES = new Scanner(System.in);
        System.out.println("\nNúmero d'inscripció de la casa?:");
        int num = DADES.nextInt();

        boolean trobat = false;
        int pos = -1;

        for (int i = 0; i < posicioCases && !trobat; i++) {
            if (cases[i].getNumInscripcio() == num) {
                pos = i;
                trobat = true;
            }
        }

        return pos;
    }

    public void showBarri() {
        System.out.println("\nLes dades del barri amb número d'inscripció " + numInscripcio + " són:");
        System.out.println("\nNom:" + nom);

        System.out.println("\n\nINFANTS");
        for (int i = 0; i < posicioInfants; i++) {
            infants[i].showInfant();
        }

        System.out.println("\n\nCASES");
        for (int i = 0; i < posicioCases; i++) {
            cases[i].showCasa();
        }
        
    }

}
