/*
 * Classe que defineix una nit de Halloween. Una nit de Halloween es defineix pel 
 * seu any de celebració, vectors de barris, cases i infants inscrits a la nit de Halloween.
 */
package principal;

import participants.Barri;
import participants.Casa;
import participants.Infant;
import java.util.Scanner;

/**
 *
 * @author Francisco París Albero
 */
public class Nit {
    
    private int any;
    private Barri[] barris = new Barri[10];
    private static int posicioBarris = 0; //Priemra posició buida del vector barris
    private Casa[] cases = new Casa[2000];
    private static int posicioCases = 0; //Priemra posició buida del vector cases
    private Infant[] infants = new Infant[2000];
    private static int posicioInfants = 0; //Priemra posició buida del vector infants
    private Truc[] trucs = new Truc[2000];
    private static int posicioTrucs = 0; //Priemra posició buida del vector trucs
    private Tracte[] tractes = new Tracte[2000];
    private static int posicioTractes = 0; //Priemra posició buida del vector tractes

    /*
     TODO
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe menys els vectors i 
     primera posició buida dels vectors.
     Accions:
     - Assignar als atributs corresponents els valors passats com a paràmetres
     */
    public Nit(int any){
        this.any = any;
        this.barris = barris;
        this.cases = cases;
        this.infants = infants;
        this.trucs = trucs;
        this.tractes = tractes;
    }
    /*
     TODO Mètodes accessors    
     */
    
    public Nit() {
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public Barri[] getBarris() {
        return barris;
    }

    public void setBarris(Barri[] barris) {
        this.barris = barris;
    }

    public static int getPosicioBarris() {
        return posicioBarris;
    }

    public static void setPosicioBarris(int posicioBarris) {
        Nit.posicioBarris = posicioBarris;
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
        Nit.posicioCases = posicioCases;
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
        Nit.posicioInfants = posicioInfants;
    }

    public Truc[] getTrucs() {
        return trucs;
    }

    public void setTrucs(Truc[] trucs) {
        this.trucs = trucs;
    }

    public static int getPosicioTrucs() {
        return posicioTrucs;
    }

    public static void setPosicioTrucs(int posicioTrucs) {
        Nit.posicioTrucs = posicioTrucs;
    }

    public Tracte[] getTractes() {
        return tractes;
    }

    public void setTractes(Tracte[] tractes) {
        this.tractes = tractes;
    }

    public static int getPosicioTractes() {
        return posicioTractes;
    }

    public static void setPosicioTractes(int posicioTractes) {
        Nit.posicioTractes = posicioTractes;
    }
    

    /*
    TODO
    Paràmetres: cap
    Accions:
    - Demanar a l'usuari les dades per consola per crear una nova nit. Les dades
    a demanar són les que necessita el constructor.
    Retorn: La nova nit creada
     */
    public static Nit addNit() {
        Scanner DADES = new Scanner(System.in);
        System.out.println("\nEscriu l'any d'una nova nit: ");
        int any = DADES.nextInt();
        return new Nit(any);
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
    public void updateNit() {
        showNit();
        Scanner DADES = new Scanner(System.in);
        System.out.println("\nEscriu l'any novament d'una nova nit: ");
        any = DADES.nextInt();
        setAny(any);
    }
    
    public void showNit() {
        System.out.println("\nLa nit de Halloween de l'any " + any);
        
        System.out.println("\n\nBARRIS");
        for (int i = 0; i < posicioBarris; i++) {
            System.out.println("\nBarri "+barris[i].getNom()+" amb número d'inscripció " + barris[i].getNumInscripcio());
        }
        
        System.out.println("\n\nINFANTS");
        for (int i = 0; i < posicioInfants; i++) {
            infants[i].showInfant();
        }

        System.out.println("\n\nCASES");
        for (int i = 0; i < posicioCases; i++) {
            cases[i].showCasa();
        }
        
        System.out.println("\n\nTRACTES");
        for (int i = 0; i < posicioTractes; i++) {
            tractes[i].showTracte();
        }

        System.out.println("\n\nTRUCS");
        for (int i = 0; i < posicioTrucs; i++) {
            trucs[i].showTruc();
        }
    }

    /*
     INFANT
     */
    /*
     TODO
     Paràmetres: cap
     Accions:
     - afegeix un nou infant al vector d'infants d'aquesta nit (l'objecte actual). 
     Per afegir-lo heu de fer servir el mètode de la classe Infant pertinent.
     - actualitza la posició del vector d'infants.
     Retorn: cap
     */
    public void addInfant() {
        infants[posicioInfants] = Infant.addInfant();
        posicioInfants++;
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

    /*
     CASA
     */
    /*
     TODO
     Paràmetres: cap
     Accions:
     - afegeix una nova casa al vector de cases d'aquesta nit (l'objecte actual). 
     Per afegir-la heu de fer servir el mètode de la classe Casa pertinent.
     - actualitza la posició del vector de cases.
     Retorn: cap
     */
    public void addCasa() {
       Casa.addCasa();
       selectCasa();
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

    /*
     BARRI
     */
    /*
     TODO
     Paràmetres: cap
     Accions:
     - afegeix un nou barri al vector de barris d'aquesta nit (l'objecte actual). 
     Per afegir-lo heu de fer servir el mètode de la classe Barri pertinent.
     - actualitza la posició del vector de barris.
     Retorn: cap
     */
    public void addBarri() {
        Barri.addBarri();
        selectBarri();
    }
    
    public int selectBarri() {
        Scanner DADES = new Scanner(System.in);
        System.out.println("\nNúmero d'inscripció del barri?:");
        int num = DADES.nextInt();
        
        boolean trobat = false;
        int pos = -1;
        
        for (int i = 0; i < posicioBarris && !trobat; i++) {
            if (barris[i].getNumInscripcio() == num) {
                pos = i;
                trobat = true;
            }
        }
        
        return pos;
    }
    
    public void addInfantBarri() {
        Barri barriSel = null;
        int pos = selectBarri();
        
        if (pos >= 0) {
            
            barriSel = this.getBarris()[pos];
            
            pos = selectInfant();
            
            if (pos >= 0) {
                if (!getInfants()[pos].isAssignat()) {
                    barriSel.addInfantBarri(getInfants()[pos]);
                    getInfants()[pos].setAssignat(true);
                } else {
                    System.out.println("\nL'infant ja està assignat");
                }
            } else {
                System.out.println("\nNo existeix aquest infant");
            }
        } else {
            System.out.println("\nNo existeix aquest barri");
        }
    }
    
    public void addCasaBarri() {
        Barri barriSel = null;
        int pos = selectBarri();
        
        if (pos >= 0) {
            
            barriSel = this.getBarris()[pos];
            
            pos = selectCasa();
            
            if (pos >= 0) {
                if (!getCases()[pos].isAssignat()) {
                    barriSel.addCasaBarri(getCases()[pos]);
                    getCases()[pos].setAssignat(true);
                } else {
                    System.out.println("\nLa casa ja està assignada");
                }
            } else {
                System.out.println("\nNo existeix aquesta casa");
            }
        } else {
            System.out.println("\nNo existeix aquest barri");
        }
    }
    
    /*
     TODO
     Paràmetres: cap
    
     Accions: Es tracta de jugar a truc o tracte, per això heu de fer el següent:
    
     - Seleccionar el barri on voleu que es realitzi el joc, per això he de fer 
     servir el mètode escaient d'aquesta classe. Si el barri seleccionat no existeix,
     se li mostrarà a l'usuari el missatge "\nNo existeix aquest barri". Si existeix:
       -Seleccionar la casa i l'infant del barri que participaran en el joc. Per
       això fareu servir els mètodes escaients de la classe Barri. Si l'infant seleccionat 
       no existeix, se li mostrarà a l'usuari el missatge "\nNo existeix aquest infant" i
       si la que no existeix és la casa, se li mostrarà el missatge "\nNo existeix aquesta casa".
       Si existeixen l'infant i la casa:
         - Li demanarà a l'usuari si vol jugar a truc o tracte. Si és truc, ha d'introduir
         1 i si és tracte 2.
         - Si l'opció seleccionada és truc: 
           - Afegeix un nou truc al vector de trucs d'aquesta nit (l'objecte actual), assignant-li
           l'infant i casa seleccionats.
           - Actualitza la posició del vector de trucs.
         - Si l'opció seleccionada és tracte: 
           - Afegeix un nou tracte al vector de tractes d'aquesta nit (l'objecte actual), assignant-li
           l'infant i casa seleccionats.
           - Actualitza el cistell de l'infant seleccionat, mitjançant el mètode escaient de la classe
           Infant.
           - Actualitza la posició del vector de tractes.
     
     Retorn: cap
     */
    public void play() {
        Scanner DADES = new Scanner(System.in);
        System.out.println("\nSeleccionar el barri on voleu que es realitzi el joc: ");
        String nomBarri = DADES.nextLine();
        for(int a = 0; a<barris.length; a++){
            if((nomBarri)==(barris[a].getNom())){
                System.out.println("\nSeleccionar ara l'adreça de la casa a realitzar el joc: ");
                String nomCasa = DADES.nextLine();               
                for(int b = 0; b<barris.length; b++){
                    if((nomCasa)==(cases[b].getAdreca())){
                        System.out.println("\nI finalment seleccionar l'infant: ");
                        String nomInfant = DADES.nextLine();
                        for(int c = 0; c<barris.length; c++){
                            if((nomInfant)==(infants[b].getNom())){
                                System.out.println("\nsi vol jugar a truc o tracte. Si és truc, ha d'introduir" +
                                " 1 i si és tracte 2: ");
                                int opcio = DADES.nextInt();
                                String descripcio = "descripcio";
                                if((opcio)==(1)){
                                    this.addInfant()= nomInfant;
                                    Truc.addTruc();
                                    setInfant(nomInfant);
                                    setNom(nomCasa);
                                }
                                else if((opcio)==(2)){
                                    Tracte.addTracte();
                                }
                                else{
                                    System.out.println("\nAquesta opció no es correcta. ");
                                }
                            }                               
                        }
                    }
                    else{
                        System.out.println("\nNo existeix aquesta casa");
                    }
                }              
            }
            else{
                System.out.println("\nNo existeix aquest barri");
            }
        }     
    }   
}
