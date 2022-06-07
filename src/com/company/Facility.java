package com.company;

public abstract class Facility implements PalmRating{
    double area;
    double heightAboveSeaLevel;

    public Facility (double area, double heightAboveSeaLevel) {
        this.area = area;
        this.heightAboveSeaLevel = heightAboveSeaLevel;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getHeightAboveSeaLevel() {
        return heightAboveSeaLevel;
    }

    public void setHeightAboveSeaLevel(double heightAboveSeaLevel) {
        this.heightAboveSeaLevel = heightAboveSeaLevel;
    }

    public abstract double calculateProfit();

    @Override
    public String toString() {
        return "Facility{" +
                "area=" + area +
                ", heightAboveSeaLevel=" + heightAboveSeaLevel +
                '}';
    }
}

