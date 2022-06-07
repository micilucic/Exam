package exam1;

import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Qaurtett {
    private ArrayList<Musikant> musikants = new ArrayList<>();

    public Qaurtett (ArrayList musikants) {
        this.musikants = musikants;
        musikants = null;
    }
    public void add(Musikant m) {
        musikants.add(m);
    }
    public boolean isQuartett() {
            if (musikants.size() == 4) {
                return true;
            }
        return false;
    }
    public int gemeinsamRaeuberVerscheucht() {
        int sum = 0;
        while (musikants.iterator().hasNext()) {
           for (Musikant m : musikants) {
               sum = sum + m.verseucheRaeuber();
           }
        }
        return sum;
    }
    public double durchschnittlicheLautstaerke() {
        double avrg = 0;
        for (Musikant m : musikants) {
            avrg = avrg + m.speieleMusik();
        }
        return avrg/ musikants.size();
    }
    HashMap<Integer, Integer> getAnzahlMusikantenMitBeinAnzahl() {
        HashMap<Integer, Integer> beinAnzahl = new HashMap<>();
        int count = 1;
        for (Musikant m : musikants) {
            if (!beinAnzahl.containsKey(m.getAnzahlbeine())){
                beinAnzahl.put(m.getAnzahlbeine(),1);
            } else {
                beinAnzahl.put(m.getAnzahlbeine(),count++);
            }
        }
        return beinAnzahl;
    }
    public void printLautstaerkeAbsteigend() {
        Collections.sort(musikants, new LautstaerkeComparator());
        System.out.println(musikants);
    }
}
