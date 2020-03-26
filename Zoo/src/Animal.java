import java.util.ArrayList;
import java.util.List;

public abstract class Animal {

    static int counter = 1;
    int id;
    String name;
    float weight;

    public Animal(String name, float weight) {
        this.id = counter;
        counter++;
        this.name = name;
        this.weight = weight;
    }
    void introduce(){
        System.out.print(id);
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Bear yogi = new Bear("Yogi",200,40);
        Tiger jataka = new Tiger("Jataka",150,25);
        Wolf howler = new Wolf("Howler",70,40);
        Dog scooby = new Dog("Scooby",30);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(yogi);
        animalList.add(jataka);
        animalList.add(howler);
        animalList.add(scooby);

        for(Animal animal : animalList) {
            animal.introduce();
        }

        List<Canine> canineList = new ArrayList<>();
        canineList.add(howler);
        canineList.add(scooby);

        for (int i = 0; i <canineList.size(); i++) {
            System.out.print("My name is " + canineList.get(i).toString() + " and I am barking: ");
            canineList.get(i).bark();
        }
        scooby.sitPretty();
    }
}
