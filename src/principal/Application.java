package principal;

import java.util.Scanner;

import participants.Infant;
/**
 *
 * @author Francisco París Albero
 */
public class Application {

    static private Nit[] nits = new Nit[5];//Nitsde Halloween
    static private int posicioNits = 0; //La propera posició buida del vector nits
    static private Nit nitActual = null; //Nit seleccionada
    
    
    public static void main(String[] args) {
        menuPrincipal();
    }

    private static void menuPrincipal() {
        int opcio = 0;
        Scanner DADES = new Scanner(System.in);
        
        do {
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Gestió de nits de Halloween");
            System.out.println("\n2. Gestió de infants");
            System.out.println("\n3. Gestió de cases");
            System.out.println("\n4. Gestió de barris");

            opcio = DADES.nextInt();

            switch (opcio) {
                case 0:
                    break;
                case 1:
                    menuNits();
                    break;
                case 2:
                    if (nitActual != null) {
                        menuInfants();
                    } else {
                        System.out.println("\nPrimer s'ha de seleccionar la nití en el menú de nits de Halloween");
                    }
                    break;
                case 3:
                    if (nitActual != null) {
                        menuCases();
                    } else {
                        System.out.println("\nPrimer s'ha de seleccionar la nití en el menú de nits de Halloween");
                    }
                    break;
                case 4:
                    if (nitActual != null) {
                        menuBarris();
                    } else {
                        System.out.println("\nPrimer s'ha de seleccionar la nití en el menú de nits de Halloween");
                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);
    }
    
    public static void menuNits() {
        int opcio = 0;
        Scanner DADES = new Scanner(System.in);

        do {
            int pos = -1;
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Crear");
            System.out.println("\n2. Seleccionar");
            System.out.println("\n3. Modificar");
            System.out.println("\n4. LListar nits");
            System.out.println("\n5. Jugar");

            opcio = DADES.nextInt();

            switch (opcio) {
                case 0:
                    break;
                case 1:
                    nits[posicioNits] = Nit.addNit();
                    posicioNits++;
                    break;
                case 2:
                    pos = selectNit();
                    if (pos >= 0) {
                        nitActual = nits[pos];
                    } else {
                        System.out.println("\nNo existeix aquesta nit");
                    }
                    break;
                case 3:
                    pos = selectNit();
                    if (pos >= 0) {
                        nits[pos].updateNit();
                    } else {
                        System.out.println("\nNo existeix aquesta nit");
                    }
                    break;
                case 4:
                    for (int i = 0; i < posicioNits; i++) {
                        nits[i].showNit();
                    }
                    break;
                case 5:
                    if (nitActual != null) {
                        nitActual.play();
                    } else {
                        System.out.println("\nPrimer s'ha de seleccionar la nit en aquest menú");
                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);
    }

    /*
     TODO Heu de desenvolupar el menú infants amb les opcions que podeu veure.
     Nota: penseu que quan arribem aquí, la propietat nitActual no és null
     
     Opció 0. Sortir -->         Sortim del menú. 
     Opció 1. Alta -->           Crea un infant en la nit actual. Penseu que Nit sap crear infants.
     Opció 2. Modificar -->      Permet modificar un infant que ha d'existir en la nit actual
     (per comprovar l'existència a la classe Nit tenim un mètode que ens ajuda)
     Opció 3. Llistar infants-->Imprimeix les dades dels infants de la nit actual
        
     A més, heu de fer un bucle per tornar a mostrar el menú sempre que no es premi l'opció 0 de sortida
     Recomanacions:
     - estructura de control switch case per bifurcar les opcions
     - si no s'ha introduït cap opció de les de la llista, s'ha de mostrar el missatge
     "S'ha de seleccionar una opció correcta del menú."
     - definiu una variable int opcio;
     Nota important: 
     no controlem que l'usuari introdueixi una opció numèrica, doncs això ho farem amb la
     tècnica de les excepcions que veurem més endavant
     */
    public static void menuInfants() {
        int opcio = 0;
        Scanner DADES = new Scanner(System.in);
       do {
            int pos = -1;
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Alta");
            System.out.println("\n2. Modificar");
            System.out.println("\n3. Llistar infants");

            opcio = DADES.nextInt();

            switch (opcio) {
                case 0:
                    break;
                case 1:
                    Infant nouInfant = Infant.addInfant();
                    break;
                case 2:
                    pos = selectNit();
                    if (pos >= 0) {
                        infantActual = nits[pos];
                    } else {
                        System.out.println("\nNo existeix aquesta nit");
                    }
                    break;
                case 3:
                    pos = selectNit();
                    if (pos >= 0) {
                        nits[pos].updateNit();
                    } else {
                        System.out.println("\nNo existeix aquesta nit");
                    }
                    break;
                case 4:
                    for (int i = 0; i < posicioNits; i++) {
                        nits[i].showNit();
                    }
                    break;
                case 5:
                    if (nitActual != null) {
                        nitActual.play();
                    } else {
                        System.out.println("\nPrimer s'ha de seleccionar la nit en aquest menú");
                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);
    }

    /*
     TODO Heu de desenvolupar el menú de les cases amb les opcions que podeu veure.
     Nota: penseu que quan arribem aquí, la propietat nitActual no és null
     
     Opció 0. Sortir -->         Sortim del menú. 
     Opció 1. Alta -->           Crea una casa en la nit actual. Penseu que Nit sap crear cases 
     amb entrada lliure       
     Opció 2. Modificar -->      Permet modificar una casa que ha d'existir en la nit actual
     (per comprovar l'existència a la classe Nit tenim un mètode que ens ajuda)
     Opció 3. Llistar cases-->Imprimeix les dades de les cases de la nit actual
        
     A més, heu de fer un bucle per tornar a mostrar el menú sempre que no es premi l'opció 0 de sortida
     Recomanacions:
     - estructura de control switch case per bifurcar les opcions
     - si no s'ha introduït cap opció de les de la llista, s'ha de mostrar el missatge
     "S'ha de seleccionar una opció correcta del menú."
     - definiu una variable int opcio;
     Nota important: 
     no controlem que l'usuari introdueixi una opció numèrica, doncs això ho farem amb la
     tècnica de les excepcions que veurem més endavant
     */
    public static void menuCases() {
       
    }

    /*
     TODO Heu de desenvolupar el menú barris amb les opcions que podeu veure.
     Nota: penseu que quan arribem aquí, la propietat nitActual no és null
     
     Opció 0. Sortir -->         Sortim del menú. 
     Opció 1. Alta -->           Crea un barri en la nit actual. Penseu que Nit sap crear barris.
     Opció 2. Afegir infant --> Afegeix un infant al vector d'infants del barri, però penseu que Nit sap fer-ho
     Opció 3. Afegir casa --> Afegeix una casa al vector de cases del barri, però penseu que Nit sap fer-ho
     Opció 4. Llistar barris-->Imprimeix les dades dels barris de la nit actual
        
     A més, heu de fer un bucle per tornar a mostrar el menú sempre que no es premi l'opció 0 de sortida
     Recomanacions:
     - estructura de control switch case per bifurcar les opcions
     - si no s'ha introduït cap opció de les de la llista, s'ha de mostrar el missatge
     "S'ha de seleccionar una opció correcta del menú."
     - per a l'entrada de dades, millor fer servir la classe Scanner
     - definiu una variable int opcio;
     Nota important: 
     no controlem que l'usuari introdueixi una opció numèrica, doncs això ho farem amb la
     tècnica de les excepcions que veurem més endavant
     */
    public static void menuBarris() {
        
    }

    public static Integer selectNit() {

        Scanner DADES = new Scanner(System.in);
        System.out.println("\nAny de la nit?:");
        int any = DADES.nextInt();

        boolean trobat = false;
        int pos = -1;

        for (int i = 0; i < posicioNits && !trobat; i++) {
            if (nits[i].getAny() == any) {
                pos = i;
                trobat = true;
            }
        }

        return pos;
    }

}
