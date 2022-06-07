package com.company;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Island {
    public ArrayList<Facility> facilities = new ArrayList<>();
    public double facilityArea;

    public Island (ArrayList facilities, double facilityArea) {
        this.facilities = facilities;
        this.facilityArea = facilityArea;

        facilities = null;
        facilityArea = 0;
    }

    public void add(Facility f) {
        facilities.add(f);
        facilityArea = facilityArea + 1;
    }

    public Facility findHighestProfit () {
        int index = 0;
        for (int i = 0; i <= facilities.size(); i++) {
            if (facilities.get(i).calculateProfit() > facilities.get(index).calculateProfit()) {
                index = i;
            }
        }
        return facilities.get(index);
    }

    public HashMap<String, Integer> groupFacilities() {
        HashMap<String, Integer> newGroup = new HashMap<>();
        /*for (int i = 0; i < facilities.size(); i++) {
            if (facilities.get(i).calculateProfit() < 1000) {
                newGroup.put("Low", i);
                i++;
            } else if (facilities.get(i).calculateProfit() > 1000 && facilities.get(i).calculateProfit() < 10000) {
                newGroup.put("Average", i);
                i++;
            } else {
                newGroup.put("High", i);
                i++;
            }
        }
        return newGroup;
   */

        for (Facility f : facilities) {
            if  (f.calculateProfit() < 1000) {
                if (!newGroup.containsKey("Low")) {
                    newGroup.put("Low", 1);
                } else {
                    newGroup.put("Low", 1 + newGroup.get("Low"));
                }
            } else if (f.calculateProfit() > 1000 && f.calculateProfit() < 10000) {
                if (!newGroup.containsKey("Average")) {
                    newGroup.put("Average", 1);
                } else {
                    newGroup.put("Average", 1 + newGroup.get("Average"));
                }
            } else if (!newGroup.containsKey("High")) {
                newGroup.put("High", 1);
                } else {
                newGroup.put("High", 1 + newGroup.get("High"));
            }
        }
        return newGroup;
    }

    public ArrayList<Facility> risingWaterSimulation(double waterLevel) {
        ArrayList<Facility> sinkingFacilities = new ArrayList<>();
        for (Facility f : facilities) {
            if (f.getHeightAboveSeaLevel() < waterLevel) {
                sinkingFacilities.add(f);
            }
        }
        return sinkingFacilities;
    }
    public void sortedPrint() {
        Collections.sort(facilities, new IslandComparator());
    }
}
