//Scrivere una funzione che restituisca un hashset riempito
//Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
//Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
//Svuotare l'hashset, verificarlo e stampare il risultato

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<String> magazzino = creazioneHashSet();

        HashSet<String> verificaArt = new HashSet<>();
        verificaArt.add("Cuffie");
        verificaArt.add("Tastiera");
        verificaArt.add("Mouse");

        Iterator<String> iterator = magazzino.iterator();
        while(iterator.hasNext()) {
            String articolo = iterator.next();
            if(verificaArt.contains(articolo)) {
                iterator.remove();
            }
        }

        //verifica se il magazzino è vuoto.
        boolean verificaMagazzino = magazzino.isEmpty();

        System.out.println("Il magazzino è vuoto? " + verificaMagazzino);
    }

    public static HashSet<String> creazioneHashSet() {
        HashSet<String> magazzinoAgg = new HashSet<>();

        magazzinoAgg.add("Cuffie");
        magazzinoAgg.add("Tastiera");
        magazzinoAgg.add("Mouse");
        magazzinoAgg.add("Monitor");

        return magazzinoAgg;
    }
}