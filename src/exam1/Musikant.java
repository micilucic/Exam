package exam1;

public abstract class Musikant {
    private int anzahlbeine;
    private Instrument instrument;

    public Musikant(int anzahlbeine, Instrument instrument) {
        this.anzahlbeine = anzahlbeine;
        this.instrument = instrument;
    }

    public int getAnzahlbeine() {
        return anzahlbeine;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    abstract int verseucheRaeuber();

    abstract double speieleMusik();

    @Override
    public String toString() {
        return "Verscheucht: " + verseucheRaeuber() + ", Musiziert: " + speieleMusik();
    }

}
