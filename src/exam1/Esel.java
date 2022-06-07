package exam1;

public class Esel extends Musikant{

    protected double trittKraft;

    public Esel(int anzahlBeine, Instrument instrument, double trittkKaft) {
        super(anzahlBeine, instrument);
        this.trittKraft = trittkKaft;
    }
    @Override
    int verseucheRaeuber() {
        return ((int) Math.floor(trittKraft) * getAnzahlbeine());
    }

    @Override
    double speieleMusik() {
        return getInstrument().getLautstaerke();
    }

    public double getTrittKraft() {
        return trittKraft;
    }

    @Override
    public String toString() {
        return "Esel{" +
                "trittKraft=" + trittKraft +
                '}' + "Verscheucht: " + verseucheRaeuber() + ", Musiziert: " + speieleMusik();
    }
}
