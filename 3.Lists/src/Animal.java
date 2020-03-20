import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Animal {

    String name;
    String voice;
    boolean isLoud;

    public Animal(String name, String voice, boolean isLoud) {
        this.name = name;
        this.voice = voice;
        this.isLoud = isLoud;
    }
    void speak(int times){
        int i = 0;
        while (i < times) {
            if (isLoud) {
                System.out.print(voice.toUpperCase() + " ");
                i++;
            }
            else {
                System.out.print(voice + " ");
                i++;
            }
        }
    }


    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        Random random = new Random();
        Animal bigDog = new Animal("Big dog", "woof",true);
        Animal cow = new Animal("Cow","moo",true);
        Animal smalDog = new Animal("Small dog", "woof", false);
        Animal frog = new Animal("Frog", "croak", false);

        animalList.add(bigDog);
        animalList.add(cow);
        animalList.add(smalDog);
        animalList.add(frog);

        System.out.println("Loud Animals: ");
        for (Animal animal: animalList) {
            if (animal.isLoud) {
                System.out.print(animal.name +" : ");
                animal.speak(random.nextInt(5));
                System.out.println();
            }
        }
        System.out.println("\nSilent animals: ");
        for (Animal animal : animalList) {
            if (!animal.isLoud) {
                System.out.print(animal.name+ " : ");
                animal.speak(random.nextInt(5));
                System.out.println();
            }
        }

    }
}
