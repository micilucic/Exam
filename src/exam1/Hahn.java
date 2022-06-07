package exam1;

public class Hahn extends Musikant {
    protected int flugWeite;

    public Hahn(int anzahlBeine, Instrument instrument, int flugWeite) {
        super(anzahlBeine, instrument);
        this.flugWeite = flugWeite;
    }

    @Override
    int verseucheRaeuber() {
        int anzahlRaeuber = 0;
       if (getFlugWeite() < 2) {
           anzahlRaeuber = (int) Math.floor(getInstrument().getLautstaerke());
       } else if (getFlugWeite()==2) {
           anzahlRaeuber = 6;
       } else if (getFlugWeite()==3) {
           anzahlRaeuber = 5;
       } else if (getFlugWeite()==4) {
           anzahlRaeuber = 4;
       } else if (getFlugWeite()==5) {
           anzahlRaeuber = 3;
       } else if (getFlugWeite()==6) {
           anzahlRaeuber = 2;
       } else if (getFlugWeite() > 6) {
           anzahlRaeuber = 1;
       }
       return anzahlRaeuber;
    }

    @Override
    double speieleMusik() {
        return ((getInstrument().getLautstaerke() + 2) / getFlugWeite());
    }

    public int getFlugWeite() {
        return flugWeite;
    }

    @Override
    public String toString() {
        return "Hahn{" +
                "flugWeite=" + flugWeite +
                '}' + "Verscheucht: " + verseucheRaeuber() + ", Musiziert: " + speieleMusik();
    }
}
