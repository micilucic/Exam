package com.company;

public class Mine extends Facility{

    protected Fruit fruit;
    protected double miningDepth;
    protected RawMaterial rawMaterial;

    public Mine (double area, double heightAboveSeaLevel, Fruit fruit) {
        super(area, heightAboveSeaLevel);
        this.fruit = fruit;

    }

    @Override
    public String toString() {
        return "Mine{" +
                "heightAboveSeaLevel=" + heightAboveSeaLevel +
                ", miningDepth=" + miningDepth +
                '}';
    }

    @Override
    public double calculateProfit() {
        RawMaterial RawMaterial = null;
        if (RawMaterial == RawMaterial.LITHIUM || RawMaterial == RawMaterial.NEODYMIUM) {
            return area * 200;
        } else {
            return area * 300;
        }
    }

    @Override
    public int getNrPalms() {
        int nrPalms = 0;
        if (miningDepth > 100) {
            nrPalms = 3;
        } else if (rawMaterial == RawMaterial.TERBIUM) {
            nrPalms = 2;
        } else {
            nrPalms = 1;
        }
        return nrPalms;
    }
}
