import java.util.HashMap;
import java.util.Map;

public class MedicamentNote {

    String name;
    int quantity;
    double price;

    public MedicamentNote(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "* " + name + ", which costs " + price + " and needs to be taken on";
    }

    public static void main(String[] args) {

        Map<Integer, MedicamentNote> medicamentNoteMap = new HashMap<>();
        MedicamentNote pyralgine = new MedicamentNote("Pyralgine", 1,12);
        MedicamentNote depakine = new MedicamentNote("Depakine", 1,30);
        MedicamentNote vitaminC = new MedicamentNote("Vitamine C", 1,8);
        MedicamentNote calcium = new MedicamentNote("Calcium", 1,15);

        medicamentNoteMap.put(1,pyralgine);
        medicamentNoteMap.put(3,depakine);
        medicamentNoteMap.put(5,vitaminC);
        medicamentNoteMap.put(10,calcium);


        System.out.println("All medicaments: ");
        for (Map.Entry<Integer, MedicamentNote> entry : medicamentNoteMap.entrySet()) {
            Integer key = entry.getKey();
            MedicamentNote value = entry.getValue();
                System.out.println(value + " " + key + ".");
            }
        System.out.println("Medicaments more expensive than 10: ");
        for (Map.Entry<Integer, MedicamentNote> entry : medicamentNoteMap.entrySet()) {
            Integer key = entry.getKey();
            MedicamentNote value = entry.getValue();
            if (value.price > 10) {
                System.out.println(value + " " + key + ".");
            }
        }
        System.out.print("Remember to take pills on: ");
        for (Integer key : medicamentNoteMap.keySet()) {
            System.out.print(key + ", ");
        }
        System.out.print("\nAnnual total for pills is: ");
        double sum = 0.0;
        int totalPrice = 0;
        for (MedicamentNote value : medicamentNoteMap.values()) {
            sum = sum + value.price * 12;
        }
        totalPrice = (int) sum;
        System.out.print(totalPrice + ".");
    }
}
