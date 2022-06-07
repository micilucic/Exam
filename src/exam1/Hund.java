package exam1;

public class Hund extends Musikant {
    protected double bellLautstaerke;

    public Hund(int anzahlBeine, Instrument instrument, double bellLautstaerke) {
        super(anzahlBeine, instrument);
        this.bellLautstaerke = bellLautstaerke;
    }

    @Override
    int verseucheRaeuber() {
        if (getInstrument().getLautstaerke() > bellLautstaerke) {
            return (int) Math.floor(getInstrument().getLautstaerke());
        } else {
            return (int) Math.floor(bellLautstaerke);
        }
    }

    @Override
    double speieleMusik() {
        return (getInstrument().getLautstaerke()+getBellLautstaerke()) / 2;
    }

    public double getBellLautstaerke() {
        return bellLautstaerke;
    }

    @Override
    public String toString() {
        return "Hund{" +
                "bellLautstaerke=" + bellLautstaerke +
                '}' + "Verscheucht: " + verseucheRaeuber() + ", Musiziert: " + speieleMusik();
    }
}
