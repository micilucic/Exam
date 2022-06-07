package com.company;

public class Plantation extends Facility{

    protected Fruit fruit;

    public Plantation (double area, double heightAboveSeaLevel, Fruit fruit) {
        super(area, heightAboveSeaLevel);
        this.fruit = fruit;
    }


    @Override
    public String toString() {
        return "Plantation{" +
                "fruit=" + fruit +
                '}';
    }

    @Override
    public double calculateProfit() {
        double profit = 0;
        if (fruit == Fruit.BANANA) {
            profit = profit + (area *(30 * 1));
        } else if (fruit == Fruit.COCONUT) {
            profit = profit + (area * (2.5 * 15));
        } else if (fruit == Fruit.MANGO && heightAboveSeaLevel < 150) {
            profit = profit + (area * (15 * 3));
        } else if (fruit == Fruit.MANGO && heightAboveSeaLevel > 150) {
            profit = profit + (area * (10 * 3));
        }
        return profit;
    }

    @Override
    public int getNrPalms() {
       if (area <= 20) {
           return 3;
       } else if (fruit == Fruit.MANGO) {
           return 2;
       }
       return 1;
    }
}
