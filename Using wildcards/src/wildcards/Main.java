package wildcards;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        //List of Buildings 
        List<Building> buildings = new ArrayList();
        buildings.add(new Building());
        buildings.add(new Building());
        printBuildings(buildings);

        //List of offices
        List<Office> offices = new ArrayList();
        offices.add(new Office());
        offices.add(new Office());
        printBuildings(offices);    //will give compile time error without wildcards

       //List of Houses
       List<House> houses = new ArrayList();
       houses.add(new House());
       houses.add(new House());
       printBuildings(houses);    //will give compile time error without wildcards

       addHouseToList(houses);
       addHouseToList(buildings);
    }

    // invariable --> "extends"
    static void printBuildings(List<? extends Building> buildings){
        for(int i = 0; i < buildings.size(); i++){
            System.out.println(buildings.get(i).toString() + " " + (i+1));
        }
        System.out.println();
    }

    //outvariable --> "super"
    static void addHouseToList(List<? super House> buildings){
        buildings.add(new House());
        System.out.println();
    }

}
