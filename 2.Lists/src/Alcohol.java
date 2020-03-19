import java.util.ArrayList;
import java.util.List;

public class Alcohol {

    String name;
    int proof;

    public Alcohol(String name, int proof) {
        this.name = name;
        this.proof = proof;
    }
    float calculatePerMil(int quantity, int weight, boolean male) {
        if (male) {
            return (((proof/100f) * quantity) / (weight * 0.73f));
        }
            else {
            return (((proof/100f) * quantity) / (weight * 0.66f));
        }
    }
    public static void main(String[] args) {
        List<Alcohol> alcoholList = new ArrayList<>();
        Alcohol beer = new Alcohol("Beer", 6);
        Alcohol vodka = new Alcohol("Vodka", 38);
        Alcohol wine = new Alcohol("Wine", 17);
        Alcohol hooch = new Alcohol("Hooch", 70);

        alcoholList.add(beer);
        alcoholList.add(vodka);
        alcoholList.add(wine);
        alcoholList.add(hooch);

        for(Alcohol alcohol : alcoholList) {
            System.out.printf("Man (80kg) will have %.2f ‰ blood-alcohol content after drinking 500ml of %s\n", alcohol.calculatePerMil(500, 80,true), alcohol.name);
            //System.out.printf("Woman (80kg) will have %.2f ‰ blood-alcohol content after drinking 100ml of %s\n", alcohol.calculatePerMil(100, 80,false), alcohol.name);
        }
    }
}
