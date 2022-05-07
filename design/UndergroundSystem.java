package design;

import javafx.util.Pair;
import java.util.HashMap;
import java.util.Map;

class UndergroundSys {

    Map<Integer, Pair<String,Integer>> checkInMap = new HashMap<>(); // uid-{stationName,time}
    Map<String,Pair<Double,Integer>> routeMap = new HashMap<>(); // routename - {totalTime,count}


    public UndergroundSys() {

    }

    public void checkIn(int id, String stationName, int t) {
        checkInMap.put(id,new Pair<>(stationName,t));
    }

    public void checkOut(int id, String stationName, int t) {

        Pair<String,Integer> pair = checkInMap.get(id);
        checkInMap.remove(id);
        String routeName = pair.getKey() + "_" + stationName;
        int totalTime = t - pair.getValue();

        Pair<Double, Integer> route = routeMap.getOrDefault(routeName, new Pair<>(0.0, 0));
        routeMap.put(routeName, new Pair<>(route.getKey() + totalTime, route.getValue() + 1));
    }

    public double getAverageTime(String startStation, String endStation) {
        String routeName = startStation + "_" + endStation;
        Pair<Double, Integer> trip = routeMap.get(routeName);
        return trip.getKey() / trip.getValue();
    }
}


class UndergroundSystem {

    public static void main(String[] args)
    {
//[45,"Leyton",3],[32,"Paradise",8],[27,"Leyton",10],[45,"Waterloo",15]

        UndergroundSys obj = new UndergroundSys();
        obj.checkIn(45,"Leyton",3);
        obj.checkIn(32,"Paradise",8);
        obj.checkIn(27,"Leyton",10);
        obj.checkIn(10, "Leyton", 3);
        obj.checkOut(10, "Paradise", 8);
        System.out.println(obj.getAverageTime("Leyton", "Paradise"));
         //double param_3 = obj.getAverageTime(startStation,endStation);
    }

}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */