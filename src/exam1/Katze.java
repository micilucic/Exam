package exam1;

import com.company.Island;

public class Katze extends Musikant {
    protected double kratzKraft;

    public Katze (int anzahlBeine, Instrument instrument, double kratzKraft) {
        super(anzahlBeine, instrument);
        this.kratzKraft = kratzKraft;
    }

    @Override
    int verseucheRaeuber() {
        if (getAnzahlbeine() == 4) {
          return (int) Math.floor(getKratzKraft());
        } if (getAnzahlbeine() == 3) {
            return (int) Math.floor(getKratzKraft()/2);
        } else {
            return 1;
        }
    }

    @Override
    double speieleMusik() {
        return getInstrument().getLautstaerke();
    }

    public double getKratzKraft() {
        return kratzKraft;
    }

    @Override
    public String toString() {
        return "Katze{" +
                "kratzKraft=" + kratzKraft +
                '}' + "Verscheucht: " + verseucheRaeuber() + ", Musiziert: " + speieleMusik();
    }
}
