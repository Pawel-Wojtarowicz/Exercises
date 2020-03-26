public class Dog extends Animal implements Canine {


    public Dog(String name, float weight) {
        super(name, weight);
    }

    void sitPretty(){
        System.out.println(name + " sits pretty.");
    }

    @Override
    public void bark() {
        System.out.println("bark, bark, bark");
    }

    @Override
    void introduce() {
        super.introduce();
        System.out.print(" : I'm a "+ getClass().getName() + ". My name is "+ name + ". I weight " + weight +" kg.\n");
    }
}
