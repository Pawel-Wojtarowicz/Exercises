import java.util.HashSet;
import java.util.Set;

public class Traveler {

    String name;
    Set<String> visitedCitiesList = new HashSet<>();


    public Traveler(String name) {
        this.name = name;
    }

    void visit(String city) {
        visitedCitiesList.add(city);
    }

    @Override
    public String toString() {
        String result = "Traveler " + name + " has already been in:\n";
        for (String city:visitedCitiesList) {
            result +="* "+city+"\n";
        }
        return result;
    }

    public static void main(String[] args) {
        Traveler Robert = new Traveler("Robert Makłowicz");

        Robert.visit("Wrocław");
        Robert.visit("Warszawa");
        Robert.visit("Opole");
        Robert.visit("Wrocław");
        Robert.visit("Krakow");
        Robert.visit("Toruń");
        Robert.visit("Toruń");
        Robert.visit("Wrocław");
        Robert.visit("Poznań");

        System.out.println(Robert);
    }
}
