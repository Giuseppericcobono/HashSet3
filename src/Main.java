//Scrivere una funzione che restituisca un hashset riempito
//Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
//Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
//Svuotare l'hashset, verificarlo e stampare il risultato

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<String> magazzino = creazioneHashSet();

        // Creazione di un oggetto HashSet dello stesso tipo e popolazione
        HashSet<String> verificaArt = new HashSet<>();
        verificaArt.add("Cuffie");
        verificaArt.add("Tastiera");
        verificaArt.add("Mouse");

        // Scorrere il set e rimuovere gli elementi che sono uguali all'oggetto creato
        Iterator<String> iterator = magazzino.iterator();
        while(iterator.hasNext()) {
            String articolo = iterator.next();
            if(verificaArt.contains(articolo)) {
                iterator.remove();
            }
        }

        // Verifica se l'HashSet è vuoto
        boolean verificaMagazzino = magazzino.isEmpty();

        // Stampa il risultato
        System.out.println("Il magazzino è vuoto? " + verificaMagazzino);
        System.out.println("Il magazzino contiene: " + magazzino);
    }

    public static HashSet<String> creazioneHashSet() {
        HashSet<String> magazzinoAgg = new HashSet<>();

        // Aggiungi elementi all'HashSet
        magazzinoAgg.add("Cuffie");
        magazzinoAgg.add("Tastiera");
        magazzinoAgg.add("Mouse");
        magazzinoAgg.add("Monitor");

        return magazzinoAgg;
    }
}