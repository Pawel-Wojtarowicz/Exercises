import java.util.HashMap;
import java.util.Map;

public class Flower {

    String name;
    int height;
    boolean flag;

    public Flower(String name, int height, boolean flag) {
        this.name = name;
        this.height = height;
        this.flag = flag;
    }

    void grow(int distance) {
        if (height >= 30) {
            height = 30;
            flag = true;
        }
        else {
            height += 6 - distance;
        }
    }


    public static void main(String[] args) {
        Flower tulip = new Flower("Tulipan", 0, false);
        Flower daffodil = new Flower("Narcyz", 0, false);
        Flower violet = new Flower("Fiołek", 0, false);
        Flower rose = new Flower("Tulipan", 0, false);

        Map<Integer, Flower> flowerMap = new HashMap<>();
        flowerMap.put(2, tulip);
        flowerMap.put(3, daffodil);
        flowerMap.put(4, violet);
        flowerMap.put(5, rose);

        for(Map.Entry<Integer, Flower> entry : flowerMap.entrySet()) {
            Integer key = entry.getKey();
            Flower value = entry.getValue();
            System.out.println(value.name +  " is " + key + " away its height is "+ value.height + " --> " + value.flag);
        }

        System.out.println("\nFlowers after 10 days of growing: ");
        for(Map.Entry<Integer, Flower> entry : flowerMap.entrySet()) {
            Integer key = entry.getKey();
            Flower value = entry.getValue();
            for (int i = 0; i <9; i++) {
                value.grow(key);
            }
            System.out.println(value.name +  " is " + key + " away its height is "+ value.height + " --> " + value.flag);
        }
    }

}
