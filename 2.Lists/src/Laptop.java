import java.util.ArrayList;
import java.util.List;

public class Laptop {

    String name;
    int rating;  //rating [0-50]

    public Laptop(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    void introduce() {
        System.out.print("Hi, I'm " + name);
        if ((rating > 0) && (rating <= 9)) {
            System.out.print(" and I'm a very slow laptop.\n");
        } else if ((rating > 9) && (rating <= 24)) {
            System.out.print(" and I'm a quite decent laptop.\n");
        } else if ((rating > 24) && (rating <= 50)) {
            System.out.print(" and I'm a gaming machine\n");
        }
    }

    public static void main(String[] args) {
        List<Laptop> laptopList = new ArrayList<>();
        Laptop asus = new Laptop("ASUS NOVAGO TP370QL", 9);
        Laptop acer = new Laptop("ACER PREDATOR 21 X", 38);
        Laptop dell = new Laptop("DELL LATITUDE 7390", 14);
        Laptop alienware = new Laptop("ALIENWARE 15 R3", 29);

        laptopList.add(asus);
        laptopList.add(acer);
        laptopList.add(dell);
        laptopList.add(alienware);

        asus.introduce();
        acer.introduce();
        dell.introduce();
        alienware.introduce();

        for (Laptop laptop : laptopList) {
            if (laptop.rating > 20) {
                System.out.println(laptop.name + " is rated " + laptop.rating);
            }
        }
    }
}
