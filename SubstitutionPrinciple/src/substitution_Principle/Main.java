package substitution_Principle;

import java.util.List;

// Liskov substitution principle is an important of an OOP because it allows you to write 
// maintainable and reusable code.

public class Main {
    public static void main(String[] args) {
        Building building = new Building();
        Office office = new Office();
        build(building);
        build(office);
    }

    static void build(Building building){
        System.out.println("Constructing a new "+ building.toString());
    }

    static void printBuildings(List<Building> buildings){
        for(int i = 0; i < buildings.size(); i++){
            System.out.println(i+1 + ": "+buildings.get(i).toString());
        }
    }
    
}
