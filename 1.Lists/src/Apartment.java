import java.util.LinkedList;
import java.util.List;

public class Apartment {

    private String city;
    private float area;
    private float price;

    public Apartment(String city, float area, float price) {
        this.city = city;
        this.area = area;
        this.price = price;
    }

    float getFullPrice() {
        return (float) (0.95*(area * price));
    }

    public static void main(String[] args) {
        Apartment warsaw = new Apartment("Warsaw", 40.5f, 9400);
        Apartment wroclaw = new Apartment("Wrocław", 63.8f, 6200);
        Apartment krakow = new Apartment("Kraków", 91f, 8000);

        List<Apartment> ApartmentList = new LinkedList<>();
        ApartmentList.add(warsaw);
        ApartmentList.add(wroclaw);
        ApartmentList.add(krakow);

        for (Apartment apartment : ApartmentList) {
            System.out.println("Apartment in: " + apartment.city + " costs: " + apartment.getFullPrice());
        }
    }
}
