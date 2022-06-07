package com.company;

public class Hotel extends Facility{
    protected int stars;
    protected int maxNrGuests;
    protected int nrGuests;

    public Hotel (double area, double heightAboveSeaLevel, int stars, int maxNrGuests, int nrGuests) {
        super(area, heightAboveSeaLevel);
        this.stars = stars;
        this.maxNrGuests = maxNrGuests;
        this.nrGuests = nrGuests;

        if ((stars < 1) && (stars > 3)) {
            this.stars = 1;
        } else {
            this.stars = stars;
        }
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "nrGuests=" + nrGuests +
                '}';
    }

    public int getStars() {
        return stars;
    }

    public int getMaxNrGuests() {
        return maxNrGuests;
    }

    public int getNrGuests() {
        return nrGuests;
    }

    @Override
    public double calculateProfit() {
        double profit = 0;
       if (stars==1) {
           profit = ((60*nrGuests) - (0.2*maxNrGuests)) * 30;
       } else if (stars==2) {
           profit = ((75*nrGuests) - (0.3 * maxNrGuests)) * 30;
       } else if (stars==3) {
           profit = ((120*nrGuests) - (0.4 * maxNrGuests)) * 30;
       }
       return profit;
    }

    @Override
    public int getNrPalms() {
        if ((double)nrGuests / (double) maxNrGuests >= 0.85) {
            return 3;
        } else if ((double)nrGuests / (double) maxNrGuests >= 0.5 && (double)nrGuests / (double) maxNrGuests < 0.85) {
            return 2;
        } else {
            return 1;
        }
    }
}
